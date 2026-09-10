package DECISIONMAKING_Problmes;

import java.util.Scanner;

public class alphabet {
    static String Alphabet(char c){
        if(c>65&&c<=90||c>=97&&c<=122) return "AN ALPHABET";
        return "NOT AN ALPHABET";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        System.out.println(Alphabet(ch));
    }
}

