package NUMBER_PROGRAMS;

import java.util.Scanner;
//product of n
public class PRODUCTOFN {
    static int product(int n){
        int product=1;
        while(n>0){
            int rem=n%10;
            product*=rem;
            n/=10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println(product(n));
    }
}
