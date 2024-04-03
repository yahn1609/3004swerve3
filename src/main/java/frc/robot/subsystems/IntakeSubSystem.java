package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    public TalonFX intakeMechanism = new TalonFX(Constants.intakeMechanismID);
    // In case you need extra motor: public TalonFX followIntakeMechanism = new TalonFX(Constants.intakeMechanismID);
    public TalonFX intakeArmMechanism = new TalonFX(Constants.intakeArmMechanismID);

    public IntakeSubsystem() {}
    
    @Override
    public void periodic() {}

    public void intakePosition (boolean intakeINStart) {
        if (intakeINStart) {
            intakeMechanism.set(Constants.intakeIN);
        } 
    }

    public void intakeArmPosition (boolean intakeARMSTART) {
        if (intakeARMSTART) {
            intakeArmMechanism.set(Constants.intakeARMSPEED);
        }
    }

    public void spitShooterIntake(boolean spitFire) {
        if (spitFire) {
            intakeMechanism.set(Constants.intakeOUT);
            //followIntakeMechanism.set(Constants.intakeOUT);
        }
    }

    public void intakeRest (boolean intakeRest) {
        intakeMechanism.set(0);
        intakeArmMechanism.set(0);
    }
}
