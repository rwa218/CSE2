//Riley Amelio
//CSE 02
//This program generates a random array list then requires a pos input then It should create a new array that has one member fewer than list, and be composed of all of the same members except the member in the position pos.  

import java.util.Scanner;
import java.util.Random;//import scanner and random
public class RemoveElements {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);//declare scanner
        int num[] = new int[10];//create ints
        int newArray1[];
        int newArray2[];
        int index, target;
        String answer = "";
        do {//create do loop
            System.out.print("Random input 10 ints [0-9]");//print line
            num = randomInput();//random num
            String out = "The original array is:";//string
            out += listArray(num);//new var
            System.out.println(out);//print

            System.out.print("Enter the index ");//print ln
            index = scan.nextInt();//create index of arrays
            newArray1 = delete(num, index);
            String out1 = "The output array is ";//string 
            out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
            System.out.println(out1);

            System.out.print("Enter the target value ");
            target = scan.nextInt();
            newArray2 = remove(num, target);
            String out2 = "The output array is ";
            out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
            System.out.println(out2);

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {//create new method
        String out = "{";//string 
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
    public static int[] randomInput(){//create a new method
        int first[] = new int[10];//create an array
        for (int i = 0; i < 10; i++){//create for loop
            first[i] =(int) (Math.random()*10);//generate number for each element
        }
        return first;//return the comp blete array
        
    }
    public static int[] delete(int list[], int pos){//create new method
        int numbers[] = new int[list.length-1];// create new array
        for (int p = 0; p<pos; p++){//for loop
            numbers[p]=list[p];
            
        }
        for (int z = pos; z < list.length-1; z++){//for loop
            numbers[z] = list[z+1]; //make sure the pos is checked and executed
        }
        return list;//return new array
        
    }
    public static int[] remove(int list[], int target){//create new method
        int tar[] = new int[list.length-1];
        for(int o=0;0<10; o++){//create loop to check for target
             
            if (target == (list[o])){//if its the number that inputted then it is skipped
                 continue;//skip the loop
            }
            else{
                
            }
           
        }
         return list;//return new array
            
        }
    }
   