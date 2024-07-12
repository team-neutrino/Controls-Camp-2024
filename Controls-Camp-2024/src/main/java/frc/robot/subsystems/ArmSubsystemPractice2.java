// This time, we're going to focus on the constructor. Fill in the constructor so all of our member variables are properly
// set up!
// If you don't like our variable names, feel free to reference the ones you used in the last problem!

public class ArmSubsystem extends SubsystemBase {
  private CANSparkFlex m_armMotor;
  private AbsoluteEncoder m_armEncoder;
  private double m_targetAngle;
  private boolean m_inPosition;
  private Debouncer m_armDebouncer;
  private Timer m_timer;

  public ArmSubsystem() {
    m_armMotor = ; //Hint: your parameters are MotorIDs.Arm and MotorType.kBrushless
    m_armDebouncer = ; //Hint: your parameters are ArmConstants.DEBOUNCE_TIME and DebounceType.kRising
    m_targetAngle = ; //Pick a good number please
    m_timer = ;
  }

  @Override
  public void periodic() {}
}
