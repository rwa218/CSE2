//Riley Amelio
//CSE 2
//this program prompts the user for a 5 digit integer  and gets the sum of the digits of that integer
import java.util.Scanner;//import a scanner

public class GetIntegers {//create a class

    public static void main(String args[]) {//create a main string

        Scanner scan = new Scanner(System.in);//declare scanner
        System.out.println("Please enter 5 positive integers: ");//print statement
        int add = 0;//declare variables
        int sum = 0;
        int integer1;
        for (int i = 0; i < 5; i++) { //use loop to make the program run 5 times for 5 integers
            //scan.next();
            if (!scan.hasNextInt()) { // if it isnt a int then print then prompt for an int again
                System.out.println("You did not enter a positive or valid integer, please try again");
                scan.next();
                i--; //restart since a int wasnt entered
            }
            else {
                integer1 = scan.nextInt();//input int
                add += integer1;  //add each input integer to each other
                sum = add;
            }

        }
        System.out.println(sum); //print the final sum

    }
}
