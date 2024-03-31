package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    public static TalonFX intakeMechanism;
    public static TalonFX slaveIntakeMechanism;

    public IntakeSubsystem() {}
    
    @Override
    public void periodic() {}

    public void intakePosition (boolean intakeINStart) {
        if (intakeINStart) {
            intakeMechanism.set(Constants.intakeIN);
            slaveIntakeMechanism.set(Constants.intakeIN);
        } 
    }

    public void intakeRest (boolean intakeRest) {
        intakeMechanism.set(0);
        slaveIntakeMechanism.set(0);
    }
}
