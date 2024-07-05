package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Constants.LEDConstants.States;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.SwerveSubsystem;
import frc.robot.util.SubsystemContainer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class LEDDefaultCommand extends Command {

  private LEDSubsystem m_LEDSubsystem;
  private ShooterSubsystem m_shooterSubsystem;
  private ArmSubsystem m_armSubsystem;
  private IntakeSubsystem m_intakeSubsystem;
  private SwerveSubsystem m_swerveSubsystem;
  private XboxController m_xboxController;

  public LEDDefaultCommand(CommandXboxController p_controller) {
    m_LEDSubsystem = SubsystemContainer.LEDSubsystem;
    m_shooterSubsystem = SubsystemContainer.shooterSubsystem;
    m_armSubsystem = SubsystemContainer.armSubsystem;
    m_intakeSubsystem = SubsystemContainer.intakeSubsystem;
    m_swerveSubsystem = SubsystemContainer.swerveSubsystem;
    m_xboxController = p_controller.getHID();

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