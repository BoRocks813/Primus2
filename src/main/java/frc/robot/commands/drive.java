// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.chassis;

public class drive extends CommandBase {

  public double fwdspd;
  public double trnamt;

  public chassis m_Chassis;

  /** Creates a new drive. */
  public drive(chassis chassis) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_Chassis = chassis;

    addRequirements(m_Chassis);
  }

// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    RobotContainer.getController().setRumble(RumbleType.kLeftRumble, 1);
    RobotContainer.getController().setRumble(RumbleType.kRightRumble, 1);

    fwdspd = -RobotContainer.getController().getRawAxis(Constants.LEFT_STICK_UD_AXIS) * Constants.fwd_sense;
    trnamt = RobotContainer.getController().getRawAxis(Constants.RIGHT_TRIGGER_LR_AXIS) * Constants.trn_sense;


    m_Chassis.MoveRobot(fwdspd, trnamt);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
