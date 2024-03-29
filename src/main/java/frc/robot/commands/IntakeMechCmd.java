package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubSystem;

public class IntakeMechCmd extends Command {
    
    private final IntakeSubSystem intakeSubSystem;
    private final boolean intakeINStart;
    
    public IntakeMechCmd(IntakeSubSystem intakeSubSystem, boolean intakeINStart) {
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
