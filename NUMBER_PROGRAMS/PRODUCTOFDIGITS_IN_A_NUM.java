package NUMBER_PROGRAMS;

public class PRODUCTOFDIGITS_IN_A_NUM {
    static int product(int n){
        int prod=1;
        while(n!=0){
            int rem=n%10;
            prod*=rem;
            n/=10;
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println(product(12345));
    }
}
