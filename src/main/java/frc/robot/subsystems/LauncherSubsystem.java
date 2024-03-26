package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubsystem extends SubsystemBase {
    /*
     * Motors!
     */
    private Spark top, bottom;

    /*
     * Create the launcher(?)
     */
    public LauncherSubsystem() {
        /*
         * Initialize the motors
         */
        this.top = new Spark(5);
        this.bottom = new Spark(6);

    }

    /*
     * I think this is the right thing to do, set the speeds and such. 
     */
    public void Launch(boolean bumper) { 
        top.set(1.0);
        bottom.set(1.0);
    }

    public void Intake(boolean bumper) {
        top.set(-1.0);
        bottom.set(-1.0);
    }

}
