import java.util.*;
public class MaxisumSubarrayTwoEle {
    static int maxSubArraySum(int[] a, int k){
        int maxsum=0;
        int sum=0;
        int j=0;
        int[] freq= new int[100001];
        int distinct=0;
        for(int i=0;i<a.length;i++){
            if(freq[a[i]]==0){
                distinct++;
            }
            freq[a[i]]++;
            sum+=a[i];
            while(distinct>k){
                freq[a[j]]--;
                sum-=a[j];
                if(freq[a[j]]==0){
                    distinct--;
                }
                j++;
            }
            maxsum= Math.max(sum,maxsum);
        }
        
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
