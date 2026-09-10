package DECISIONMAKING_Problmes;


import java.util.Scanner;

class EVEN{

    /*
    USING VOID

    // public static void EVEN(int n){
    //     if(n%2==0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
         
    // }

     */

    /* 
    USING STRING

    // static String ODD(int n){
    //     if(n%2==0) return "EVEN";
    //     return "ODD";
    // }
    */

   
    //USING BOOLEAN

    static boolean EVEN(int n){
        if(n%2==0) return true;
        return false;
    }
    
    //  static boolean ODD(int n){
    //     if(n%2!=0) return true;
    //     return false;
    // }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n Value:");
        int n=sc.nextInt();
        // EVEN(n);
        //System.out.println(ODD(n));
        System.out.println(EVEN(n));
        //System.out.println(ODD(n));
    }
}