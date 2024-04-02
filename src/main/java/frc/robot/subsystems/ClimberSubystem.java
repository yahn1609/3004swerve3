package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubystem extends SubsystemBase {

    private static TalonFX pivotMotor = new TalonFX(Constants.pivotMotorID);

    public ClimberSubystem() {}

    @Override
    public void periodic() {}


    public void raisePositionUP(boolean raiseStart) { 
        if (raiseStart) {
            pivotMotor.set(Constants.climberRaiseSpeed); // raises climber
        } else {
            pivotMotor.set(Constants.climberLowerSpeed); // lowers climber
        }
    }

    public void restClimber(boolean climberRest) {
        pivotMotor.set(0);
    }
}
