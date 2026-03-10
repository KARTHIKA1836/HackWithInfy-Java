// import java.util.Scanner;
// public class FoodieFriend {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int[] v = new int[N];
//         for(int i=0;i<N;i++)
//             v[i] = sc.nextInt();
//        int freq[] = new int[26];
//         for(int c : v){
//             freq[c-1]++;
//         }
//         int max = 0;
//         for(int start : freq){
//             int need = start;
//             int total = 0;
//             for(int f : freq){
//                 if(f >= need){
//                     total += need;
//                     need *= 2;
//                 }
//             }
//             max = Math.max(max,total);
//         }
//         System.out.println(max);
//         sc.close();
//     }
// }


  import java.util.*;

public class FoodieFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] v = new int[N];

        for(int i=0;i<N;i++){
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        ArrayList<Integer> freq = new ArrayList<>();

        int count = 1;

        for(int i=1;i<N;i++){
            if(v[i] == v[i-1]){
                count++;
            }else{
                freq.add(count);
                count = 1;
            }
        }

        freq.add(count); // last frequency

        Collections.sort(freq);

        int max = 0;

        for(int start : freq){

            int need = start;
            int total = 0;

            for(int f : freq){
                if(f >= need){
                    total += need;
                    need *= 2;
                }
            }

            max = Math.max(max,total);
        }

        System.out.println(max);
        sc.close();
    }
}