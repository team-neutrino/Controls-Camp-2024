// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ShooterNoShoot;
import frc.robot.commands.ShooterShootsPewPew;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new SH. */
  CANSparkMax m_shooter0 = new CANSparkMax(30, MotorType.kBrushless);
  CANSparkMax m_shooter1 = new CANSparkMax(31, MotorType.kBrushless);

  public ShooterSubsystem() {
  }

  public void StopMotor() {
    m_shooter0.stopMotor();
    m_shooter1.stopMotor();
  }

  public void SpinMotor() {
    m_shooter0.set(0.5);
    m_shooter1.set(0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
