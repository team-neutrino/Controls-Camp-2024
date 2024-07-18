package frc.robot.commands;

//This exercise focuses on the execute section of the command- look for more green comments for instructions

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.ArmSubsystem;

public class ShootCommandPractice1 extends CommandBase {
    private double m_angle;
    private double m_rpm;
    private double m_thresholdrpm;
    private CommandXboxController m_Controller;
    private ArmSubsystem m_armSubsystem;

    public ShootCommandPractice1(double p_angle, double p_rpm, double p_thresholdrpm) {
        m_armSubsystem = new ArmSubsystem();
        m_angle = p_angle;
        m_rpm = p_rpm;
        m_thresholdrpm = p_thresholdrpm;
    }

    public void initialize() {
        m_armSubsystem.commandStart();
    }

    @Override
    public void execute() {
        // call a method from the arm subsystem to set the reference angle (use the
        // member variable!)
        // call a method from the shooter subsystem to set the target RPM
        // call a method from the intake subsystem to run the index to feed in notes
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}