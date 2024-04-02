package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class RestShooterCmd extends Command {
    private final  ShooterSubsystem shooterSubsystem;
    private final boolean restShooter;

    public RestShooterCmd(ShooterSubsystem shooterSubsystem, boolean restShooter) {
            this.shooterSubsystem = shooterSubsystem;
            this.restShooter = restShooter;
            addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        System.out.println("RestShooterCmd started!");
    }

    @Override
    public void execute() {
        shooterSubsystem.restShooter(restShooter);
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("RestShooterCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}
