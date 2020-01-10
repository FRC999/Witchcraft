package frc.robot.witchcraft;

import com.kauailabs.navx.frc.*;
import edu.wpi.first.wpilibj.SPI;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



/**
 * This is a class that manages a NavX
 * In proper implementations, this will 
 */
public class NavXBase extends SubsystemBase{
    AHRS NavX;
    /**
     * This constructs the navx: it can throw an exception if the NavX is not found
     */
    public NavXBase(){//PUT ARGUMENTS WHEN WE NEED THEM
        try {
            NavX = new AHRS(SPI.Port.kMXP);//TODO: Check port num
        } catch (RuntimeException ex) {
            //TODO:  We need to set up a drivers system output system: perhaps Robot.java should catch it
            //Or we could output to the driver system directly, as they do in their example
            //DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
        }
        
    }

    @Override
    public void periodic() {
        //runs every scheduler run
    }

    /**
     * Gets the pitch of the robot
     * (pitch is rotation around the horisontal axis perpendicular to straight forward)
     * 
     * @return The pitch of the robot
     */
    public double getPitch(){
        return NavX.getPitch();
    }
    /**
     * Gets the roll of the robot
     * (roll is the leaning around the axis that goes straight forward)
     * @return
     */
    public double getRoll(){
        return NavX.getRoll();
    }
    /**
     * Gets the yaw of the robot
     * (yaw is the direction that the robot is facing around an axis that shoots straight up)
     * @return
     */
    public double getYaw(){
        return NavX.getYaw();
    }
    
}