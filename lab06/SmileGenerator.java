import java.util.Random;
public class SmileGenerator{

public static void main(String [] args){
    Random randy = new Random();
    
int smile = 0;
    for(int i=0; i<5; i++){
        System.out.println(":)");
    }
        System.out.println("");
smile = 0; 
    
    while (smile < 5);
         System.out.println(":)");
         smile++;
smile = 0;    
    do {
        System.out.print(":)");
            smile++;
    }
    while (smile < 5);
    System.out.println("");
    int smileLimit = randy.nextInt(100);
    smile = 0;
    while (smile < smileLimit){
        System.out.print(":)");
        smile++;
    }
    System.out.println("");
    
    
    System.out.println("");
    smile = 0;
    int lineCount= 0;
    while (smile < smileLimit){
        System.out.println(":)");
        smile++;
        lineCount++;
        if(lineCount == 30){
            System.out.println("");
            lineCount=0;
        }
    }
    System.out.println("");
    System.out.println("");
    smile = 0;
    int lineLimit= 0;
    while (smile < smileLimit){
        System.out.println(":)");
        smile++;
        lineCount++;
        if(lineCount == lineLimit){
            System.out.println("");
            lineLimit++;
            lineCount = 0;
    
    }
    System.out.println("");
}
}
}