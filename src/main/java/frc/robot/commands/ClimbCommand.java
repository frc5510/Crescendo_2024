package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSubsystem;

public class ClimbCommand extends Command{
   /*
    * The Climbers
    */
    private ClimberSubsystem climberSubsystem;

    /*
     * The variable input values for each side
     */
    private double lSpeed, rSpeed;

    public ClimbCommand(ClimberSubsystem climberSubsystem, double rSpeed, 
    double lSpeed) {
        this.climberSubsystem = climberSubsystem;
        this.lSpeed = lSpeed;
        this.rSpeed = rSpeed;
    }

    @Override
    public void execute() {
        climberSubsystem.leftClimb(lSpeed);
        climberSubsystem.rightClimb(rSpeed);
    }
}
