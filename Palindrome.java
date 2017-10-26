import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word= scan.next();
        boolean works = true;
        int len = 0;
        int worklength =0;
        while(len<word.length()&&works==true){
            if(word.substring(len,len).equals( word.substring(word.length()-1-len))){
                System.out.print(word.substring(len,len)+"and ");
                System.out.println(word.substring(word.length()-1-len)+" works");
                worklength+=1;
                len++;
            }
            else{
                System.out.print(word.substring(len)+"and ");
                System.out.println(word.substring(word.length()-len)+"doesn't work"); 
                works=false;
            }
        }
        if (worklength == word.length()){
            System.out.println("Word is a palindrome");
        }
        else{
            System.out.println("word isn't a palindrome");
        }
    }
}