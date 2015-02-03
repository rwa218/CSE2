// Riley Amelio
// CSE 02
// Homework 2
// This program allows the user to figure out the prices of each item and 
// the prices of the sum of the items with and without sales tax

public class Arithmetic{
    public static void main(String[]args){
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    // tax percent value
    double taxPercent=0.06;
    // calculate total value of socks
    double socktotal = nSocks*sockCost$;
    // print sock cost
    System.out.print("Sock cost = $");
    System.out.println(socktotal);
    //calculate glasses cost
    double glassestotal = nGlasses*glassCost$;
    //print glassses cost
    System.out.print("Glasses cost = $");
    System.out.println(glassestotal);
    //calculate envolope total
    double Envolopetotal= nEnvelopes*envelopeCost$;
    //print envolope cost
    System.out.print("Envolope Cost = $");
    System.out.println(Envolopetotal);
    //calculate total cost
    double Totalcost=socktotal+glassestotal+Envolopetotal;
    //print total cost of items
    System.out.print("Total Cost of Items = $");
    System.out.println(Totalcost);
    //calculate sales tax
    double Salestax=Totalcost*taxPercent;
    // Coverting the Sales tax into a simplified number by making it
    // a Double then converting it to an integer and then back to a double
    Double SimplifiedTax= new Double(Salestax*100);
    int s2 = SimplifiedTax.intValue();
    double NewTax = s2/100.0;
    // This is going to print the new simplified value for Sales Tax
    System.out.print("Sales Tax = $");
    System.out.println(NewTax);
    //calculate total cost with sales tax
    double pricePaid= Totalcost+NewTax;
    //print total cost with sales tax
    System.out.print("Actual Price Paid = $");
    System.out.println(pricePaid);
    
    }
    
}