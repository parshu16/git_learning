package NUMBER_PROGRAMS;
import java.util.Scanner;
public class NTHFIBO {
    static int fibonancci(int n){
        int a=0,b=1,c=1;
        for(int i=1;true;i++){
            if(i==n) return c;
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[]aStrings){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(fibonancci(n));
    }
}
