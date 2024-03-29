package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RaiseSubSystem;

public class RaiseMechCmd extends Command {

    private final RaiseSubSystem raiseSubSystem;

    public RaiseMechCmd(RaiseSubSystem raiseSubSystem) {
        this.raiseSubSystem = raiseSubSystem; // passes Mechanism class through RaiseCmd's constructor (for when it's called in robot container)
        addRequirements(raiseSubSystem);
    }

    @Override
    public void initialize() {
        System.out.println("RaiseMechCmd started!");
    }

    @Override
    public void execute() {
       // executes a method for our cmd in the mechanism subsystem
       raiseSubSystem.raisePositionUP(true);
       raiseSubSystem.raisePositionDOWN(true);
    }   

    @Override
    public void end(boolean interrupted) {
        System.out.println("RaiseMechCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
