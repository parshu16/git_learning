package NUMBER_PROGRAMS;
public class Array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int n=arr.length;int sum=0,sum1=0;
        int mid=n/2;
        for(int i=0;i<mid;i++){
            sum+=arr[i];
        }
        for(int i=mid;i<n;i++){
            sum1+=arr[i];
        }
        System.out.println(sum*sum1);
    }
}
