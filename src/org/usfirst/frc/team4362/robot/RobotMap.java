package org.usfirst.frc.team4362.robot;

/**
 * This class will hold all variables. This provides flexibility changing wiring, makes checking the wiring easier and significantly reduces 
 * the number of variables floating around.
 *
 * To Do List -- add variables as necessary for the function of the robot.
 */
public class RobotMap {
	public static final int C_TOPLIFT = 1;
	public static final int C_LEFTFRONT = 4; /*!< Constant value for the left front talon's CAN address. */
	public static final int C_LEFTBACK = 5; /*!< Constant value for the left back talon's CAN address. */
	public static final int C_RIGHTFRONT = 2; /*!< Constant value for the right front talon's CAN address. */
	public static final int C_RIGHTBACK = 3; /*!< Constant value for the right back talon's CAN address. */
	public static final int C_SHIFTERLOW = 0; /*!< Constant value for the shifter's low gear solenoid CAN address. */
	public static final int C_SHIFTERHIGH = 1; /*!< Constant value for the shifter's high gear solenoid CAN address. */
	public static final int C_COMPRESSORPORT = 1; /*!< Constant value for the compressor's CAN address. */
	public static final int C_LEFTSTICK = 0; /*!< Constant value for the left joystick's USB port. */
	public static final int C_RIGHTSTICK = 1; /*!< Constant value for the right joysticks's USB port. */
	public static final int C_LEFTAXIS = 1; /*!< Constant value for the left joystick's y-axis. */
	public static final int C_RIGHTAXIS = 1; /*!< Constant value for the right joysticks's y-axis. */
	public static final int C_LEFTTRIGGER = 1; /*!< Constant value for the left joysticks's trigger number. */
	public static final int C_RIGHTTRIGGER = 1; /*!< Constant value for the right joysticks's trigger number. */
	public static final int C_TOPLIFTBUTTON = 4;
	//6*3.14159 = 18.84954 |||| 18.84954 / 250 = .075398224 |||| this is the six inch wheel cal for encoders to read 1 inch per one distance
	//public static final double DistancePerPulse = .075398224; //six inch wheel cal.
	//4*3.14159 = 12.56636 |||| 12.56636 / 250 = 0.05026544 |||| this is the four inch wheel cal for encoders to read 1 inch per one distance 
	public static final double DistancePerPulse = .05026544; //four inch wheel cal.
	public static final int C_QUALITY = 50; /*!< Constant value for quality in new instances of CameraServer */
	public static final String C_CAM1 = "cam0"; /*!< Constant value for the first USB camera */
	public static final String C_CAM2 = "cam1"; /*!< Constant value for the second USB camera */
}
