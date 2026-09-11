package NUMBER_PROGRAMS;

import java.util.Scanner;

class CHECKFACTORS {
    static String checking(int n1,int n2){
        if(n1%n2==0) return "yes it is a factor";
        return "not a factor";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println(checking(a, b));
    }
}
