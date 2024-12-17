// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.ShooterNoShoot;
import frc.robot.commands.ShooterShootsPewPew;

public class Shooter extends SubsystemBase {
  /** Creates a new SH. */
  CANSparkMax m_motor = new CANSparkMax(30, MotorType.kBrushless);

  public Shooter() {
  }

  public void StopMoter() {
    m_motor.stopMotor();
  }

  public void SpinMoter() {
    m_motor.set(0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
