package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Constants.LEDConstants.States;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.util.SubsystemContainer;
import edu.wpi.first.wpilibj2.command.Command;

public class LEDDefaultCommand extends Command {

  private LEDSubsystem m_LEDSubsystem;

  public LEDDefaultCommand(CommandXboxController p_controller) {
    m_LEDSubsystem = SubsystemContainer.LEDSubsystem;
    addRequirements(m_LEDSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}