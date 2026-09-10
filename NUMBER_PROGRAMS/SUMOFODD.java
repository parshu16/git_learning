package NUMBER_PROGRAMS;

import java.util.Scanner;

public class SUMOFODD {
     static int sum(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start:");
        int start=sc.nextInt();
        System.out.println("Enter end:");
        int end=sc.nextInt();
        System.out.println(sum(start,end));
    }
}
