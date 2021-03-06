package d2;
import java.io.*;
import java.util.*;

public class Pascal {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++ ) {
			int n = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();
		
			int[][] dp = new int[n+1][n+1];
			dp[0][0] =1;
			for(int i =1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
					sb.append(dp[i][j]+" ");
				}
				sb.append("\n");
			
			}
			System.out.println("#"+tc);
			System.out.println(sb);

		}
	}
}
