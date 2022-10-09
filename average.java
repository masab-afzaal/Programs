import java.util.*;

public class average {
    public static double averageOf3( double a,  double b, double c ) {
        return (a + b + c ) / 3 ;
    }

    public static void main ( String args [] ) {

        System.out.println("Enter Three Numbers : ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
 

       System.out.println("The Average is " + averageOf3(a, b, c) ); 
    }
     
}
