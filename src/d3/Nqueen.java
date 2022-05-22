package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nqueen {
	public static int[] row;
	public static int TC, a, b, lineCounter, count;

	public static boolean place(int r, int c) {
		for (int prev = 0; prev < c; prev++) {
			if (row[prev] == r || Math.abs(row[prev] - r) == Math.abs(prev - c))
				return false;

		}
		return true;
	}

	public static void backtrack(int N, int c) {
		if (c == N) {
			count++;
		}
		for (int r = 0; r < N; r++) {
			if (place(r, c)) {
				row[c] = r;
				backtrack(N, c + 1);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int z = 1; z <= T; z++) {
			int N = Integer.parseInt(br.readLine());
			row = new int[N];
			count = 0;
			backtrack(N, 0);
			System.out.println("#" + z + " " + count);

		}

	}

}