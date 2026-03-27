import java.util.*;
public class TankCapacityInitial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int p=0;
        int mp=0;
        for(int i=0;i<n;i++){
            p+=arr[i];
            mp=Math.min(p,mp);
        }
        if(mp<-c){
            System.out.println(-1);
        }
        else{
            System.out.println(-mp);
        }

        s.close();
    }
}
