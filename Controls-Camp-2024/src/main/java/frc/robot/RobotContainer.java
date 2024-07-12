// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.IntakeDefaultCommand;
import frc.robot.subsystems.IntakeSubsystem;

public class RobotContainer {

  CommandXboxController m_buttonsController = new CommandXboxController(0);

  IntakeDefaultCommand m_intakeDefaultCommand = new IntakeDefaultCommand();
  IntakeSubsystem m_intakeSubsystem = new IntakeSubsystem();

  public RobotContainer() {
    configureBindings();

    DataLogManager.start();

    DriverStation.startDataLog(DataLogManager.getLog());
  }

  private void configureBindings() {
    m_intakeSubsystem.setDefaultCommand(m_intakeDefaultCommand);

    // Intake buttons

  }

  public void teleopperiodic() {
  }
}
