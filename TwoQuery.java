import java.util.Scanner;
public class TwoQuery {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int q=s.nextInt();

        for(int i=0;i<q;i++){
            int k=s.nextInt();
            int l=s.nextInt();
            int r=s.nextInt();
            
            if(k==2){
                int sum=0;
                int total=0;
                for(int j=l-1;j<r;j++){
                    sum+=arr[j];
                }
                total=total+sum;
                System.out.println(sum);
            }else if(k==1){
                arr[i]=(i-l+1)*a[l];
            }
            System.out.println();
        }
    }
