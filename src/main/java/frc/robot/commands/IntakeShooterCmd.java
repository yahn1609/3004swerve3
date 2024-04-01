package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class IntakeShooterCmd extends Command {
    private final ShooterSubsystem shooterSubsystem;
    private final boolean spitFire;

    public IntakeShooterCmd(ShooterSubsystem shooterSubsystem, boolean spitFire) {
            this.shooterSubsystem = shooterSubsystem;
            this.spitFire = spitFire;
    }

    @Override
    public void initialize() {
        System.out.println("IntakeShooterCmd started!");
    }

    @Override
    public void execute() {
        shooterSubsystem.spitShooterIntake(spitFire); // spits out ring from intake
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