import java.util.*;

public class Main {

    public static int minTimeToInvade(char[][] grid, int N, int M) {

        Queue<int[]> q = new LinkedList<>();
        int enemyCount = 0;

        // Step 1: initialize queue and count enemies
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (grid[i][j] == 'A') {
                    q.offer(new int[]{i, j});
                }
                else if (grid[i][j] == 'E') {
                    enemyCount++;
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int time = 0;

        // Step 2: BFS
        while (!q.isEmpty() && enemyCount > 0) {

            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    // boundary check
                    if (nr >= 0 && nr < N && nc >= 0 && nc < M) {

                        if (grid[nr][nc] == 'E') {
                            grid[nr][nc] = 'A';
                            enemyCount--;
                            q.offer(new int[]{nr, nc});
                        }
                    }
                }
            }

            time++; // one level completed
        }

        if (enemyCount > 0) return -1;
        return time;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        int result = minTimeToInvade(grid, N, M);
        System.out.println(result);

        sc.close();
    }
}