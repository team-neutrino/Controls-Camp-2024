package frc.robot.util;

import frc.robot.Constants.PWMConstants;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.SwerveSubsystem;
import frc.robot.subsystems.wrapper.Intake;
import frc.robot.subsystems.wrapper.NetworkTables;


public class SubsystemContainer {
    public static final NetworkTables sendables = new NetworkTables();
    public static final SwerveSubsystem swerveSubsystem = new SwerveSubsystem();
    public static final Intake intakeSubsystem = new Intake();
    public static final LEDSubsystem LEDSubsystem = new LEDSubsystem(PWMConstants.LED1);
}
