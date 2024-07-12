public class ArmSubsystem extends SubsystemBase {
    private CANSparkFlex m_armMotor;
    private AbsoluteEncoder m_armEncoder;
    private double m_targetAngle;
    private boolean m_inPosition;
    private Debouncer m_armDebouncer;
    private Timer m_timer;
  
    public ArmSubsystem() {
      m_armMotor = new CANSparkFlex(MotorIDs.Arm, MotorType.kBrushless);
      m_armDebouncer = new Debouncer(ArmConstants.DEBOUNCE_TIME, DebounceType.kRising);
      m_targetAngle = Constants.ArmConstants.INTAKE_POSE;
      m_timer = new Timer();
    }
  
    @Override
    public void periodic() {}
  }