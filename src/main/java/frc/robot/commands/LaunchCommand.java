package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LauncherSubsystem;

public class LaunchCommand extends Command {
    /*
     * The Launcher that uses this command
     */
    private LauncherSubsystem launcherSubsystem;

    /*
     * The input value for the speed of the motors
     */
    private boolean rightBumper, leftBumper;
    /*
     * I don't know why but "bumper" in "private boolean bumper"
     * and "launcherSubsystem" in "private LauncherSubsystem launcherSubsystem"
     * error if the automatically created getter and setter are not there.
     * I don't know why it doesn't work with just the 
     * LaunchCommand
     * 
     * Nevermind I just realized that I needed to use it. 
     */

    public LaunchCommand(LauncherSubsystem launcherSubsystem, boolean rightBumper, 
    boolean leftBumper) {
        this.launcherSubsystem = launcherSubsystem;
        this.rightBumper = rightBumper; 
        this.leftBumper = leftBumper;
    }
    @Override
    public void execute() { 
        launcherSubsystem.Launch(rightBumper);
        launcherSubsystem.Intake(leftBumper);
    }
}
