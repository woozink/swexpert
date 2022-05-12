package d2;

import java.util.*;
import java.io.*;

public class Flyingben {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 1; i <= t; i++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);

			int[][] nArray = new int[N][N];
			int[] max = new int[(N - M + 1) * (N - M + 1)];
			int count = 0;

			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					nArray[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0; j <= (N - M); j++) {
				for (int k = 0; k <= (N - M); k++) {
					for (int l = 0; l < M; l++) {
						for (int m = 0; m < M; m++) {
							max[count] = max[count] + nArray[j + l][k + m];
						}
					}
					count ++;
				}
			}
			Arrays.sort(max);
			System.out.println("#" + i +" "+ max[(N-M+1)*(N-M+1)-1]);
		}

	}
}
