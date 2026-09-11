package NUMBER_PROGRAMS;

import java.util.Scanner;

class MULTIPLICATION {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        multiplication(n);
    } 
}
