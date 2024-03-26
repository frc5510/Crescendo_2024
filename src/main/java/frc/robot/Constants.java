// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

    Spark fleft = new Spark(0);
    Spark bleft = new Spark(1);
    Spark bright = new Spark(2);
    Spark fright = new Spark(3);
    Spark lhook = new Spark(4); 
    Spark rhook = new Spark(7);
    Spark wheel1 = new Spark(5);
    Spark wheel2 = new Spark(6);
  }
}
