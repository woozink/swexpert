package d2;

import java.io.*;
import java.util.*;

public class ChangeMoney {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[8];
		
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			while (true) {
				if (N == 0) {
					break;
				} else {
					if (N >= 50000) {
						N -= 50000;
						arr[0]++;
						continue;
					} else if (N >= 10000 && N < 50000) {
						arr[1]++;
						N -= 10000;
						continue;
					} else if (N >= 5000 && N < 10000) {
						arr[2]++;
						N -= 5000;
						continue;
					} else if (N >= 1000 && N < 5000) {
						arr[3]++;
						N -= 1000;
						continue;
					} else if (N >= 500 && N < 1000) {
						arr[4]++;
						N -= 500;
						continue;
					} else if (N >= 100 && N < 500) {
						arr[5]++;
						N -= 100;
						continue;
					} else if (N >= 50 && N < 100) {
						arr[6]++;
						N -= 50;
						continue;
					} else if (N >= 10 && N < 50) {
						arr[7]++;
						N -= 10;
						continue;
					}
				}
			}
			System.out.println("#"+ tc);
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		}
	}
}
