import java.util.*;
public class fibonacci {
    public static void main ( String args [] ) {

        System.out.print("enter nth times number : ");
        
        Scanner sc = new Scanner ( System.in);
        int n = sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print("0 1");        
        for ( int i = 3; i <= n; i++) {
            n3=n1+n2;
            
            System.out.print(" " + n3);
            
            n1=n2;
            n2=n3;
        }

    }
    
}
