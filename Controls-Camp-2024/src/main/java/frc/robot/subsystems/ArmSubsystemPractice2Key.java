import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.math.filter.Debouncer.DebounceType;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorIDs;

public class ArmSubsystemPractice2Key extends SubsystemBase {
  private CANSparkFlex m_armMotor;
  private AbsoluteEncoder m_armEncoder;
  private double m_targetAngle;
  private boolean m_inPosition;
  private Debouncer m_armDebouncer;
  private Timer m_timer;

  public ArmSubsystemPractice2Key() {
    m_armMotor = new CANSparkFlex(MotorIDs.ARM, MotorType.kBrushless);
    m_armDebouncer = new Debouncer(ArmConstants.DEBOUNCE_TIME, DebounceType.kRising);
    m_targetAngle = Constants.ArmConstants.INTAKE_POSE;
    m_timer = new Timer();
  }

  @Override
  public void periodic() {
  }
}