//CSE 2
//Riley Amelio
//This program has the user input 15 different grades then create an array, next the user calls a number then the array gives back the number if it is in the array
import java.util.Scanner;//import scanner
import java.util.Random;//import random
public class CSE2Linear {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in); //declare scanner
        System.out.println("Enter 15 ints for final grades in CSE2: ");//print ln
        int array[] = new int[15];//create an array
        int number = 0;//declare var
        for (int i = 0; i <= 14; i++) {//for loop for inputed num to put into an array
            if (scanner.hasNextInt()) {//if it is a int inputted

                number = scanner.nextInt();//declare number
                array[i] = number;//set array for the current loop for one element

                if (number > 100 || number < 1) {//checking to see if valid input
                    if (i != 0) {
                        if (array[i] < array[i - 1]) {
                            i = i - 1;
                            scanner.nextLine();
                            System.out.println("Number is out of range");
                        }
                        else {
                            System.out.println("Number is out of range");
                        }
                    }
                }




            }

        }
        System.out.print("The grades, sorted, are: ");//print ln
        for (int j = 0; j <= 14; j++) {//for loop to print inputted array

            System.out.print(array[j] + " ");//print ln
        }
        System.out.print("\nEnter a grade to search for: ");//prompt user
        int search1 = scanner.nextInt();//declare search as the input

        int binarysearch = binary(array, search1);//call binary search method
        if (binarysearch == -1) {//if num isnt found then...
            System.out.println(search1 + " was not found in the list with 4 iterations");
            int[] scramblearray = scramble(array);//declare array for scramble
            System.out.print("Scrambled: ");//print ln
            for (int j = 0; j <= 14; j++) {//for loop to randomize order of arrays

                System.out.print(scramblearray[j] + " ");
            }
            System.out.println("\nEnter a grade to search for: ");//print ln
            search1 = scanner.nextInt();//declare search1 as input


            int linearsearch = linear(scramblearray, search1);//call linear search method
            if (linearsearch == -1) {//if input isnt found
                System.out.println(search1 + " was not in the list with 15 iterations");
            }
            else {//else do
                System.out.println(search1 + " was found in the list with " + (linearsearch + 1) + " iterations");
            }

        }
        else {
            System.out.println(search1 + " was found in the list with " + binarysearch + " iterations");
        }

    }
    public static int linear(int[] array, int search1) {//method for linear search
        for (int k = 0; k <= 14; k++) {//for loop to check if the input matches an element in the array
            if (search1 == array[k])//if match then return the index k
                return k;

        }
        return -1;//if no match return -1
    }
    public static int binary(int array[], int search1) {//binary search method
        int first = 0;//declare ints
        int last = 14;
        int middle = (first + last) / 2;//average first and last to get middle number
        int x = 1;
        while (first <= last) {//while loop to do a binary search (splitting each section into halves)
            if (array[middle] < search1)//if first to middle is less than input
                first = middle + 1;//then first = middle +1
            else if (array[middle] == search1) {//if middle = input then return x
                return x;
            }
            else//else
                last = middle - 1;//keep going with loop but with halve the numbers

            middle = (first + last) / 2;//seen here
            x++;
        }
        return -1;//if nothing is found return -1

    }
    public static int[] scramble(int array[]) {//create scramble method
        Random rand = new Random();//create random function
        for (int i = 14; i > 0; i--) {//loop to shuffle order of array
            int x = rand.nextInt(i + 1);//declare x
            int y = array[x];//declare y
            array[x] = array[i];//change order
            array[i] = y;//change order
        }
        return array;//return shuffled array
    }
}//end program
