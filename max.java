import java.util.*;

public class max {
    public static void maxmin ( int a, int b) {
        if ( a < b) {
            System.out.println( b + " is Greater ");
        }
        else if (a == b) {
            System.out.println(" Both are Same ");
        }
        else {
            System.out.println( a + " is Greater ");
        }
        
    }
    public static void main ( String args [] ) {
        System.out.println("Enter two numbers to find Greater one : ");
        
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt();

        maxmin(a,b);




    }
}
