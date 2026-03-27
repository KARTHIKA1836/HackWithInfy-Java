import java.util.*;

public class Invasion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[n][m];

        Queue<int[]> q = new LinkedList<>();
        int enemyCount = 0;

        // input + initialize queue + count enemies
        for(int i = 0; i < n; i++){
            String row = sc.nextLine();
            for(int j = 0; j < m; j++){
                grid[i][j] = row.charAt(j);

                if(grid[i][j] == 'A'){
                    q.offer(new int[]{i, j});
                }
                else if(grid[i][j] == 'E'){
                    enemyCount++;
                }
            }
        }

        // directions: up, down, left, right
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        int time = 0;

        // BFS
        while(!q.isEmpty() && enemyCount > 0){

            int size = q.size();

            for(int i = 0; i < size; i++){

                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] d : dir){

                    int nr = r + d[0];
                    int nc = c + d[1];

                    // check boundaries
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m){

                        if(grid[nr][nc] == 'E'){
                            grid[nr][nc] = 'A'; // convert
                            enemyCount--;       // reduce enemy count
                            q.offer(new int[]{nr, nc});
                        }
                    }
                }
            }

            time++; // one level = one second
        }

        // final answer
        if(enemyCount > 0){
            System.out.println(-1);
        } else {
            System.out.println(time);
        }

        sc.close();
    }
}