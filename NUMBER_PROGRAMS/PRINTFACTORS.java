package NUMBER_PROGRAMS;

class PRINTFACTORS {
    static void printfactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        printfactors(20);
    }
}
