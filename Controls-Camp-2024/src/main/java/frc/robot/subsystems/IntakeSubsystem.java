package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel;

import frc.robot.Constants.DigitalConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.MotorIDs;

public class IntakeSubsystem extends SubsystemBase {

    private double indexVoltage = 0.0;
    private double intakeVoltage = 0.0;
    private boolean m_intakeBeam = false;

    private CANSparkMax m_intakeMotor = new CANSparkMax(MotorIDs.INTAKE_MOTOR, CANSparkLowLevel.MotorType.kBrushless);

    private CANSparkMax m_indexMotor = new CANSparkMax(MotorIDs.INDEX_MOTOR, CANSparkLowLevel.MotorType.kBrushless);
    private DigitalInput m_intakeBeamBreak = new DigitalInput(DigitalConstants.INTAKE_MOTOR_BEAMBREAK);

    public IntakeSubsystem() {

        m_intakeMotor.setIdleMode(IdleMode.kCoast);
        m_intakeMotor.burnFlash();
        m_indexMotor.burnFlash();
    }

    public void defaultIntake() {
        stopIntake();
        stopIndex();
    }

    public double getIndexVoltage() {
        return indexVoltage;
    }

    public boolean isBeamBrokenIntake() {
        return m_intakeBeam;
    }

    public void runIndexShoot() {
        indexVoltage = IntakeConstants.INDEX_MOTOR_VOLTAGE_SHOOT;
    }

    public void runIntake() {
        if (isBeamBrokenIntake()) {
            stopIntake();
            runIndexShoot();
        } else {

            intakeVoltage = IntakeConstants.INTAKE_MOTOR_VOLTAGE;
        }
    }

    public void stopIndex() {
        indexVoltage = 0;
    }

    public void stopIntake() {
        intakeVoltage = 0;
    }

    @Override
    public void periodic() {
        m_indexMotor.set(indexVoltage);
        m_intakeMotor.set(intakeVoltage);
        m_intakeBeam = !m_intakeBeamBreak.get();
    }

    public boolean isNoteReady() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNoteReady'");
    }

}