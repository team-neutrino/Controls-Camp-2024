package frc.robot.commands;

import com.ctre.phoenix6.hardware.Pigeon2;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.util.SubsystemContainer;

public class ShooterDefaultCommand extends Command {

    private ShooterSubsystem m_shooterSubsystem;
    private Pigeon2 m_pigeon2;

    public ShooterDefaultCommand() {
        m_shooterSubsystem = SubsystemContainer.shooterSubsystem;
        m_pigeon2 = new Pigeon2(0, "3928Allen");
        addRequirements(m_shooterSubsystem);
    }

    public void initialize() {
        m_shooterSubsystem.setVoltage(0.0);
    }

    @Override
    public void execute() {
        // m_shooterSubsystem.defaultShooter();
        System.out.println(m_pigeon2.getPitch().getValue());
        if(m_pigeon2.getPitch().getValue() > 45) {
            m_shooterSubsystem.setVoltage(0.9);
        }
        else{
            m_shooterSubsystem.setVoltage(0.0);
        }

    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}