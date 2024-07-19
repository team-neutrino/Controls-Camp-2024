// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorIDs;
import frc.robot.Constants.DigitalConstants; //this contains the ID constant for the beam break constructor parameter
import frc.robot.Constants.IntakeConstants; //this contains the motor voltages when running your motors
import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj.DigitalInput; //This is the beam break class, use it to create your beam break object
import com.revrobotics.CANSparkMax; //This is the motor class, use it to create the motors
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel;

public class IntakeSubsystem extends SubsystemBase {
    /** Creates a new IntakeSubsystem. */
    public IntakeSubsystem() {
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
