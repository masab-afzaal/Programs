import java.util.*;

public class sumofoddnum {
    public static void sumodd ( int n ) {
        int sum = 0;
        for ( int i = 1; i <= n; i++) {
            if ( i % 2 != 0 ) {
             sum = (sum + i);
            }
    
        }
        System.out.println(sum);
        return;
    }
    
    public static void main ( String args [] ) {
    
    System.out.println( "Enter a Number : ");
    
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    System.out.println("Sum of Odd Numbers is " );
    sumodd(n);


    }
}
