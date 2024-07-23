package frc.robot;


public final class Constants {
  public static class OperatorConstants {
    public static final int XBOX_CONTROLLER = 0;
    public static final int DRIVER_CONTROLLER = 1;
  }

  public final class DigitalConstants {
    public static final int INTAKE_MOTOR_BEAMBREAK = 0;
  }

  public final class PWMConstants {
    public static final int LED1 = 0;
  }

  public final class LEDConstants {
    public static final int LEDBufferLen = 18;
  }

  public final class MotorIDs {
    public static final int INTAKE_MOTOR = 1;
    public static final int INDEX_MOTOR = 2;
    public static final int SHOOTER_MOTOR = 3;
  }
 

  public final class IntakeConstants {
    public static final double INTAKE_MOTOR_VOLTAGE = 1;
    public static final double INDEX_MOTOR_VOLTAGE_INTAKE = 0.4;
    public static final double INDEX_MOTOR_VOLTAGE_POSITION = 0.07;
    public static final double INDEX_MOTOR_VOLTAGE_SHOOT = 1;
    public static final double INDEX_MOTOR_VOLTAGE_FEED = 0.4;
    public static final double INDEX_JITTER_MOTOR_VOLTAGE = 0.125;
    public static final int INTAKE_CURRENT_LIMIT = 35;
    public static final int INDEX_CURRENT_LIMIT = 20;
    public static final double INTAKE_ERROR_THRESHOLD = 0.4;
    public static final double INTAKE_SLEW_RATE = 5.0;
  }

  public final class ShooterSpeeds {
    public static final double SHOOTING_SPEED = 4000;
    public static final double SHUTTLE_SPEED = 350;
    public static final double THRESHOLD_SHOOTING_SPEED = 3800;
    public static final double SHUTTLE_CLOSE_SPEED = 2700;
    public static final double AMP_SPEED = 2500;
    public static final double INITIAL_SHOOTER_SPEED = 0.6 * 12;
    public static final double LOW_SPEED_THRESHOLD = 2800;
    public static final double SPEED_THRESHOLD_SHUTTLE = 3000;
    public static final double MAX_SHUTTLE_SPEED = 4000;
    public static final double MIN_SHUTTLE_SPEED = 2500;
    public static final double SHUTTLE_THRESHOLD_ERROR = 200;
    public static final double AMP_SPEED_THRESHOLD = 2300;
  }

  public final class ShooterConstants {
    public static final int HIGH_SHOOTER_CURRENT_LIMIT = 100;
    public static final int SHOOTER_CURRENT_LIMIT = 60;
    public static final double WHEEL_P = 0.0005;
    public static final double WHEEL_I = 0.000001;
    public static final double WHEEL_D = 0;
    public static final double WHEEL_FF = 0.00019;
    public static final double WHEEL_IZONE = 250;
    public static final double DEBOUNCE_TIME = 0.1;
    public static final double RPM_ERROR_THRESHOLD = 200;
    public static final double AUTO_ALIGN_ERROR = 4;
    public static final double MAX_SHOOTING_DISTANCE = 5;
    public static final double SHOOTER_MOTOR_VOLTAGE_TEST = 0.4;
  }

}
