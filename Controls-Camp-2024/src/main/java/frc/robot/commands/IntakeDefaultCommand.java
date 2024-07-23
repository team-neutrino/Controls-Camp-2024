package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.util.SubsystemContainer;

public class IntakeDefaultCommand extends Command {
    IntakeSubsystem m_intakeSubsystem;
    LEDSubsystem m_LEDSubsystem;

    public IntakeDefaultCommand() {
        m_intakeSubsystem = SubsystemContainer.intakeSubsystem;
        m_LEDSubsystem = SubsystemContainer.LEDSubsystem;
        addRequirements(m_intakeSubsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        if(m_LEDSubsystem.isLEDYellow()){
            wait(1000);
            m_intakeSubsystem.runIntake();
            m_intakeSubsystem.runIndexFeed(); 
        }
        else{
            m_intakeSubsystem.stopIntake();
            m_intakeSubsystem.stopIndex();
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
