//Riley Amelio
//CSE 2
//need to use do-while loops and the random number generator to generate an integer between 0 and 100. You will first need to print out the number. If the number is even, you will then print out that number of “*” characters; if the number is odd, then you will print out that number of “&” characters.

public class MakeSymbols{ //create a class
    public static void main(String[] arg){ //create a main method
    int number =(int)( Math.random()*100); //generate a random number between 0 and 100
    int even = number%2;//create a int to see if random number is even
    System.out.println("Random number generated: "+number); //print statement
    System.out.print("The output pattern: ");//print statement
    for(int i=1;i<=number;i++){//create loop
        if (even==0){//if even then print *
            System.out.print("*");
        }
        else{ //if not then print &&
            System.out.print("&");//print statement
        }
    }
    }
}