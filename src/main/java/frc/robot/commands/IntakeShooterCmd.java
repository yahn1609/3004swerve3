package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeShooterCmd extends Command {
    private final IntakeSubsystem intakeSubsystem;
    private final boolean spitFire;

    public IntakeShooterCmd(IntakeSubsystem intakeSubsystem, boolean spitFire) {
            this.intakeSubsystem = intakeSubsystem;
            this.spitFire = spitFire;
    }

    @Override
    public void initialize() {
        System.out.println("IntakeShooterCmd started!");
    }

    @Override
    public void execute() {
        intakeSubsystem.spitShooterIntake(spitFire); // spits out ring from intake
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("IntakeShooterCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
