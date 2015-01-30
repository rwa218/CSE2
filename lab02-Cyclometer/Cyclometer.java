// Riley Amelio 
// 1/30/2015 CSE 2
// The purpose of this program is to record the time
// elasped and number of rotations of the front wheel
// of a bicycle
public class Cyclometer{
    //main method required for every java program
  public static void main(String [] args){
	int secsTrip1=480;  //number of seconds for 1st trip
	int secsTrip2=3220;  //number of seconds for 2nd tip
	int countsTrip1=1561;  //number of rotations(counts) 1st trip
	int countsTrip2=9037; //number of rotations 2nd
	double wheelDiameter=27.0,
  	PI=3.14159, // this is pi
  	   feetPerMile=5280,  //number of feet in a mile
  	   inchesPerFoot=12,   //number of inches in a foot
  	   secondsPerMinute=60;  //number of seconds in a minute
	double distanceTrip1, distanceTrip2,totalDistance; // the trials for trip 1 and 2 and their sum
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
       	//We are calculating the time, distance, and wheel rotations of the bicycle trips
       	//Trip 1 took 8.0 minutes and had 1561 counts.
        //Trip 2 took 53.666666666666664 minutes and had 9037 counts.
        //Trip 1 was 2.0897820980113635 miles
        //Trip 2 was 12.098245240056817 miles
        //The total distance was 14.188027338068181 miles
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
	System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
  } //end of main method
} //end of class
