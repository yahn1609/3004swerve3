package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSubystem;

public class ClimberRestCmd extends Command {
    private final ClimberSubystem climberSubystem;
    private final boolean climberRest;

    public ClimberRestCmd(ClimberSubystem climberSubystem, boolean climberRest) {
            this.climberSubystem = climberSubystem;
            this.climberRest = climberRest;
            addRequirements(climberSubystem);
    }

    
    @Override
    public void initialize() {
        System.out.println("ClimberRestCmd started!");
    }

    @Override
    public void execute() {
        climberSubystem.restClimber(climberRest); // rests climber / pivot motor
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("ClimberRestCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}