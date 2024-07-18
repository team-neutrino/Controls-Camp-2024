package frc.robot.subsystems;

// This time, we're going to focus on the constructor. Fill in the constructor so all of our member variables are properly
// set up!
// If you don't like our variable names, feel free to reference the ones you used in the last problem!

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkFlex;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystemPractice2 extends SubsystemBase {
  private CANSparkFlex m_armMotor;
  private AbsoluteEncoder m_armEncoder;
  private double m_targetAngle;
  private boolean m_inPosition;
  private Debouncer m_armDebouncer;
  private Timer m_timer;

  public ArmSubsystemPractice2() {
    // m_armMotor = ; Hint: your parameters are MotorIDs.ARM, which gives you the
    // arm motor id, and MotorType.kBrushless, which is the type of motor
    // m_armDebouncer = ; Hint: your parameters are ArmConstants.DEBOUNCE_TIME and
    // DebounceType.kRising
    // m_targetAngle = ; Pick a reasonable number please
    // m_timer = ;
  }

  @Override
  public void periodic() {
  }
}
