package NUMBER_PROGRAMS;

class FIBONANCCI {
    static void fibo(int n){
         int a=0,b=1,c=1;
        while(a<=n){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        
        fibo(8);
    }
}
