import java.util.*;
public class EnemyGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        Queue<int[]> q = new LinkedList<>();
        int enemyCount = 0;

        // initialize
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'A') {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 'E') {
                    enemyCount++;
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int time = 0;

        while (!q.isEmpty() && enemyCount > 0) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < M) {

                        if (grid[nr][nc] == 'E') {
                            grid[nr][nc] = 'A';
                            enemyCount--;
                            q.offer(new int[]{nr, nc});
                        }
                    }
                }
            }

            time++;
        }

        if (enemyCount > 0) {
            System.out.println(-1);
        } else {
            System.out.println(time);
        }

        sc.close();
    }
}
    