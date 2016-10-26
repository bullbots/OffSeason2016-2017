
package org.usfirst.frc.team1891.motorcontroller;

import edu.wpi.first.wpilibj.CANTalon;

/**
 * @author Egan Schafer
 *
 */
public class TalonSRX extends CANTalon{
	
	/**
	 * Creates a CANTalon object with the selected ID
	 * @param deviceNumber ID of talon
	 */
	public TalonSRX(int deviceNumber) {
		super(deviceNumber);
		// TODO Auto-generated constructor stub
	}
	//Mode 0 is percent mode
	//Mode 1 is position mode
	//Mode 2 is speed mode
	//Mode 3 is current mode
	//Mode 4 is voltage mode
	int codesPerRev;
	CANTalon talon;
	int test=0;
	
		/* set the peak and nominal outputs, 12V means full */
//		talon.configNominalOutputVoltage(+0.0f, -0.0f);
//		talon.configPeakOutputVoltage(+12.0f, -12.0f);
//		/* set closed loop gains in slot0 */
//		talon.setProfile(0);
//		talon.setF(0.3567);
//		talon.setP(0.04825);
//		talon.setI(0); 
//		talon.setD(0);
}
