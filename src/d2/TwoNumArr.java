package d2;

import java.util.*;
import java.io.*;

public class TwoNumArr {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int max = 0;

			int[] arr1 = new int[N];
			int[] arr2 = new int[M];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				arr2[i] = Integer.parseInt(st.nextToken());
			}

			if (N <= M) {
				max = calcul(arr1, arr2);
			} else {
				max = calcul(arr2, arr1);
			}

			System.out.println("#" + tc + " " + max);
		}
	}

	public static int calcul(int[] a, int[] b) {
		int sum = 0;
		int max = 0;

		for (int i = 0; i < b.length - a.length + 1; i++) {
			for (int j = 0; j < a.length; j++) {
				sum += a[j] * b[i+j];
			}
			if(max < sum) {
				max = sum;
			}
			sum =0;
		}
		return max;
	}
}
