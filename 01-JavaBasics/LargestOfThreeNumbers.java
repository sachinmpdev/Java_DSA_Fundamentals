import java.util.Scanner;
public class LargestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number a is: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number b is: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number c is: ");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("Largest number:" + a);
        }else if(b>=a && b>=c){
            System.out.println("Largest number::" + b);
        }else{
            System.out.println("Largest number:" + c);            
        }
        sc.close();
    }
}
