import java.util.Scanner; //importing scanner function
public class FourDigits{
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        System.out.print("Enter a double I display the four digits to the right decimal point: ");//
        double nFourDigits= myScanner.nextDouble();
        
        double digit= nFourDigits=myScanner.nextDouble();
        
        int digit1= (int) digit;
        double digit4= digit1%10;
        
        double digit4$= digit1/10;
        int digit3= (int) digit4$;
        double digit3$= digit3%10;
        int digit3Final= (int) digit3;
        
        double digit3$$= digit4$/10;
        double digit2= (int) digit3$$;
        double digit2$= digit3$$%10;
    }
}