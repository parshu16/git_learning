package NUMBER_PROGRAMS;
class FIBO_OF_NTH {
    static void fibonacci(int n){
        int a=0,b=1,c=1;
        while (a<=n) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            
        }
    }
    public static void main(String[] args) {
        fibonacci(250 );
    }
}
