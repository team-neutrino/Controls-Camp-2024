package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootCommandPractice2Key extends CommandBase {
    private double m_angle;
    private double m_rpm;
    private double m_thresholdrpm;
    private CommandXboxController m_Controller;
    private ArmSubsystem m_armSubsystem;
    private ShooterSubsystem m_shooterSubsystem;
    private IntakeSubsystem m_intakeSubsystem;
    double i = 0;

    public ShootCommandPractice2Key(double p_angle, double p_rpm, double p_thresholdrpm,
            CommandXboxController p_Controller) {
        m_angle = p_angle;
        m_rpm = p_rpm;
        m_thresholdrpm = p_thresholdrpm;
        m_Controller = p_Controller;
    }

    public void initialize() {
        m_armSubsystem.commandStart();
    }

    @Override
    public void execute() {
        m_armSubsystem.setArmReferenceAngle(m_angle);
        m_shooterSubsystem.setTargetRPM(m_rpm);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return m_Controller.getHID().getLeftBumper()
                && m_shooterSubsystem.aboveRPM(m_thresholdrpm)
                && m_intakeSubsystem.isNoteReady()
                && m_armSubsystem.getInPosition();
    }
}