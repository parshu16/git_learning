package NUMBER_PROGRAMS;

import java.util.Scanner;

public class FIRST10EVEN {
    static void even(int n){
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
           System.out.println(i); 
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter n:");
        // int n=
        //System.out.println(even());
        even(10);
    }
}
