package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeMotorsCmd extends Command {
    
    private final IntakeSubsystem intakeSubSystem;
    private final boolean intakeINStart;
    
    public IntakeMotorsCmd(IntakeSubsystem intakeSubSystem, boolean intakeINStart) {
            this.intakeSubSystem = intakeSubSystem; // passes intakesub class through IntakeCmd constructor (for when it's called in robot container)
            this.intakeINStart = intakeINStart; // if passed in the robot container, can be passed as true executing the method in the subsys
            addRequirements(intakeSubSystem);
    }

    @Override
    public void initialize() {
        System.out.println("IntakeMotorsCmd started!");
    }

    @Override
    public void execute() {
        intakeSubSystem.intakePosition(intakeINStart); // moves intake 
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("IntakeMotorsCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
