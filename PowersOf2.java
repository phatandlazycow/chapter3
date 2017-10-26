//Here are the first 4 powers of 2:
//2^0 = 1
//2^1 = 2
//2^2 = 4
//2^3 = 8
 
// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;
 
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        //How many powers of 2 to compute
            int nextPowerOf2 = 1;        //Current power of  2
            int exponent;                //Exponent for current power of 2 -- this
                                         //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed?");
            numPowersOf2 = scan.nextInt();
                    
            //print a message saying how many powers of 2 will be printed
            System.out.println(numPowersOf2 +" Powers of 2 will be printed");
            
            //initialize exponent -- the first thing printed is 2 to the what?
            
 
            for (int x=1; x<numPowersOf2+1;x++)
            {
                    //print out current power of 2
                System.out.println("2 to the "+x + " is "+nextPowerOf2);
                
                //find next power of 2 -- how do you get this from the last one?
                nextPowerOf2 = nextPowerOf2*2;
                //increment exponent
            }
        }
}