package NUMBER_PROGRAMS;

public class BIGGESTDIGIT_IN_A_NUM {
    static int biggest(int n){
        int max=Integer.MIN_VALUE;
        while(n>0){
            int rem=n%10;
            if(rem>max) max=rem;
            n/=10;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(biggest(8765987));
    }
}
