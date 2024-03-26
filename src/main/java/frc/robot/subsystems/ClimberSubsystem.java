package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
    /**
     * The Motors for Climbers, wired via PWM
     */
    private Spark leftHook, rightHook;

    /*
     * The Climber!
     */

    public ClimberSubsystem() { 
        /*
         * Initialize the motors!! w/ respective PWM ports
         */
        this.leftHook = new Spark(4);
        this.rightHook = new Spark(7);

        /*
         * I think the right side needs to be inverted so yeah.
         */
        this.rightHook.setInverted(true);
    }
    /*
     * I think this is the right thing to do; set the speeds once more!
     */
    public void leftClimb(double speed) {
        leftHook.set(speed);
    }

    public void rightClimb(double speed) {
        rightHook.set(speed);
    }
}
