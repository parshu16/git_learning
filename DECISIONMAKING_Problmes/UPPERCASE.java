package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class UPPERCASE {
    static String Uppercase(char c){
        if(c>=65&&c<=90) return "UPPERCASE";
        return "LOWERCASE";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=sc.next().charAt(0);
        System.out.println(Uppercase(c));
    }
}
