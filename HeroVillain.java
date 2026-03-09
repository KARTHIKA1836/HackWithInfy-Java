import java.util.*;

public class HeroVillain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        int M = sc.nextInt(); 
        int H = sc.nextInt();  

        int[] v = new int[N];

        for(int i=0;i<N;i++)
            v[i] = sc.nextInt();

        for(int remove=0; remove<=N; remove++){

            int heroes = M;
            int health = H;
            boolean win = true;

            for(int i=remove;i<N;i++){

                if(heroes == 0){
                    win = false;
                    break;
                }

                if(health > v[i]){
                    health -= v[i];
                }
                else if(health < v[i]){
                    heroes--;
                    health = H;
                    i--;
                }
                else{
                    heroes--;
                    health = H;
                }
            }

            if(win){
                System.out.println(remove);
                return;
            }
        }
        sc.close();
    }
}