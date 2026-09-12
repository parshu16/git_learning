package NUMBER_PROGRAMS;

class SUMOFPRIMESFROMSTARTTOEND {
    static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }if(count==2) return true;
        return false;
    }
    static void rangeofprimes(int start,int end){
        int sum=0;
       for(int i=start;i<=end;i++){
        if(prime(i)){ sum+=i;
            System.out.println(i);
       }
    }
       System.out.println(sum);
        
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
        rangeofprimes(1, 7);
    }
}
