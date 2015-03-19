//Riley Amelio
//CSE02
//Write a program that forces the user to enter an integer between 1 and 30, inclusive, and then prints out displays that depend on the value entered


import java.util.Scanner;
public class waves {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 30: ");

        int input = myScanner.nextInt();



        System.out.println("FOR LOOP:");

        for (int i = 1; i < input; i++) { //Puts each number on its own line 
            for (int x = 0; x < i; x++) { //Prints out the rows Ex: Will print two rows of 2, three rows of 3 etc.  
                if (i % 2 == 1) { //check if odd or even
                    System.out.print(" ");
                    for (int h = 0; h < i - x; h++) { //if odd then it creates the width of wave 
                        System.out.print(i);

                    }
                    System.out.println(""); //Creates a new line 
                }
                else {
                    for (int h = 0; h < 1 + x; h++) { //if even then it the width of even wave
                        System.out.print(i);
                    }
                    System.out.println(""); //create new line
                }

                System.out.println(""); //Prints a new line 
            }

            System.out.println("WHILE LOOP:");

            int d = 1;
            while (d < input) { //Puts each number on its own line 
                int x = 0;
                while (x < d) { //Prints out the number of rows 
                    if (d % 2 == 1) { //check if odd or even
                        System.out.print("");
                        int h = 0;
                        while (h < d - x) { //if odd then it creates the width of wave 
                            System.out.print(i);
                            h++;
                        }

                    }
                    else {
                        int h = 0;
                        while (h < 1 + x) { //Creates the amount of numbers that will be printed per line 
                            System.out.print(i);
                            h++;
                        }
                    }
                    System.out.println(""); //New line 
                    x++;
                }
                d++;
                System.out.println("DO-WHILE LOOP:");
                b = 1;
                do {
                    int x = 0;
                    do {
                        int g = 0;
                        if (d % 2 == 1) {
                             System.out.print("");}
                             do {
                                 h=0;
                                 while (h < d - x);
                                 System.out.print(i);
                                h++;
                             }
                       else { 
                           do {
                             int h = 0;
                             while (h < d - x); //if odd then it creates the width of wave 
                            
                    } while (y < 2 * i - 1); //Prints out the proper number of dashes  
                    System.out.println("");
                    i++;
                } while (i <= input); //Prints each number on its own line 


            }
        }

    }
}
}