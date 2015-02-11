//CSE012
//Riley Amelio
//hw03 part 2
//This program allows the user to input a number and get back its cube root
public class Root{
    public static void main(String[] args) { 
        Scanner myScanner; // declaring a variable
        myScanner = new Scanner (System.in);
        System.out.print("Enter a number"); //prints enter a number to the user
        double cubeRoot= myScanner.nextDouble(); //created a cuberoot variable and allows the scanner to accept a double
        // Calculate cube root 
        double guess= cubeRoot/3;
        double guess2= (2*guess*guess*guess+cubeRoot)/(3*guess*guess); //First attempt at guess
        double guess3= (2*guess2*guess2*guess2+cubeRoot)/(3*guess2*guess2); //2nd more accurate guess
        double guess4= (2*guess3*guess3*guess3+cubeRoot)/(3*guess3*guess3); //3rd improved guess
        double guess5= (2*guess4*guess4*guess4+cubeRoot)/(3*guess4*guess4); //4th attempt
        double guess6= (2*guess5*guess5*guess5+cubeRoot)/(3*guess5*guess5); //5th attempt
        // Print the cube root of the original number
        System.out.print("The cube root is");
        System.out.println(guess6);
        double answer= guess6*guess6*guess6;
        System.out.print(guess6);
        System.out.print("*");
        System.out.print(guess6);
        System.out.print("*");
        System.out.print(guess6);
        System.out.print("=");
        System.out.println(answer);
    }
    }
