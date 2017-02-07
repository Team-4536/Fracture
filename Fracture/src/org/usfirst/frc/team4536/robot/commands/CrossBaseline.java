package org.usfirst.frc.team4536.robot.commands;

import org.usfirst.frc.team4536.utilities.Constants;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Eddie
 * crosses the baseline in autonomous
 */
public class CrossBaseline extends CommandBase {

   
    public CrossBaseline() {
    	requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(Constants.CROSS_BASELINE_TIMEOUT);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.Drive(Constants.CROSS_BASELINE_SPEED, 0, 0);
    	/*if (isTimedOut()){
    		driveTrain.Drive(0.0, 0.0, 0.0);
    	}*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();   
    }

    // Called once after isFinished returns true
    protected void end() {
    	driveTrain.Drive(0.0, 0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
