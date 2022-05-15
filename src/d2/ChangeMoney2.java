package d2;

import java.util.*;
import java.io.*;

public class ChangeMoney2 {

	static int[] arr;
	static int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

	static void init() {
		arr = new int[8];
	}

	static void calcul(int N, int idx) {
		arr[idx] = N / money[idx];
		if (idx < 7) {
			calcul(N % money[idx], ++idx);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test = 1; test <= T; test++) {
			init();
			int N = Integer.parseInt(br.readLine());
			calcul(N, 0);

			System.out.println("#" + test);
			for (int cnt : arr) {
				System.out.print(cnt + " ");
			}
			System.out.println();
		}

	}
}
