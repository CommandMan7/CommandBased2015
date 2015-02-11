
package org.usfirst.frc.team4362.robot.commands;

import org.usfirst.frc.team4362.robot.Robot;

public class Camera extends CommandBase {

    public Camera() {
        requires(Robot.Vision); /*!< Checks if Robot.Vision exists, and does not run if it is missing. */
        initialize();
    }

    protected void initialize() {
    	/*!< Code here is ran when ExampleCommand.initialize() is called. */
    	Vision.pushCam1();
    	Vision.pushCam2();
    }

    protected void execute() {
    	/*!< Code here is ran when ExampleCommand.execute() is called. */
    }

    protected boolean isFinished() {
        return false; /*!< Returns true when execute will no longer be called. */
    }

    protected void end() {
    	/*!< Code here is ran once after ExampleCommand.isFinished() returns true. */
    }

    protected void interrupted() {
    	/*!< This code is called if another command tries to use the subsystem Robot.exampleSubsystem while this class is active. */
    }
}
