package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.ClimbCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.LaunchCommand;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.LauncherSubsystem;

/**
 * This is where our control of the robot is managed, generally.
 */
public class RobotContainer {
  /**
   * The origin of the drivetrain. It will be passed around to any command that needs it.
   */
  private DriveSubsystem driveSubsystem;
  /*
   * The other subsystems
   */
  private LauncherSubsystem launcherSubsystem;
  private ClimberSubsystem climberSubsystem;
  /**
   * The main driver controller.
   */
  //private CommandXboxController controller;
  private XboxController controller;

  //Defining Global variables for custom controls
  private boolean rBumper = controller.getRawButton(6);
  private boolean lBumper = controller.getRawButton(5);
  private double rTrigger = controller.getRawAxis(3);
  private double lTrigger = controller.getRawAxis(2);

  /**
   * Here is where we initialize everything that the robot needs at startup.
   */
  public RobotContainer() {
    //this.controller = new CommandXboxController(0);
    this.controller = new XboxController(0);
    this.driveSubsystem = new DriveSubsystem();
    this.launcherSubsystem = new LauncherSubsystem();
    this.climberSubsystem = new ClimberSubsystem();

    /*
     * Here, we create a command that will persist and run continuously
     * throughout the lifetime of the subsystem.
     */
    DriveCommand mainDriveCommand = new DriveCommand(driveSubsystem, this::inputX, this::inputY, this::rotationZ);
    this.driveSubsystem.setDefaultCommand(mainDriveCommand);
    
    configureBindings();
     
    LaunchCommand mainLaunchCommand = new LaunchCommand(launcherSubsystem, rBumper, lBumper);
    ClimbCommand mainClimbCommand = new ClimbCommand(climberSubsystem, rTrigger, lTrigger);
  }

  /**
   * This is a default input deadband to combat stick drift.
   */
  static double INPUT_DEADBAND = 0.3;

  /**
   * Get the controller's joystick value that corresponds to forward-backward
   * motion.
   * 
   * A deadband of {@link #INPUT_DEADBAND} is applied to combat stick drift.
   * 
   * @return the left joystick value (UP-DOWN) from 0.0 to 1.0
   */
  private double inputX() {
    return MathUtil.applyDeadband(controller.getRawAxis(1), INPUT_DEADBAND);
  }

  /**
   * Get the controller's joystick value that corresponds to left-right
   * motion.
   * 
   * A deadband of {@link #INPUT_DEADBAND} is applied to combat stick drift.
   * 
   * @return the left joystick value (LEFT-RIGHT) from 0.0 to 1.0
   */
  private double inputY() {
    return MathUtil.applyDeadband(-controller.getRawAxis(0), INPUT_DEADBAND);
  }

  /**
   * Get the controller's joystick value that corresponds to robot rotation.
   * 
   * A deadband of {@link #INPUT_DEADBAND} is applied to combat stick drift.
   * 
   * @return the right joystick value (LEFT-RIGHT) from 0.0 to 1.0
   */
  private double rotationZ() {
    return MathUtil.applyDeadband(-controller.getRawAxis(4), INPUT_DEADBAND);
  }
  
  
  /**
   * Here is where we will add special button bindings.
   *
   **/
  public void configureBindings() {
  //   boolean rBumper = controller.getRawButton(6);
  //   boolean lBumper = controller.getRawButton(5);
  //   double rTrigger = controller.getRawAxis(3);
  //   double lTrigger = controller.getRawAxis(2);
    rBumper = controller.getRawButton(6);
    lBumper = controller.getRawButton(5);
    rTrigger = controller.getRawAxis(3);
    lTrigger = controller.getRawAxis(2);
  }
    // todo!

  /**
   * This is where we implement autonomous functionality.
   * 
   * @return the {@link Command} to be ran in autonomous mode.
   */
  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}