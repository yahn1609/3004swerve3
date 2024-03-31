package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSubystem;

public class RaiseClimberCmd extends Command {

    private final ClimberSubystem climberSubystem;
    private final boolean raiseClimber;

    public RaiseClimberCmd(ClimberSubystem raiseSubSystem, boolean raiseClimber) {
            this.climberSubystem = raiseSubSystem; // passes Mechanism class through RaiseCmd's constructor (for when it's called in robot container)
            this.raiseClimber = raiseClimber;
            addRequirements(raiseSubSystem);
    }

    @Override
    public void initialize() {
        System.out.println("RaiseClimberCmd started!");
    }

    @Override
    public void execute() {
        climberSubystem.raisePositionUP(raiseClimber); // raises the pivot motor
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("RaiseClimberCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
