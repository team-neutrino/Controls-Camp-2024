package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkPIDController;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkBase.ControlType;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.MotorIDs;
import frc.robot.Constants.ShooterConstants;
import frc.robot.Constants.ShooterSpeeds;
import frc.robot.util.SubsystemContainer;
import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.math.filter.Debouncer.DebounceType;

public class ShooterSubsystem extends SubsystemBase {
  private CANSparkMax m_shooterMotor = new CANSparkMax(MotorIDs.SHOOTER_MOTOR, MotorType.kBrushless);
  private RelativeEncoder m_shooterEncoder;
  private SparkPIDController m_pidController;
  private Debouncer m_shootDebouncer = new Debouncer(1.0);

  private ControlType m_shootControlType;
  private double m_targetVoltage;
  private double m_targetRPM;

  private boolean m_atSpeed;

  public ShooterSubsystem() {
    m_shooterEncoder = m_shooterMotor.getEncoder();
    m_pidController = m_shooterMotor.getPIDController();
    m_pidController.setFeedbackDevice(m_shooterEncoder);
    m_shooterMotor.setIdleMode(IdleMode.kCoast);
    m_shooterMotor.setInverted(false);


    m_shooterMotor.burnFlash();
  }

  // public void defaultShooter() {
  //   setVoltage(SubsystemContainer.intakeSubsystem.() ? ShooterSpeeds.INITIAL_SHOOTER_SPEED : 0.0);
  // }

  public boolean approveShoot() {
    return m_atSpeed;
  }

  public boolean aboveRPM(double p_rpm) {
    return (getShooterRPM() > p_rpm);
  }

  public double getShooterRPM() {
    return m_shooterEncoder.getVelocity();
  }

  public double getTargetRPM() {
    return m_targetRPM;
  }

  public void setTargetRPM(double p_targetRPM) {
    m_targetRPM = p_targetRPM;
    m_shootControlType = ControlType.kVelocity;
  }

  public void setVoltage(double voltage) {
    m_targetVoltage = voltage;
    m_shootControlType = ControlType.kVoltage;
  }

  @Override
  public void periodic() {
    if (m_shootControlType == ControlType.kVelocity) {
      m_pidController.setReference(m_targetRPM, CANSparkBase.ControlType.kVelocity);
    } else {
      m_shooterMotor.setVoltage(m_targetVoltage);
    }

    m_atSpeed = m_shootDebouncer
        .calculate(Math.abs(getTargetRPM() - getShooterRPM()) <= ShooterConstants.RPM_ERROR_THRESHOLD);
  }
}