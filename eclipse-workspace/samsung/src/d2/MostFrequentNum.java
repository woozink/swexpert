package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MostFrequentNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

	
		for (int tc = 1; tc <= T; tc++) {
			int test = Integer.parseInt(br.readLine());
			int ans = 0;
			int max = 0;
			int[] scoreNum = new int[101];
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < 1000; i++) {
				int temp = Integer.parseInt(st.nextToken());
				scoreNum[temp] += 1;
				if(max < scoreNum[temp]) {
					max = scoreNum[temp];
					ans = temp;
				}else if(max == scoreNum[temp]) {
					ans = Math.max(ans, temp);
				}
			}
		}
		System.out.println("#" + test+ " " + ans);

	}

}
