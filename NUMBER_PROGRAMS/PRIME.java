package NUMBER_PROGRAMS;

class PRIME {
    static String isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2) return "it is a Prime nbr";
        return "Not a Prime nbr";
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
