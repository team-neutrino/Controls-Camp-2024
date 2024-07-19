// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.IntakeDefaultCommand;
import frc.robot.commands.LEDefaultCommand;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;

public class RobotContainer {

  CommandXboxController m_buttonsController = new CommandXboxController(0);

  IntakeDefaultCommand m_intakeDefaultCommand;
  IntakeSubsystem m_intakeSubsystem;

  LEDSubsystem m_LEDSubsystem;
  LEDefaultcommand m_LEDefaultCommand;

  public RobotContainer() {
    m_intakeDefaultCommand = new IntakeDefaultCommand();
    m_intakeSubsystem = new IntakeSubsystem();

    m_LEDSubsystem = new LEDSubsystem(0);
    m_LEDefaultCommand = new LEDefaultCommand();

    configureBindings();
  }

  private void configureBindings() {
    m_intakeSubsystem.setDefaultCommand(m_intakeDefaultCommand);
    m_LEDSubsystem.setDefaultCommand(m_LEDefaultCommand);

    // Intake buttons

  }

  public void teleopperiodic() {
  }
}
