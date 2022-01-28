// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int lf_motor_port = 1;
    public static final int lb_motor_port = 2;
    public static final int rf_motor_port = 3;
    public static final int rb_motor_port = 4;


    public static final int controller_port = 0;

    public static final int LEFT_STICK_UD_AXIS = 1;
    public static final int LEFT_STICK_LR_AXIS = 0;
    public static final int RIGHT_TRIGGER_UD_AXIS = 5;
    public static final int RIGHT_TRIGGER_LR_AXIS = 4;

    public static final double fwd_sense = 1;
    public static final double trn_sense = 1;
}
