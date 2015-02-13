package org.usfirst.frc.team4362.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sols extends Subsystem {
	
	public static Solenoid LargeUp, LargeDown;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void Sols(){
    	LargeUp = new Solenoid(0);/*!< Gets an instance of upShifter from OI.java. */
    	LargeDown = new Solenoid(1); /*!< Gets an instance of downShifter from OI.java. */
    }
    	
    	
    	
    	
    }
    
    


