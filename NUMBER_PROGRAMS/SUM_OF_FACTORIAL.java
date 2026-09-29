package NUMBER_PROGRAMS;

public class SUM_OF_FACTORIAL {
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static int sum(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res+=fact(rem);
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sum(145));
    }
}
