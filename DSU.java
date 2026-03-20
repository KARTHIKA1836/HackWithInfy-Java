import java.util.*;
public class DSU {
    static int[] parent;
    static int[] size;
    static int[] consecutive;
    static int find(int x) {
        if(parent[x] == x)
            return x;
        return parent[x] = find(parent[x]); 
    }

    static void union(int a, int b) {

        int pa = find(a);
        int pb = find(b);

        if(pa == pb) return;
        if(size[pa] < size[pb]) {
            int temp = pa;
            pa = pb;
            pb = temp;
        }

        parent[pb] = pa;

        size[pa] += size[pb];
        consecutive[pa] += consecutive[pb];
        if(Math.abs(a - b) == 1) {
            consecutive[pa]++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        parent = new int[n + 1];
        size = new int[n + 1];
        consecutive = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
            consecutive[i] = 0;
        }

        int ans = 0;

        for(int i = 0; i < q; i++) {

            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(type == 1) {
                union(x, y);
            }
            else {

                int root = find(x);

                int beauty = size[root] - consecutive[root];

                ans += beauty;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
