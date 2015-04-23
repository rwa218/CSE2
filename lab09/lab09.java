//CSE 02
//riley amelio
//

import java.util.Random;
import java.util.Scanner;
public class lab09 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        boolean d=true;
        while (d == true) {
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(10);
            System.out.println("The");
            System.out.print(" ");
            System.out.print(ad(randomInt));
            System.out.print(" ");
            System.out.print(color(randomInt));
            System.out.print(" ");
            System.out.print(noun(randomInt));
            System.out.print(" ");
            System.out.print(past(randomInt));
            System.out.print(" ");
            System.out.print("the");
            System.out.print(" ");
            System.out.print(ad(randomInt));
            System.out.print(" ");
            System.out.print(noun(randomInt));
            System.out.println();
            System.out.print("Enter 2 for a new sentence:");
            int go = scan.nextInt();
            if (go!=2) {
                d = false;
            }

        }
    }
    public static String noun(int a) {
        switch (a) {
            case 1:
                return "yeti";
            case 2:
                return "moose";
            case 3:
                return "woman";
            case 4:
                return "man";
            case 5:
                return "monkey";
            case 6:
                return "robot";
            case 7:
                return "snake";
            case 8:
                return "snail";
            case 9:
                return "fox";
            case 0:
                return "kangaroo";
            default:
                return "fox";
                
        }
        
    }
    public static String color(int b) {
        switch (b) {
            case 1:
                return "black";
            case 2:
                return "brown";
            case 3:
                return "yellow";
            case 4:
                return "white";
            case 5:
                return "black";
            case 6:
                return "cream";
            case 7:
                return "green";
            case 8:
                return "red";
            case 9:
                return "tan";
            case 0:
                return "pale";
            default:
                return "pale";
        }
    }

    public static String past(int c) {
        switch (c) {
            case 1:
                return "hit";
            case 2:
                return "aimed";
            case 3:
                return "smacked";
            case 4:
                return "caressed";
            case 5:
                return "cherished";
            case 6:
                return "made";
            case 7:
                return "passed";
            case 8:
                return "punched";
            case 9:
                return "abused";
            case 0:
                return "loved";
            default:
                return "punched";
        }
    }
    public static String ad(int d) {
        switch (d) {
            case 1:
                return "quick";
            case 2:
                return "strong";
            case 3:
                return "fast";
            case 4:
                return "slow";
            case 5:
                return "narcoleptic";
            case 6:
                return "angry";
            case 7:
                return "sluggish";
            case 8:
                return "loving";
            case 9:
                return "lazy";
            case 0:
                return "speedy";
            default:
                return "speedy";
        }
    }
}