public class ArmSubsystem extends SubsystemBase {
    private CANSparkFlex m_armMotor;
    private AbsoluteEncoder m_armEncoder;
    private double m_targetAngle = 0.0;
    private boolean m_inPosition;
    private Debouncer m_armDebouncer;
    private Timer m_timer;
    
    public ArmSubsystem() {}
  
    @Override
    public void periodic() {}
  }