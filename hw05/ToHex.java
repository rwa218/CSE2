//Riley Amelio
//CSE 02
//You will develop a program which takes decimal RGB values (three inputs) and convert them to hexadecimal. For example, the color white is represented in hexadecimal as FFFFFF. Here are some sample runs to help you understand your program’s goal.
import java.util.Scanner;//import scanner
public class ToHex{//create class
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in); //create new scanner
        System.out.println("Please enter three numbers representing RGB values: ");//tell user to input RGB value
        int R = scan.nextInt();//create ints for each number entered
        int G = scan.nextInt();
        int B = scan.nextInt();
        //make it so only 0-255 are acceptable inputs
        if (R>255 || R<0 || G>255 || G<0 || B>255 || B<0){
            System.out.println("Please input valid integers between 0-255");
            return;
        }
        //create ints for each digit then do first step of hexadecimal conversion
        int H1 = R/16;
        int H2 = R%16;
        int H3 = G/16;
        int H4 = G%16;
        int H5 = B/16;
        int H6 = B%16;
        String hex = " ";//create string to convert int to strings
        
        //create switch for each digit
        switch (H1){
            case 10 ://if digit =10 then it equals A
                hex += "A";
                break;
            case 11 ://if digit =11 then it equals B
                 hex += "B";
                break;
            case 12 : //if digit =12 then it equals C
                hex += "C";
                break;
            case 13 : //if digit =13 then it equals D
             hex += "D";
                break;
            case 14: //if digit =14 then it equals E
                 hex += "E";
                break;
            case 15 : // if digit =15 then it equals F
                hex += "F";
                break;
            default: // if digit equals 1-9 then it prints the digit
                hex+= H1;
                break;
        }
        switch (H2){//same thing as before but for H2
            case 10 :
                hex += "A";
                break;
            case 11 :
                 hex += "B";
                break;
            case 12 :
                hex += "C";
                break;
            case 13 :
             hex += "D";
                break;
            case 14:
                 hex += "E";
                break;
            case 15 :
                hex += "F";
                break;
            default:
                hex+= H2;
                break;
        }
        switch (H3){
            case 10 :
                hex += "A";
                break;
            case 11 :
                 hex += "B";
                break;
            case 12 :
                hex += "C";
                break;
            case 13 :
             hex += "D";
                break;
            case 14:
                 hex += "E";
                break;
            case 15 :
                hex += "F";
                break;
            default:
                hex+= H3;
                break;
        }
        switch (H4){
            case 10 :
                hex += "A";
                break;
            case 11 :
                 hex += "B";
                break;
            case 12 :
                hex += "C";
                break;
            case 13 :
             hex += "D";
                break;
            case 14:
                 hex += "E";
                break;
            case 15: 
                hex += "F";
                break;
            default:
                hex+= H4;
                break;
        }
        switch (H5){
            case 10 :
                hex += "A";
                break;
            case 11 :
                 hex += "B";
                break;
            case 12 :
                hex += "C";
                break;
            case 13 :
             hex += "D";
                break;
            case 14:
                 hex += "E";
                break;
            case 15 :
                hex += "F";
                break;
            default:
                hex+= H5;
                break;
        }
        switch (H6){
            case 10 :
                hex += "A";
                break;
            case 11 :
                 hex += "B";
                break;
            case 12 :
                hex += "C";
                break;
            case 13 :
             hex += "D";
                break;
            case 14:
                 hex += "E";
                break;
            case 15 :
                hex += "F";
                break;
            default:
                hex+= H6;
                break;
        }
        System.out.println("The decimal numbers "+" R: "+R+" G: "+G+" B: "+B+ " is represented in hexadecimal as: "+hex);//Print out final hexadecimal number that was  converted from a RGB value
                
        }
        }
    
