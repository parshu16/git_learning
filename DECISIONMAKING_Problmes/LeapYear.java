package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class LeapYear {
    static String leapyear(int n){
        if(n%400==0||n%4==0&&n%100!=0) return "leapyear";
        return "not a leap year";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(leapyear(n));
    }
}

