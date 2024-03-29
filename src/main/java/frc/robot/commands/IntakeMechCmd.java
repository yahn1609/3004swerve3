package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeMechCmd extends Command {
    
    private final IntakeSubsystem intakeSubSystem;
    private final boolean intakeINStart;
    
    public IntakeMechCmd(IntakeSubsystem intakeSubSystem, boolean intakeINStart) {
        this.intakeSubSystem = intakeSubSystem; // passes intakesub class through IntakeCmd constructor (for when it's called in robot container)
        this.intakeINStart = intakeINStart;
        addRequirements(intakeSubSystem);
    }

    @Override
    public void initialize() {
        System.out.println("IntakeMechCmd started!");
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("IntakeMechCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
