package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCmd extends Command {
    private final ShooterSubsystem shooterSubsystem;
    private final boolean starShot;

    public ShooterCmd (ShooterSubsystem shooterSubsystem, boolean starShot) {
        this.shooterSubsystem = shooterSubsystem;
        this.starShot = starShot;
    }
    
    @Override
    public void initialize() {
        System.out.println("ShooterCmd started!");
    }

    @Override
    public void execute() {
        shooterSubsystem.shootTarget(starShot); // shoots target
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("ShooterCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
