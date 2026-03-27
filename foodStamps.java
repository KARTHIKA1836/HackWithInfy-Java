import java.util.*;
public class FoodStamps {
    public static int taste(int n,int m,int[] v,int[] d){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int taste = v[i];
            while(taste > 0) {
                list.add(taste);
                taste -= d[i];
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        long answer = 0;
        for(int i = 0; i < Math.min(m, list.size()); i++) {
            answer += list.get(i);
        }
        return (int) answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] v = new int[N];
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            d[i] = sc.nextInt();
        }
        System.err.println(taste(N, M, v, d));
        sc.close();
    }

}

