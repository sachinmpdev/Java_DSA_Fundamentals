import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        
        if(num<=1){
            isPrime = false;
        }else{
            for(int i=2; i<=num/2;i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
    

    if (isPrime){
        System.out.print(num + "is a Prime Number");
    }else{
        System.err.print(num + "is not a Prime Number");
    }
    sc.close();
 }
}
