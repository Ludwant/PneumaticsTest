package org.usfirst.frc.team5980.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Actuator extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid exampleDouble = new DoubleSolenoid(0, 1);
	public void setActuatorForward() {
		exampleDouble.set(DoubleSolenoid.Value.kForward);
	}
	public void setActuatorReverse() {
		exampleDouble.set(DoubleSolenoid.Value.kReverse);
	}
	public void setActuatorOff() {
		exampleDouble.set(DoubleSolenoid.Value.kOff);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

