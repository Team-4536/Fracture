package org.usfirst.frc.team4536.robot.commands;

import org.usfirst.frc.team4536.utilities.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearScoreRedLeft extends CommandGroup {

    public GearScoreRedLeft() {

    	addSequential(new DriveMotionProfile(Constants.GEAR_SCORE_RED_LEFT_DISTANCE, Constants.DEFAULT_SPEED, Constants.DEFAULT_ACCELERATION, Constants.GEAR_SCORE_RED_LEFT_GOAL_ANGLE, Constants.GEAR_SCORE_RED_LEFT_START_ANGLE, Constants.MOTION_PROFILE_NAVX_PORPORTIONALITY, true));
        addSequential(new DriveMotionProfile(2.0, Constants.GEAR_SCORE_RED_LEFT_START_ANGLE, Constants.GEAR_SCORE_RED_LEFT_START_ANGLE ));

    }
}