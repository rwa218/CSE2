//CSE 02
//Riley Amelio
//Banking transactions
//Start the user off with a random amount between 1,000 and 5,000 in their bank account using the java.util.Random library or the Random function in the java.lang.Math library. Then offer them the choice of depositing money, withdrawing money, or viewing their balance. If they choose to deposit, ask them how much they want to deposit and make sure they enter a positive number. Then print their resulting balance. If they choose to withdraw, ask them how much they want to withdraw and make sure it is a positive number no more than the amount in their account. Then print the resulting balance. 

import java.util.Scanner; //import scanner

public class Banking{
    // main method required
    public static void main(String[] args) {
        int randomBalance = (int)((Math.random()*(5000 - 1000))+ 1000);//generates random number for account balance
        Scanner myscanner = new Scanner(System.in);// Asks the user to enter a value
        System.out.println("Would you like to view your balance? "); //ask the user a question
        String viewbalance = myscanner.nextLine();// stores variable for yes or no
        switch (viewbalance){ //tells what case to use for given input, use a switch cause its easier than using if else
            case "Y": case "y": //if input is yes
            System.out.println("Your balance is " + randomBalance);//then system prints your new balance
            case "N": case "n": //if input is no
            System.out.println("Would you like to withdraw from your account?");//then system prints your new balance
        String withdraw = myscanner.nextLine();// stores variable for yes or no
        switch (withdraw){//tells what case to use for given input
            default: System.out.println("Sorry your input is not valid");//backup if y or n isnt entered
            return;
            
            case "Y": case "y":
                System.out.println("How much would you like to withdraw?");//prompt user for number
                int nWithdraw = myscanner.nextInt();
                System.out.print("Your new balance is ");//then system prints your new balance
                System.out.println(randomBalance-nWithdraw); break;
                
            case "N": case "n":
                System.out.println("Okay, would you like to deposit money into your account?");
                String deposit = myscanner.nextLine();// stores variable for yes or no
                switch (deposit){//tells what case to use for given input
                    default: System.out.println("Sorry your input is not valid");
                    return;
                    
                    case "Y": case "y"://if yes then program prompts
                        System.out.println("How much money would you like to deposit?");//ask how much money to deposite
                        int nDeposit = myscanner.nextInt();//how much user wants to deposite
                        int newBalance = nDeposit+randomBalance;//make new balance 
                        System.out.println("Your new balance is " + newBalance);//system prints your new balance
                }
        }
            
        }
    }
}//end of program
        