// CSE 02
// Riley Amelio
// This program gives the user the distance traveled and average speed on the bicycle
import java.util.Scanner;
public class Bicycle{
        public static void main(String [] args){
            Scanner myScanner; 
            myScanner = new Scanner (System.in);
            // Asks the user to enter a value for counts
            System.out.print("Enter number of counts on the cyclometer ");
            int nCounts= myScanner.nextInt(); //Get the scanner to accept integer
            System.out.print("Enter number of seconds during the counts ");
            int nSecondsTraveled= myScanner.nextInt(); //allows user to input value
            //Calculate Output, distance traveled, and average MPH
            // Declare variables first
            double WheelDiameter=27; //diameter of wheel
            double secondsPerMinute=60; // seconds in a minute
            double feetPerMile=5280; // feet in a mile
            double Pi=3.14; // pi 
            double inchesPerFoot=12; // inches in a foot
            
            // Calculate total distance of trip
            double DistanceTraveled=nCounts*WheelDiameter*Pi; //distance of trip in inches
            DistanceTraveled/=inchesPerFoot*feetPerMile; // distance of trip in miles
            
            //Calculate the number of minutes traveled
            double minutesTraveled= nSecondsTraveled/60; //Convert seconds to minutes
            int minutesTraveled$= (int)minutesTraveled*100; //Simplifying the number by casting this back to an int
            minutesTraveled= (double)minutesTraveled$/100; // Now simplified as a double
            //Calculate MPH
            double hoursTraveled= minutesTraveled/60; // Convert minutes to hours
            double MPH= DistanceTraveled/hoursTraveled; //Calculate MPH of trip
            int MPH$= (int)(MPH*100); //Simplifying MPH by converting to an int
            MPH= (double) MPH$/100.0; //converting it back to a double
            
            int DistanceTraveled$= (int) (DistanceTraveled*100); //SImplifying again
            DistanceTraveled= (double) DistanceTraveled$/100; //Converting back to a double
            // Prints out the distanced traveled
            System.out.print("Distance Traveled was ");
            System.out.println(DistanceTraveled);
            // Prints the average MPH of the trip
            System.out.print("The average MPH was ");
            System.out.println(MPH);
            
            
        }         
}           