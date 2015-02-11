
package org.usfirst.frc.team4362.robot.subsystems;

import org.usfirst.frc.team4362.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4362.robot.RobotMap;

public class Lift extends Subsystem {
	private CANTalon topLift;
	public Lift(){
	topLift = new CANTalon(RobotMap.C_TOPLIFT);
	}
	public void movement(double up, double down){ 
		if(up>down){
			topLift.set(up);
		}else{
			topLift.set(-down);
		}
    }

    public void initDefaultCommand() {
    	/*!< This code sets the default command ran when this subsystem is called. */
        setDefaultCommand(null);
    }
}

