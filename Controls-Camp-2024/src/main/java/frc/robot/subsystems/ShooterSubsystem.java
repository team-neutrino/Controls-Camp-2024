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
  private CANSparkMax m_shooterMotor = //Create a motor controller for the shooter- your parameters are a CAN ID and a motor type.
  private RelativeEncoder m_shooterEncoder; //An encoder tells you about the rotation of the motor- this is how we know what our RPM is
  private SparkPIDController m_pidController;
  private Debouncer m_shootDebouncer = new Debouncer(1.0);

  private ControlType m_shootControlType;
  //create a double member variable for target voltage
  //create a double member variable for target RPM

  //create a boolean member variable for whether or not you are at the target speed

  public ShooterSubsystem() {
    //m_shooterEncoder = m_shooterMotor.//Call a "get" method for the shooter encoder
    //m_pidController = m_shooterMotor.//Call a "get" method for the PID controller
    //m_pidController.setFeedbackDevice(); //Fill the parentheses with the member variable for the encoder
    //m_shooterMotor.setIdleMode(IdleMode.); //Set the idle mode of the shooter motor to "coast"
    //m_shooterMotor.setInverted(); //Fill the parentheses with a boolean to make the shooter motor NOT inverted.

    //m_shooterMotor.burnFlash();
  }

  public boolean approveShoot() {
    //return the boolean that tells you if you are at the speed you want to be at
  }

  public boolean aboveRPM(double p_rpm) {
    //return true if your shooter RPM is greater than the parameter value- return false otherwise.
  }

  public double getShooterRPM() {
    //return the velocity of the shooter motor (hint: use the encoder!!)
  }

  public double getTargetRPM() {
    //return your target RPM for the shooter motor
  }

  public void setTargetRPM() { //create a parameter for target rpm and put it in the parentheses
    //here, set your member variable (m_) to the value given by the parameter variable
    m_shootControlType = ControlType.kVelocity;
  }

  public void setVoltage(double voltage) {
    //set your target voltage
    //set your shoot control type to voltage
  }

  @Override
  public void periodic() {
    //write an if statement that sets the reference of the pid controller to the target
    //RPM (the second parameter is CANSparkBase.ControlType.kVelocity) if the shoot control type is ControlType.kVelocity
    //Otherwise, you want to set the voltage of the shooter motor to your target voltage

    m_atSpeed = m_shootDebouncer.calculate(Math.abs(getTargetRPM() - getShooterRPM()) <= ShooterConstants.RPM_ERROR_THRESHOLD);
  }
}