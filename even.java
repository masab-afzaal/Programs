import java.util.*;

public class even {
    
   public static void Even ( int n ) {

    System.out.println("Enter a Number : ");

    Scanner sc = new Scanner(System.in); 
    n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println( n + " is Even");
        }
        else {
            System.out.println( n + " is Odd");
        }
        return ;
    }   
    
    public static void main(String args[]) {
       int a = 0;
       Even (a);

    }
}
