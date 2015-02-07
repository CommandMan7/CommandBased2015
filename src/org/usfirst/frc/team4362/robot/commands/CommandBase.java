package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4362.robot.OI;
import org.usfirst.frc.team4362.robot.subsystems.Chassis;
import org.usfirst.frc.team4362.robot.subsystems.Sols;
/**
 * This class will be laid out such that all controllers and buttons can be accessed from a central point.
 *
 * To Do List -- add code as necessary for the function of the robot.
 * 
 * Defines non-commands (includes subsystems) in a file, so that during the rest of the program they can be referenced. Checks what each files requires and creates an 
 * instance of each file that can be accessed publicly.
 */
public abstract class CommandBase extends Command {
	public static OI oi; /*!< Creates a new OI named oi */
	public static Chassis chassis; /*!< Creates a new Chassis named chassis */
    public CommandBase() { /*!< Uses requires() to declare subsystem dependencies. */
    	super(); /*!< Checks if super() exists, and does not run if it is missing. */
    }

   
    public static void  init() {
    	oi = new OI(); /*!< Sets oi to a new OI from the OI.java file. */
    	chassis = new Chassis(); /*!< Sets chassis to a new Chassis from the Chassis.java file. */
    }

    public CommandBase(String name){
    	super(name); /*!< checks the given arguement's name exists. */
    }
    
}
