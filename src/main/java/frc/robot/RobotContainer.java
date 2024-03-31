package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.autos.*;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    /*
     *                                                              [Button Configuration]
     *  /***********************************************************************************************************************************************/
        //                                                                  /\_/\                                                                      //
        //                                                                 ( o.o )                                                                     //
        //                                                                  > ^ <                                                                      //
        //                                                          [Author: @silentznacht]                                                            //
        /********************************************************************************************************************************************** /
        
        [BUTTONS]

                 [Gyro]
                    - RESET GYRO = Y
                        
                 [Intake]
                    - INTAKE IN = X
                    - AMP SHOOTER / INTAKE OUT = A

                 [Climber]
                    - RAISE CLIMBER / PIVOT MOTOR = UP D-PAD
                    - LOWER CLIMBER / PIVOT MOTOR = DOWN D-PAD

                [Shooter]
                    - 

        [DRIVE] 
            - TRANSLATION AXIS = LEFT Y STICK
            - STRAFE AXIS = LEFT X STICK
            - ROTATE = RIGTH STICK X
    */

    /* Controllers */
    private final XboxController driverController = new XboxController(0);

    /* Drive Controls */
    private final int translationAxis = XboxController.Axis.kLeftY.value;
    private final int strafeAxis = XboxController.Axis.kLeftX.value;
    private final int rotationAxis = XboxController.Axis.kRightX.value;

    /* Driver Buttons */
    private final JoystickButton zeroGyro = new JoystickButton(driverController, XboxController.Button.kY.value); // resets gyro position
    private final JoystickButton robotCentric = new JoystickButton(driverController, XboxController.Button.kLeftBumper.value);

    /* Operator Buttons */

    /** Intake **/
    private final JoystickButton intakeIN = new JoystickButton(driverController, XboxController.Button.kX.value);  
    private final JoystickButton intakeOUT = new JoystickButton(driverController, XboxController.Button.kA.value);
    
    private final JoystickButton raise = new JoystickButton(driverController,  driverController.getPOV(0)); // d-pad up
    private final JoystickButton down = new JoystickButton(driverController,  driverController.getPOV(180)); // d-pad down

    /* Subsystems */
    private final Swerve s_Swerve = new Swerve();
    private final IntakeSubsystem m_IntakeSubSystem = new IntakeSubsystem();

    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {
        s_Swerve.setDefaultCommand(
            new TeleopSwerve (
                s_Swerve, 
                () -> -driverController.getRawAxis(translationAxis), 
                () -> -driverController.getRawAxis(strafeAxis), 
                () -> -driverController.getRawAxis(rotationAxis), 
                () -> robotCentric.getAsBoolean()
            )
        );

        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {

        /* Driver Buttons */
        zeroGyro.onTrue(new InstantCommand(() -> s_Swerve.zeroHeading())); // resets gyro
        intakeIN.onTrue(new InstantCommand(() -> m_IntakeSubSystem.intakePosition(true))); // intake in

        // raise / elevator climber mechs buttons next

    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return new exampleAuto(s_Swerve);
    }
}