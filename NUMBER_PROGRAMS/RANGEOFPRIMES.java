package NUMBER_PROGRAMS;

class RANGEOFPRIMES {
    static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }if(count==2) return true;
        return false;
    }
    static void rangeofprimes(int start,int end){
       for(int i=start;i<=end;i++){
        if(prime(i)) System.out.println(i);
       }
        
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
        rangeofprimes(1, 20);
    }
}
