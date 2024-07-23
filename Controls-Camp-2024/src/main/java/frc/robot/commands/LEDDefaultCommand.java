package frc.robot.commands;

import frc.robot.Constants;

import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.util.SubsystemContainer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class LEDDefaultCommand extends Command {

  private LEDSubsystem m_LEDSubsystem;
  private ShooterSubsystem m_shooterSubsystem;
  private IntakeSubsystem m_intakeSubsystem;
  private XboxController m_xboxController;

  public LEDDefaultCommand(CommandXboxController p_controller) {
    m_LEDSubsystem = SubsystemContainer.LEDSubsystem;
    m_shooterSubsystem = SubsystemContainer.shooterSubsystem;
    m_intakeSubsystem = SubsystemContainer.intakeSubsystem;
    m_xboxController = p_controller.getHID();

    addRequirements(m_LEDSubsystem);
  }

  @Override
  public void initialize() {
  if(m_intakeSubsystem.isBeamBrokenIntake()){
    m_LEDSubsystem.setToRed();
  }
  else {
    m_LEDSubsystem.setToBlue();
  }
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