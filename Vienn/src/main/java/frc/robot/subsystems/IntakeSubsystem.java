// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.IntakeDefaultCommand;
import frc.robot.commands.IntakeRunCommand;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new SH. */
  CANSparkMax m_intake0 = new CANSparkMax(20, MotorType.kBrushless);
  CANSparkMax m_intake1 = new CANSparkMax(21, MotorType.kBrushless);
  CANSparkMax m_index0 = new CANSparkMax(22, MotorType.kBrushless);
  CANSparkMax m_index1 = new CANSparkMax(23, MotorType.kBrushless);

  public IntakeSubsystem() {
  }

  public void StopMotor() {
    m_intake0.stopMotor();
    m_intake1.stopMotor();
    m_index0.stopMotor();
    m_index1.stopMotor();
  }

  public void SpinMotor(double speed) {
    m_intake0.set(speed);
    m_intake1.set(speed);
    m_index0.set(speed);
    m_index1.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
