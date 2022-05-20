package d3;
import java.util.*;
import java.io.*;

public class View {
	 
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
 
    static int T;
 
 
    public static void main(String args[]) throws Exception {
 
        for (int i = 1; i <= 10; ++i) {
 
            int N = Integer.parseInt(br.readLine()), ans = 0;
 
            int[] apt = new int[N];
 
            st = new StringTokenizer(br.readLine());
 
            for (int j = 0; j < N; ++j)
                apt[j] = Integer.parseInt(st.nextToken());
 
            for (int j = 2; j < N - 2; ++j) {
                int tmp = 0;
                // 왼쪽 오른쪽 한칸 떨어짐
                if (apt[j - 1] < apt[j] && apt[j + 1] < apt[j]) {
                    tmp = Math.min(apt[j] - apt[j - 1], apt[j] - apt[j + 1]);
 
                    // 왼쪽 오른쪽 두칸 떨어짐
                    if (apt[j - 2] < apt[j] && apt[j + 2] < apt[j]) {
                        tmp = Math.min(tmp, Math.min(apt[j] - apt[j - 2], apt[j] - apt[j + 2]));
                        ans += tmp;
                    }
                }
            }
            bw.write("#" + i + " " + ans + "\n");
        }
        bw.flush();
    }
}