package d3;

import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            char[][] arr = new char[N][N];
            int si = N-1, ei= 0, sj= N-1, ej = 0;
            //String st = sc.next().replaceAll("#", "1").replaceAll("[.]", "0");
            for(int i = 0; i < N; i++) {
                String st = sc.next();
                for(int j = 0; j < N; j++) {
                    arr[i][j] = st.charAt(j);
                }
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(arr[i][j] == '#') {
                        if(si > i) {
                            si = i;
                        }
                        if(ei < i) {
                            ei = i;
                        }
                        if(sj > j) {
                            sj = j;
                        }
                        if(ej < j) {
                            ej = j;
                        }
                    }
                }
            }
            int check = 0;
            for(int i = si; i <= ei; i++) {
                for(int j = sj; j <= ej; j++) {
                    if(arr[i][j] != '#') {
                        check ++;
                    }
                }
            }
            String result = null;
            if(check == 0 && ei - si == ej - sj) {
                result = "yes";
            }else {
                result = "no";
            }   
            System.out.println("#"+tc+" "+result);
        }
    }
}
