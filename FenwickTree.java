import java.util.Scanner;

public class FenwickTree {
    public static void update(int[] ft,int index, int value){
        while(index<ft.length){
            ft[index]=ft[index]+value;
            index+=index&-index;
        }
    }
    public static int querySum(int[] ft, int index){
        int sum = 0;
        while(index>0){
            sum+=ft[index];
            index-=index&-index;
        }
        return sum;
    }
    public static void main(String[] args) {
     int[] ft = new int[100000];
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int q = s.nextInt();
        int[][] query = new int[q][3];
        int total=0;
        for(int i = 0; i < q; i++){
            query[i][0] = s.nextInt(); 
            query[i][1] = s.nextInt(); 
            query[i][2] = s.nextInt(); 
        }
        for(int i=1;i<=n;i++){
            update(ft,i,arr[i-1]);
        }
        for(int i=0;i<q;i++){
            int type=query[i][0];
            int l=query[i][1];
            int r=query[i][2];
            if(type==1){
    int base = arr[l];

    for(int j = l; j <= r; j++){
        int newVal = (j - l + 1) * base;

        int diff = newVal - arr[j];
        arr[j] = newVal;

        update(ft, j + 1, diff); // update Fenwick
    }
}
    else if(type == 2){
        int sum = querySum(ft, r + 1) - querySum(ft, l);
       total+=sum;
    }
        }
        System.out.println(total);
        s.close();
    }
}
