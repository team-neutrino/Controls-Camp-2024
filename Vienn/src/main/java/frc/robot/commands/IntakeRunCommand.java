// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeRunCommand extends Command {
  private static final double HALF_SPEED_FORWARD = 0.5;
  /** Creates a new Shootershootspewpew. */
  private IntakeSubsystem m_intake;

  public IntakeRunCommand(IntakeSubsystem p_intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_intake = p_intake;
    addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_intake.SpinMotor(HALF_SPEED_FORWARD);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
