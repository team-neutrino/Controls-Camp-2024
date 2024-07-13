package frc.robot.subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkFlex;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystemPractice1Key extends SubsystemBase {
  private CANSparkFlex m_armMotor;
  private AbsoluteEncoder m_armEncoder;
  private double m_targetAngle = 0.0;
  private boolean m_inPosition;
  private Debouncer m_armDebouncer;
  private Timer m_timer;

  public ArmSubsystemPractice1Key() {
  }

  @Override
  public void periodic() {
  }
}