package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {

    /* Note to Reakab: If you need to id these motor controllers follow the example below */
    /*private TalonFX motorExample = new TalonFX(0);*/
    
    private TalonFX shooterIntakeMechanismLeft = new TalonFX(Constants.shooterIntakeMechanismLeftID); 
    private TalonFX shooterIntakeMechanismRight = new TalonFX(Constants.shooterIntakeMechanismRightID);
    
    @Override
    public void periodic() {}

    public void shootTarget(boolean starShot) {
        if (starShot) {
            shooterIntakeMechanismLeft.set(Constants.shooterMotorSpeedLeft);
            shooterIntakeMechanismRight.set(Constants.shooterMotorSpeedRight);
        } 
    }

    public void restShooter(boolean restShooter) {
            shooterIntakeMechanismLeft.set(0);
            shooterIntakeMechanismRight.set(0);
    }

}
