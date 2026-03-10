import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int gcd=0;
        for(int f:freq){
            if(f>0){
                if(gcd==0){
                    gcd=f;
                }
                else{
                    gcd=findGCD(f, gcd);
                }
            }
        }
        System.out.println(gcd);
        sc.close();
    }
    static int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a% b);
    }
}





       

    