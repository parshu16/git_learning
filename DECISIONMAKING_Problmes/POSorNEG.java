package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class POSorNEG {
    static String posorneg(int n){
        if(n>=0) return "positive nbr";
        return "negative nbr";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(posorneg(n));
    }
}

