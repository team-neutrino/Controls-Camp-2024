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

  // Remember that it's coming from a different file so you'll need to access by doing m_LEDSubystem.method_name
  @Override
  public void execute() {
    // This is where you'll put the methods you made in to run
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}