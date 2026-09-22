package NUMBER_PROGRAMS;

class OCUNTINDIVIDUALDIGITS {
    static int countofdigits(int n){
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countofdigits(571436));
    }
}
