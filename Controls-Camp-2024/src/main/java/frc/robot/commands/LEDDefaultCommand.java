package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Constants.LEDConstants.States;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.util.SubsystemContainer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.XboxController;

public class LEDDefaultCommand extends Command {

  private LEDSubsystem m_LEDSubsystem;
  private IntakeSubsystem m_IntakeSubsystem;

  public LEDDefaultCommand() {
    m_LEDSubsystem = SubsystemContainer.LEDSubsystem;
    m_IntakeSubsystem = SubsystemContainer.intakeSubsystem;
    addRequirements(m_LEDSubsystem);
  }

  // Remember that the methods are coming from a different file so you'll need to
  // access by doing m_LEDSubystem.method_name
  @Override
  public void initialize() {
    // Step 4
    // Run each method one at a time, i.e. don't have both setToRed and setToGreen
    // initialize at the same time.
  }

  @Override
  public void execute() {
    // Step 7
    // To access the beam break, you'll have to call isBeamBrokenIntake() method (already made)
    // from the Intake Subsystem file the same way you did for the setTo methods.

  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}