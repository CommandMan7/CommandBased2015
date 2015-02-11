package org.usfirst.frc.team4362.robot.commands;

import org.usfirst.frc.team4362.robot.RobotMap;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Drive extends the CommandBase class.
 *
 * This class will be laid out such that each function can be called as a command.
 *
 * To Do List -- add code as necessary for the function of the robot. Move shifting to it's own file.
 * 
 * Drive() -- essentially a init for this command. Checks what is required and inits the joysticks.
 *
 * initialize() -- initializes driving resources.
 * execute() -- gets shifter trigger and driving axis positions and sets tankdrive and shifter to those values.
 * isFinished() -- returns if driving is finished.
 * end() -- called once if isFinished returns true.
 * interrupted() -- called if drive's subsystems are required by another command.
 */

public class Drive extends CommandBase {
	Joystick leftStick;
	Joystick rightStick; /*!< Creates new Joystick leftStick and rightStick. */
	Joystick controller;
	Button left_Bumper, A_Button, B_Button,X_Button,Y_Button,Back_Button,Start_Button, right_Bumper; /*!< Creates new Button leftTrigger and rightTrigger. */
	
	DriverStation ds; /*!< Creates new DriverStation ds. */
	//Encoder leftEncoder, rightEncoder;
	boolean left = false;
	boolean right = true;
    public Drive() {
    	requires(chassis); /*!< Checks if chassis exists, and does not run if it is missing. */
    	requires(lift);
    	//leftStick = oi.getLeftStick(); /*!< Gets an instance of leftStick from OI.java. */
    	//rightStick = oi.getRightStick(); /*!< Gets an instance of rightStick from OI.java. */
    	leftStick = new Joystick(0);
    	rightStick = new Joystick(1);
    	controller = new Joystick(2);
    	//button var. name = new JoystickButton(contoller name, button number)
    	A_Button = new JoystickButton(controller, 1);
    	B_Button = new JoystickButton(controller, 2);
    	X_Button = new JoystickButton(controller, 3);
    	Y_Button = new JoystickButton(controller, 4);
    	left_Bumper = new JoystickButton(controller, 5); /*!< Gets an instance of leftTrigger from OI.java. */
    	right_Bumper = new JoystickButton(controller, 6); /*!< Gets an instance of rightTrigger from OI.java. */
    	Back_Button = new JoystickButton(controller, 7);
    	Start_Button = new JoystickButton(controller, 8);
    	//leftEncoder = new Encoder(0,1,true);
    	//rightEncoder = new Encoder(2,3,false);
    	ds = DriverStation.getInstance(); /*!< Gets an instance of the ds from the DriverStation. */
    }
   
    protected void initialize() {
    	chassis.tankDrive(0, 0); /*!< Sets the speed to zero when initialized. */
    	//leftEncoder.reset();
    	//rightEncoder.reset();
    	//leftEncoder.setDistancePerPulse(.075398224);
    	//rightEncoder.setDistancePerPulse(.075398224);
    }
    
    protected void execute() {
    	//SmartDashboard.putNumber("Left Shaft", leftEncoder.getDistance());
    	//SmartDashboard.putNumber("Right Shaft", rightEncoder.getDistance());
    	//SmartDashboard.putNumber("Left Speed FPS", leftEncoder.getRate()/12);
    	//SmartDashboard.putNumber("Right Speed FPS", rightEncoder.getRate()/12);
    	
    	left_Bumper.whenPressed(new FullLift());
    	right_Bumper.whenPressed(new EngageTote());
    	double up = controller.getRawAxis(3);
    	double down = controller.getRawAxis(2);
    	double left = leftStick.getRawAxis(RobotMap.C_LEFTAXIS); /*!< Sets left to the current position of the left joystick's axis # C_LEFTAXIS. */
    	double right = -rightStick.getRawAxis(RobotMap.C_RIGHTAXIS); /*!< Sets right to the current position of the right joystick's axis # C_RIGHTAXIS. */
    	chassis.tankDrive(left, right); /*!< Sets the values of the chassis.tankDrive to the current joystick values. */
    	lift.movement(up,down);
    }

    protected boolean isFinished() { 
    	return !ds.isOperatorControl(); /*!< This returns true if the robot is not in teleop mode. */
    }

    protected void end() {
    	/*!< This code runs once if isFinished() returns true. */
    }

    protected void interrupted() {
    	/*!< This code is called if another command tries to use the subsystem chassis while this class is active. */
    }
}
