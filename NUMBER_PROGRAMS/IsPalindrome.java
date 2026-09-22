package NUMBER_PROGRAMS;

public class IsPalindrome {
    static boolean isPalindrome(int n){
        int rev=0;int temp=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(temp==rev) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(99876));
    }
}
