import java.util.Scanner;

public class TerrainSlope {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i] = s.nextInt();
        }
        int dig=0;
        int totalDig=0;
        for(int i=1;i<N;i++){
            if(a[i]>=a[i-1]){
                dig=a[i]-(a[i-1]-1);
                totalDig=Math.max(totalDig,dig);
                a[i]=a[i-1]-1;
            }
        }
        int days=(int)Math.ceil(Math.sqrt(totalDig));
        System.out.println(days);
        s.close();

    }
}
