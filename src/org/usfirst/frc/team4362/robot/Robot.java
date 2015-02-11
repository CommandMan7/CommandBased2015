
package org.usfirst.frc.team4362.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4362.robot.commands.Camera;
import org.usfirst.frc.team4362.robot.commands.CommandBase;
import org.usfirst.frc.team4362.robot.commands.Drive;
import org.usfirst.frc.team4362.robot.commands.ExampleCommand;
import org.usfirst.frc.team4362.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4362.robot.subsystems.Vision;

/**
 * Robot extends the IterativeRobot class.
 *
 * This class will be laid out such that each init function will schedule the correct commands for use in periodic functions.
 *
 * To Do List -- add code as necessary for the function of the robot. Move compressor into it's own command.
 * 
 * robotInit() -- provide for initialization of commands and OI at robot startup.
 *
 * init() functions -- each of the following functions is called during it's respective game period:
 * 
 *  - autonomousInit()   -- schedules commands to be called during autonomousPeriodic().
 *  - teleopInit() -- schedules commands to be called during teleopPeriodic().
 *  - disabledInit() -- schedules commands to be called during disabledPeriodic().
 *
 * periodic() functions -- runs the scheduled commands defined in the init functions.
 *  
 *  - autonomousPeriodic()   -- runs the commands previously scheduled during autonomousInit.
 *  - teleopPeriodic() -- runs the commands previously scheduled during teleopInit.
 *  - disabledPeriodic() -- runs the commands previously scheduled during disabledInit.
 *   
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem(); /*!< This is an example of how to make a subsystem. Has no purpose. */
	public static final Subsystem Vision = new Vision();
	public static OI oi; /*!< Creates a new OI named oi */
	public static Compressor compressor; /*!< Creates a new Compressor named compressor */
    Command autonomousCommand; /*!< Creates a new command named autonomousCommand */
    private Command drive; /*!< Creates a new private command named drive */
    private Command camera;

    public void robotInit() {
    	CommandBase.init();
		oi = new OI(); /*!< Sets oi to a new OI from the OI.java file in this same package */
		compressor = new Compressor(RobotMap.C_COMPRESSORPORT); /*!< Sets compressor to a new Compressor from the WPILib. Needs to be its own command. */
		compressor.start(); /*!< Starts compressor. */
        autonomousCommand = new ExampleCommand(); /*!< Sets autonomousCommand to an instance of ExampleCommand. autonomousCommand needs its own command. */
        drive = new Drive(); /*!< Bind drive to the command type Drive set in the Drive.java file. */
        camera = new Camera();
        camera.start();
    }
    
    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start(); /*!< Checks if the autonomousCommand has been given. If true, it schedules autonomousCommand.start(). */
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run(); /*!< Runs commands scheduled in autonomousInit. */
    }
    
    public void teleopInit() {
        //if (autonomousCommand != null) autonomousCommand.cancel();/*!< Checks if the autonomousCommand has been given. If true, it schedules autonomousCommand.cancel(). */
    	drive.start(); /*!< Schedules drive.start(). */
    	
    }
    
    public void teleopPeriodic() {
        Scheduler.getInstance().run(); /*!< Runs commands scheduled in teleopInit. */
    	 
    }
    
    public void disabledInit(){
    	 /*!< Schedules drive.cancel(). */
    }
    
	public void disabledPeriodic() {
		Scheduler.getInstance().run(); /*!< Runs commands scheduled in disabledInit. */
	}
    
    public void testPeriodic() {
        LiveWindow.run(); /*!< Refreshes the numbers output to screen. */
    }
}
