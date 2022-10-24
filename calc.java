import java.util.*;
 public class calc{
    public static void main(String args [] ){
        int a,b, cal;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        System.out.println("enter number");
        b=sc.nextInt();
        System.out.println("1 add \n 2 sub \n 3 div\n 4 multi");
        ch=sc.nextInt();
        switch(cal){
        case 1:
        System.out.println("the addition of numbers" + (a+b));
        break;
        case 2:
        System.out.println("the subtraction of numbers" + (a-b));
        break;
        case 3:
        System.out.println("the division of numbers"+ (a/b));
        break;
        case 4:
        System.out.println("the multiplication of numbers"+ (a*b));
        break;
        default:
        System.out.println("Wrong Command");
}

        

}

}
