import java.util.Scanner;

public class SwapNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping");
        System.out.println("Number a is " + a);
        System.out.println("Number b is " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping");
        System.out.println("Number a is " + a);
        System.out.println("Number b is " + b);
        sc.close();
    }    
}
