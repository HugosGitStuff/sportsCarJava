// Sports Car Java - A simple OOP example
// This class demonstrates basic object-oriented programming concepts

// class SportsCar
public class SportsCar {

    // add properties/instance variables
    public String maker;
    public String engine;
    public String color;

    // declare method drive speed (performs task)
    // Method now returns a String instead of void
    public String driveSpeed(int speed) {
        // Variable to store speed type
        String speedType;
        
        // check if speed is up to 70
        if (speed <= 70) {
            speedType = "cruise speed";
        }
        // check if speed is between 71 and 130
        else if (speed <= 130) {
            speedType = "fast speed";
        }
        // if speed is above 130
        else {
            speedType = "race speed";
        }
        
        // Return complete car description with speed
        return "The sports car is a/an " + color + " " + maker + " " + engine + " and it's on " + speedType + " at " + speed + "km/h.";
    }

}
