package NUMBER_PROGRAMS;

public class SUMOFDIGITS_IN_A_NUM {
    static int sum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
