import java.util.*;
public class MaxisumSubarrayTwoEle {
    static int maxSubArraySum(int[] a, int k){
        int maxsum=0;
        int sum=0;
        int j=0;
        int[] freq= new int[100001];
        int distinct=0;
        
        maxsum= Math.max(sum,maxsum);
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int sum=maxSubArraySum(arr,k);
        System.out.println(sum);
        s.close();
    }
}
