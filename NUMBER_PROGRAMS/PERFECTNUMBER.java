package NUMBER_PROGRAMS;

class PERFECTNUMBER {
    static int perfectnum(int n){
        int sum=0;
        for(int i=1;i<=n*n;i++){
            if(n%i==0) sum+=i;
            if(n/i!=0) sum=n;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(perfectnum(6));
    }
}
