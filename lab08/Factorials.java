//Riley Amelio
//CSE 2 lab 8
//This program has the user input a integer then take the super factorial of it
import java.util.Scanner;//import scanner
public class Factorials {//make a class
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//create scanner called scan
        System.out.println("Please enter a integer: ");//print line
        int sup = scan.nextInt();//take user input and turn into variable
        int sum = 0;//declare sum
        for (int i = 1; i <= sup; i++) {//create loop for first part of factorial
            sum += factorial(i);// + factorail by 1 everytime the loop runs
        }
        print(sum);//print sum
    }
    public static int factorial(int key) {//new method
        int mul = 1;//declare integer
        for (int i = 1; i <= key; i++) {//create second loop to get the super factorial working
            mul *= i;//multiple mul by i everytime the loop runs through
        }
        System.out.println(mul);//print mul
        return mul;//break out of method
    }
    public static void print(int num) {//create new method
        System.out.println("The super factorial is equal to " + num);//print line plus final result
    }
}
