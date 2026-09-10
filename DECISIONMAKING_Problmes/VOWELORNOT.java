package DECISIONMAKING_Problmes;

import java.util.Scanner;

class VOWEL {
    static String VOWELORNOT(char c){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "VOWEL";
        
        return "CONSONANT";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=sc.next().charAt(0);
        System.out.println(VOWELORNOT(c));
    }
}
