package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {

    private static TalonFX shooterIntakeMechanismLeft;
    private static TalonFX slaveShooterIntakeMechanismLeft;
    private static TalonFX shooterIntakeMechanismRight;
    private static TalonFX slaveShooterIntakeMechanismRight;

    private static TalonFX intakeHelperMotor = IntakeSubsystem.intakeMechanism;
    private static TalonFX intakeHelperMotorSlave = IntakeSubsystem.slaveIntakeMechanism;
    
    @Override
    public void periodic() {}

    public void shootTarget (boolean starShot) {
        if (starShot) {
            shooterIntakeMechanismLeft.set(Constants.shooterMotorSpeedLeft);
            shooterIntakeMechanismRight.set(Constants.shooterMotorSpeedRight);
            intakeHelperMotor.set(Constants.shooterMotorSpeedLeft);
            intakeHelperMotorSlave.set(Constants.shooterMotorSpeedRight);
        } 
    }

    public void spitShooterIntake (boolean spitFire) {
        if (spitFire) {
            intakeHelperMotor.set(Constants.intakeOUT);
            intakeHelperMotorSlave.set(Constants.intakeOUT);
        }
    }

    public void restShooter(boolean restShooter) {
        
    }

}
