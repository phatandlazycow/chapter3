// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        System.out.println("your play (R,P,S): ");
        personPlay = scan.nextLine();
        
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        //Print computer's play
        //See who won.
        
        
        //if you are seeing this i finished this but accidentally lost all my work, i must have gone on to other problems and forgot about this
    }
}
