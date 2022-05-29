package ssafy;

import java.io.*;
import java.util.*;

public class Solution1 {

	public static void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N + 2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < N; i++) {
				if (arr[i] % 2 == 0 && arr[i + 2] % 2 == 0 || arr[i] % 2 == 1 && arr[i] % 2 == 1) {
					cnt = -1;
					break;
				}

				// 짝수일때
				if (arr[i] % 2 == 0) {
					if (arr[i + 1] % 2 == 1) {
						continue;
					} else {
						if (arr[i + 2] % 2 == 0) {
							break;
						} else {
							swap(arr[i + 1], arr[i + 2]);
							cnt++;
						}
					}
				}
				// 홀수 일때
				else {
					if (arr[i + 1] % 2 == 0) {
						continue;
					} else {
						if (arr[i + 2] % 2 == 1) {
							break;
						} else {
							swap(arr[i + 1], arr[i + 2]);
							cnt++;
						}
					}
				}
			}

			System.out.println("#" + tc + " " + cnt);

		}
	}

}
