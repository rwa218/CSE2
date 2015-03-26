import java.util.Scanner;
public class loopsPrac{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k= scan.nextInt();
        int i=0;
        for (i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
          if (i%2==0){
              
                for(int g = 1;g<=j;g++){
                    System.out.print(i);
                }
                System.out.println();
              }
          else{
                for(int g = i-j;g>=0;g--){
                    System.out.print(i);
          }
            System.out.println();
            }
        }
       // System.out.println("here");
    }
}
}