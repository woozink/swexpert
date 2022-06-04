package d3;

import java.util.Arrays;
import java.util.Scanner;
 
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            String S = sc.next();
            char[] ch = S.toCharArray();
            int k = S.length();
            int win = 0;
            String result = null;
            for(int i = 0; i < k; i++) {
                if(ch[i] == 'o') {
                    win ++;
                }
            }
            if(win + (15-k) >= 8) {
                result = "YES";
            }else {
                result = "NO";
            }
            System.out.println("#"+tc+" "+result);
        }
    }
}