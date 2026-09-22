package NUMBER_PROGRAMS;

public class SMALLESTDIGIT_IN_A_NUM {
    static int smallest(int n){
        int min=n;
        while(n>0){
            int rem=n%10;
            if(rem<min) min=rem;
            n/=10;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(smallest(54132));
    }
}
