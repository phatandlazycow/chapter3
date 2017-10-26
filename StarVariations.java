import java.util.Scanner;

public class StarVariations{    
        public static void main(String[] args){
        int stars = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number ");
        stars = scan.nextInt();   
        for(int y = stars; y>0; y--){
           System.out.println();
           for(int x=0; x<y; x++){
               System.out.print("*");
           }   
        }    
        for( int y = 0; y<stars; y++){
            System.out.println();
            for (int v=(stars-y); v>0;v--){
                System.out.print(" ");
            }
            for(int x = 0; x<=y;x++){
                System.out.print("*");
            }
        }
        System.out.println("");
        for(int y = stars; y>0; y--){
           System.out.println();
           for (int v=(stars - y);v>0;v--){
            System.out.print(" ");
            }
           for(int x=0; x<y; x++){
               System.out.print("*");
           }   
        } 
        System.out.println(""); 
        for(int y = 0;y<stars;y++){
            System.out.println();
            for(int space = (stars- y)/2;space>0;space--){
                System.out.print(" ");
            }
            for(int x=0;x<y;x++){
                System.out.print("*");
            }
        }
        for(int y = stars;y>0;y--){
            System.out.println();
            for(int space = (stars- y)/2;space>0;space--){
                System.out.print(" ");
            }
            for(int x=0;x<y;x++){
                System.out.print("*");
            }
        }
    }
}