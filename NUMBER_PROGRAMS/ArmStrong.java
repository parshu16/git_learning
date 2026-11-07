class ArmStrong{
    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Method to calculate power
    static int power(int base, int exponent) {
        int pow = 1;

        for (int i = 1; i <= exponent; i++) {
            pow = pow * base;
        }

        return pow;
    }

    // Method to check Armstrong number
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        int count = countDigits(n);

        while (temp > 0) {
            int rem = temp % 10;

            sum = sum + power(rem, count);

            temp /= 10;
        }

        return sum == n;
    }
    public static void main(String[] args) {
          int n = 153;

        System.out.println(
            isArmstrong(n)
            ? "Armstrong Number"
            : "Not an Armstrong Number"
        );
        //System.out.println(Armstrong(153));
        // int n=153;int temp=n,temp1=n;int count=0;int sum=0;
        // while(n>0){
        //     count++;n/=10;
        // }
        // while(temp1>0){
        //     int rem=temp1%10;
        //     int pow=1;
        //     for(int i=1;i<=count;i++){
        //         pow=pow*rem;
        //     }
        //     sum+=pow;
        //     temp1/=10;
        // }
        // System.out.println((sum==temp)?"ArmStrong-Number":"Not-a-ArmStrong-Number");
    }
}