package NUMBER_PROGRAMS;

import java.util.ArrayList;

public class GFG {
    public String longest(String[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(String s:arr){
            int len=s.length();
            ans.add(len);
        }
        int num=ans.size();
        int max=ans.get(0);
        for(int i=0;i<num;i++){
            if(ans.get(i)>max){
                max=ans.get(i);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[]arr={"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(arr));
    }
}
