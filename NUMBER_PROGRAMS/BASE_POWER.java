package NUMBER_PROGRAMS;

class BASE_POWER {
    static int basepower(int base,int power){
        int res=1;
        for(int i=1;i<=power;i++){
           res*=base;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(basepower(2, 5));
    }
}
