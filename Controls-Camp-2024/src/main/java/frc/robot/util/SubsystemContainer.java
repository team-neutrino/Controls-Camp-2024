package frc.robot.util;

import frc.robot.Constants.PWMConstants;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.SwerveSubsystem;

public class SubsystemContainer {
    // public static final NetworkTables sendables = new NetworkTables();
    public static final SwerveSubsystem swerveSubsystem = new SwerveSubsystem();
    public static final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    public static final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    public static final ArmSubsystem armSubsystem = new ArmSubsystem();
    public static final LEDSubsystem LEDSubsystem = new LEDSubsystem(PWMConstants.LED1);
}
