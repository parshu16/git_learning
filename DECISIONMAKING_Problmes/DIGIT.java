package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class DIGIT {
    static String isDIGIT(char c){
        if(c>=48&&c<=57) return "it's a digit";
        return "not a digit";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        char ch=sc.next().charAt(0);
        System.out.println(isDIGIT(ch));

    }
}
