import java.util.Scanner;

public class table {

   public static void tableN (int n) {

    System.out.print("Enter a Number : ");

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for ( int i = 1; i <=10; i++ ) {
        int mult = i * n;
        System.out.println( n + " * " + i + " = " + mult );
    }
    return ;
   }



    public static void main ( String args [] ) {
    
    int n = 0;
    tableN(n);

    }
}

