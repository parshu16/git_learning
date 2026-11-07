package NUMBER_PROGRAMS;

public class CHECK_EVEN_OR_ODD_OF_FIRSTDIGIT_IN_NUM {
    static String evenorodd(int n){
        // int rev=0;int temp=n;
        // while(n!=0){
        //     int rem=n%10;
        //     rev=rev*10+rem;
        //     n/=10;
        // }
        //   if((temp%10)%2==0) return "even";
        //   return "odd";
        while(n>9){
            n/=10;
        }
        if(n%2==0) return "even";
        return "odd";
    }
    public static void main(String[] args) {
        System.out.println(evenorodd(9999987));
    }
}
