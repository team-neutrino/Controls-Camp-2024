// now let's look at the isFinished. We want this command to end when 3 things are true:
// the shooter subsystem is going faster than our threshold RPM
// the intake subsystem has a note ready
// the arm is in position

package frc.robot.commands.GamePieceCommands;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class ShootManualCommand extends GamePieceCommand {
    private double m_angle;
    private double m_rpm;
    private double m_thresholdrpm;
    private CommandXboxController m_Controller;
    double i = 0;

    public ShootManualCommand(double p_angle, double p_rpm, double p_thresholdrpm, CommandXboxController p_Controller) {
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
        m_intakeSubsystem.runIndexFeed();
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false; // Right now, all this will do is run forever!!
    }
}