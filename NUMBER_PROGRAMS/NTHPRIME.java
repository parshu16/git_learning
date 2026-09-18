package NUMBER_PROGRAMS;

import java.util.Scanner;

class NTHPRIME{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int count=0;int num=1;
    while(count<n){
        num++;
        boolean prime=true;
    for(int i=2;i<num;i++){
        if(num%i==0){
            prime=false;
            break;
        }
    }
    if(prime){
        count++;
    }
}
System.out.println(num);
    }
}