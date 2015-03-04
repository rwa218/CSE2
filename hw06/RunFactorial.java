//Riley Amelio
//CSE 2
//use while-loop to solve factorial programs. Using scanner, input an integer that is between 9 and 16 inclusively. Then  calculate the factorial of the input number.
import java.util.Scanner; //import a scanner
public class RunFactorial { //create a class
    public static void main(String[] arg) { //main string

        Scanner scan = new Scanner(System.in);//assign scanner
        System.out.println("Enter a input that is between 9 and 16: ");//prompt user for input
        int number = scan.nextInt();//declare number is that input
        int factorial = 1;//declare int needed for the loop
        int i = 1;
        while (i <= number) { //start loop, make it so i will increase by one and rerun loop until it is equal to the number
            if (number > 9 && number < 16) {//if statement to make sure parameters are followed
                factorial = factorial * i;//multiply each factorial till total is reached
                    i++;//increment i by 1 
            }
            
            else {
                System.out.println("Invalid input, enter again!");//print statement
                number = scan.nextInt();//reassign number to repeat loop fresh
                    
                }
            }
            System.out.println(factorial);//print factorial

        }
    }
