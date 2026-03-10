import java.util.Scanner;

public class TwoQuery {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int q = s.nextInt();
        int[][] query = new int[q][3];

        for(int i = 0; i < q; i++){
            query[i][0] = s.nextInt(); 
            query[i][1] = s.nextInt(); 
            query[i][2] = s.nextInt(); 
        }

        long total = 0;
        for(int i = 0; i < q; i++){
            int k = query[i][0];
            int l = query[i][1];
            int r = query[i][2];
            if(k == 1){
                int base = arr[l];
                for(int j = l; j <= r; j++){
                    arr[j] = (j - l + 1) * base;
                }
            }
            else if(k == 2){
                int sum = 0;

                for(int j = l; j <= r; j++){
                    sum += arr[j];
                }

                total += sum;
            }
        }

        System.out.println(total);

        s.close();
    }
}