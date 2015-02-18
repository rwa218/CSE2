//Riley Amelio
//CSE 02
//WhichNumber program prompts the user to input multiple answers to the programs
//guesses, which eventually allow the program to guess the number the user was 
// thinking of
import java.util.Scanner;

public class WhichNumber{
    // main method required
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);// Asks the user to enter a value
    System.out.println("Think of a number between 1 and 10 inclusive"); //print statement
    System.out.println("Is the number even? ");//ask question
    String even = scan.nextLine(); //create string
    switch (even){ // name switch
        default: System.out.println("Sorry! Your input is not valid!"); //make it so only y or n works
        return;
        
        case "Y": case "y": //first option yes
           System.out.println("Is it divisible by 3?"); //print statement
           String yes1 = scan.nextLine(); // stores variable for yes or no
           
           switch (yes1){//tells what case to use for given input
               default: System.out.println("Sorry! Your input is not valid!");//make it so only y or n work
                return;
               case "y": case "Y": //make a case where y or Y give next line
                   System.out.println("Your number is 6!"); break;//print statement then stop program by breaking
                   
                case "N": case "n":
                    System.out.println("Is your number divisible by 4?");
                    String no1 = scan.nextLine(); // stores variable for yes or no
                    switch (no1){//tells what case to use for given input
                        default: System.out.println("Sorry! Your input is not valid!");
                        return;
                        case "y": case "Y":
                        System.out.println("Is the number divisible by 4 greater than 1?");
                        String yes2 = scan.nextLine(); // stores variable for yes or no
                        switch (yes2){//tells what case to use for given input
                            default: System.out.println("Sorry! Your input is not valid!");
                            return;
                            case "y": case "Y":
                                System.out.println("Your number is 8!"); break;//print statement then stop program by breaking
                            case "N": case "n":
                                 System.out.println("Your number is 4!"); break;//print statement then stop program by breaking
                        }break;//break program
                        
                        case "N": case "n":
                             System.out.println("Is your number divisible by 5?");
                             String no2 = scan.nextLine();// stores variable for yes or no
                             switch (no2){//tells what case to use for given input
                                default: System.out.println("Sorry! Your input is not valid!");
                                return;
                                case "y": case "Y":
                                System.out.println("Your number is 10!"); break;//print statement then stop program by breaking
                                case "N": case "n":
                                System.out.println("Your number is 2!"); break;//print statement then stop program by breaking
                             }
                             break;//end program
                    }
           }
        case "N": case "n": //create value
            System.out.println("Is it divisible by 3?");//what happens when the value matches 
            String yes3 = scan.nextLine();// stores variable for yes or no
            switch (yes3){//tells what case to use for given input
                default: System.out.println("Sorry! Your input is not valid!");
                return;
                case "y": case "Y"://create values
                System.out.println("When divided by 3 is the result greater than 1?");//what happens when the value matches
                String yes4 = scan.nextLine(); // stores variable for yes or no
                switch (yes4){//tells what case to use for given input
                    default: System.out.println("Sorry! Your input is not valid!");//make it so only y or n work
                    return;
                    case "y": case "Y":
                    System.out.println("Your number is 9!"); break;//what happens when the value matches, end program
                    case "n": case "N":
                    System.out.println("Your number is 3!"); break;//what happens when the value matches,end program
                } break;
                case "n": case "N":
                System.out.println("Is it greater than 6?");
                String yes5 = scan.nextLine();
                switch (yes5){//tells what case to use for given input
                    default: System.out.println("Sorry! Your input is not valid!");
                    return;
                    case "y": case "Y":
                    System.out.println("Your number is 7!"); break;
                    case "n": case "N":
                    System.out.println("Is it less than 3?");
                    String yes6 = scan.nextLine();
                    switch (yes6){//tells what case to use for given input
                       default: System.out.println("Sorry! Your input is not valid!");
                        return;
                        case "y": case "Y":
                        System.out.println("Your number is 1!"); break;
                        case "n": case "N":
                        System.out.println("Your number is 5!"); break;
                        
                    }
                }
            }
    }
    
    
    }
}//end of program