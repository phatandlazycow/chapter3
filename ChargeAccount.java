import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount{
    //instance variables
    double previousBalance;
    double additionalCharges;
    double interest;
    double newBalance;
    double minimumPayment;
    
    public void findVariables(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter previous balance:");
        previousBalance=scan.nextDouble();
        System.out.println("enter additional charges");
        additionalCharges = scan.nextDouble();
    }
    
        public void calculate(){
      newBalance= previousBalance+additionalCharges;
          if (previousBalance == 0){
        interest = 0;
       }
         else{
          interest = (previousBalance+additionalCharges)*.02;
      }
      if(newBalance<50){
        minimumPayment = newBalance;
        }
        else if(newBalance<300){
            minimumPayment=50;
          }
            else{
                minimumPayment = (newBalance)/20;
            } 
    }
        

    public void printOut(){
        System.out.println("CS CARD INTERNATIONAL STATEMENT");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Previous Balance:  "+ previousBalance+("$"));
        System.out.println("Additional charges:  "+additionalCharges+("$"));
        System.out.println("Interest:  "+interest+("$"));
        System.out.println("New Balance:  "+newBalance+("$"));
        System.out.println("Minimum Payment:  "+minimumPayment+ ("$"));
    }
}