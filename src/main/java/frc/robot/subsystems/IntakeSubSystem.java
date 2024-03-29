package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    private static TalonFX shooterIntakeMechanism;
    private static TalonFX slaveShooterIntakeMechanism;

    public IntakeSubsystem() {}
    
    @Override
    public void periodic() {}

    public void intakePosition (boolean intakeINStart) {
        if (intakeINStart) {
            // intake in logic
            shooterIntakeMechanism.set(Constants.intakeIN);
            slaveShooterIntakeMechanism.set(Constants.intakeIN);
        } else {
            shooterIntakeMechanism.set(Constants.intakeOUT);
            slaveShooterIntakeMechanism.set(Constants.intakeOUT);
        }
    }

    public void intakeRest (boolean rest) {
        shooterIntakeMechanism.set(0);
        slaveShooterIntakeMechanism.set(0);
    }
}
