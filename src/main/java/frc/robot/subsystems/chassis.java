// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class chassis extends SubsystemBase {

  private final CANSparkMax r_motor0;
  // private final CANSparkMax r_motor1;
  private final CANSparkMax l_motor0;
  // private final CANSparkMax l_motor1;

  // private final SpeedControllerGroup r_side;
  // private final SpeedControllerGroup l_side;

  private DifferentialDrive drive;

  /** Creates a new chassis. */
  public chassis() {

    r_motor0 = new CANSparkMax(Constants.rf_motor_port, MotorType.kBrushed);
    // r_motor1 = new CANSparkMax(Constants.rb_motor_port, MotorType.kBrushed);
    l_motor0 = new CANSparkMax(Constants.lf_motor_port, MotorType.kBrushed);
    // l_motor1 = new CANSparkMax(Constants.lb_motor_port, MotorType.kBrushed);

    // l_side = new SpeedControllerGroup(l_motor0, l_motor1);
    // r_side = new SpeedControllerGroup(r_motor0, r_motor1);

    // r_side.setInverted(false);

    drive = new DifferentialDrive(l_motor0, r_motor0);
  }

  public void MoveRobot(double fwdspd, double trnamt) {

  drive.curvatureDrive(fwdspd, trnamt, true);

  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
