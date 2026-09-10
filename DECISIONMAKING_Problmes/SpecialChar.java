package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class SpecialChar {
    static String specialcharacter(char c){
        if(c>65&&c<=90||c>=97&&c<=122||c>=48&&c<=57||c==32) return "not a special character";
        return "special character";
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        char ch=sc.next().charAt(0);
        System.out.println(specialcharacter(ch));

    }
}

