package NUMBER_PROGRAMS;

import java.util.Scanner;
//even numbers
public class Evennumber {
    static void even(int start,int end){

        for(int i=start;i<=end;i+=2){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter start:");
        // int start=sc.nextInt();
        // System.out.println("Enter end:");
        // int end=sc.nextInt();
        even(2, 20);

    }
}
