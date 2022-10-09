import java.util.*;

public class CircumOCircle {
    public static double circumferenceOfCircle ( double r ) {
       
        return 2 * 3.14 * r;
    }

    public static void main ( String args [] ) {
      System.out.println(" Enter radius of a Circle : ");
      
        Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();

      System.out.println( circumferenceOfCircle(r) );
      
    }
}