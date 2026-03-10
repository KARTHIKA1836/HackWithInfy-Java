import java.util.Scanner;

public class KthSwap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        int[] v = new int[N];
        for(int i=0;i<N;i++)
            v[i] = sc.nextInt();
         int K = sc.nextInt();  
            int temp = v[K];
            v[K] = v[0];
            v[0] = temp;
          for(int i=0;i<N;i++){
           System.out.println(v[i]+" ");
        }
        
        sc.close();
    }
}
