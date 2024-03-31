package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeRestCmd extends Command {
    private final IntakeSubsystem intakeSubsystem;
    private final boolean intakeRest;

    public IntakeRestCmd(IntakeSubsystem intakeSubsystem, boolean intakeRest) {
          this.intakeRest = intakeRest;
          this.intakeSubsystem = intakeSubsystem;  
    }

    @Override
    public void initialize() {
        System.out.println("IntakeRestCmd started!");
    }

    @Override
    public void execute() {
        intakeSubsystem.intakeRest(intakeRest); // rests intake
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("IntakeRestCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
} 