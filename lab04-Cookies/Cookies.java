//CSE 02
//Riley Amelio
//lab 04
// This program allows the user to input a number of cookies and number of people and then get back
// and get back whether or not the number of cookies for each person is evenly divisible
import java.util.Scanner;

public class Cookies{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			
   			Scanner scannerPerson = new Scanner(System.in);
   			System.out.print("Enter the number of People: ");
   			if(scannerPerson.hasNextInt()){
   			int nPerson = scannerPerson.nextInt();}
            else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                //the program terminates
            }
            
            Scanner scannerCookies = new Scanner(System.in);
            System.out.print("Enter the number of cookies you are planning to buy: ");
            if(scannerCookies.hasNextInt()){
            int nCookies = scannerCookies.nextInt();}
            else{
            System.out.println("You did not enter an int");
            return; //leaves the program
                    //program terminates
            }
            
            Scanner scannerNumber = new Scanner(System.in);
            System.out.print("How many do you want each person to get? ");
            if(scannerNumber.hasNextInt()){
            int nNumber = scannerNumber.nextInt();}
            else{
            System.out.println("You did not enter an int");
            return; //leaves the program
                    //program terminates
            }
            
            if ((nPerson*nNumber)<nCookies){
                System.out.print("You have enough cookies");}
            else
                System.out.print("You do not have enough cookies");
   			}
   			
}  //end of main method   
  	} //end of class
