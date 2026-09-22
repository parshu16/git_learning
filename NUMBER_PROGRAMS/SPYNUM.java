package NUMBER_PROGRAMS;

public class SPYNUM {
    static boolean spy(int n){
        int prod=1,sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;prod*=rem;
            n/=10;
        }
        if(sum==prod) return  true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(spy(124));
    }
}
