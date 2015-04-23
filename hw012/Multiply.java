//Riley Amelio
//CSE 02
//
import java.util.Scanner;
import java.util.Random;
public class Multiply{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int w1 = scanner.nextInt();
        int h1 = scanner.nextInt();
        int w2 = scanner.nextInt();
        int h2 = scanner.nextInt();
        
        int [][] array1 = randomMatrix(h1,w1);
        int [][] array2 = randomMatrix(h2,w2);
        printMatrix(array1);
        printMatrix(array2);
        
    }
    public static int[][] randomMatrix(int w,int h){
        int [][] array = new int[arrayw][arrayh];
        for (int i=0; i < arrayw; i++){
            for (int j = 0; j <arrayh; j++){
                array[i][j] = ((int)(Math.random()*20))=10;
            }
        }
        return array;
    }
    public static void printMatrix(int[][] Array){
        for (int i=0;i<rows; i++){
            for(int j=0;j<cols;j++){
                System.out.println(Array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}