package frc.robot.util;

import frc.robot.Constants.PWMConstants;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.ShooterSubsystem;


public class SubsystemContainer {
    public static final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    public static final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    public static final LEDSubsystem LEDSubsystem = new LEDSubsystem(PWMConstants.LED1);
}
