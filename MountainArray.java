import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int changes=0;
        int mid=n/2;
        if(n%2!=0){
            if(arr[mid]!=arr[mid-1]){
                changes++;
            }
        }
        for(int i=mid;i>0;i--){
            if(mid-(mid-i)!=i){
                changes++;
            }
        }
        for(int i=mid;i<n-1;i++){
            if(mid-i-1!=mid+i){
                changes++;
            }
        }
        System.out.println(changes);
        s.close();
    }
}
