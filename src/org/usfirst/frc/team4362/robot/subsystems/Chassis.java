package org.usfirst.frc.team4362.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4362.robot.RobotMap;

/**
 * Drive extends the Subsystem class.
 *
 * This class will be laid out such that each function of the subsystem can be called in a command.
 *
 * To Do List -- add code as necessary for the function of the robot. Modify code to use Talon SRX's instead of Talon SR's.
 * 
 * initDefaultCommand() -- sets the default command for for this subsystem.
 * tankDrive(double left, double right) -- this function sets the robot's talons to work in tankdrive.
 */

public class Chassis extends Subsystem {
	
	private CANTalon leftFront; /*!< Creates Talon leftFront. */
	private CANTalon leftBack; /*!< Creates Talon leftBack. */
	private CANTalon rightFront; /*!< Creates Talon rightFront. */
	private CANTalon rightBack; /*!< Creates Talon rightBack. */
	public Chassis(){
	leftFront = new CANTalon(RobotMap.C_LEFTFRONT); /*!< Sets leftFront to a new Talon on PWM port RobotMap.C_LEFTFRONT. Needs to be changed to use TalonSRX's. */
	leftBack = new CANTalon(RobotMap.C_LEFTBACK); /*!< Sets leftBack to a new Talon on PWM port RobotMap.C_LEFTBACK. Needs to be changed to use TalonSRX's. */
	rightFront = new CANTalon(RobotMap.C_RIGHTFRONT); /*!< Sets rightFront to a new Talon on PWM port RobotMap.C_RIGHTFRONT. Needs to be changed to use TalonSRX's. */
	rightBack = new CANTalon(RobotMap.C_RIGHTBACK); /*!< Sets rightBack to a new Talon on PWM port RobotMap.C_RIGHTBACK. Needs to be changed to use TalonSRX's. */
	}
	public void initDefaultCommand() {
		/*!< This code sets the default command ran when this subsystem is called. */
        setDefaultCommand(null);
    }
    public void tankDrive(double left, double right){
    	leftFront.set(left); /*!< Sets the leftFront Talon to the value of arguement left. */
    	leftBack.set(left); /*!< Sets the leftBack Talon to the value of arguement left. */
    	rightFront.set(right); /*!< Sets the rightFront Talon to the value of arguement right. */
    	rightBack.set(right); /*!< Sets the rightBack Talon to the value of arguement right. */
    	
    }
}

