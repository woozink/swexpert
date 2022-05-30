package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Flatten {
	static int dump;
	static int map[];
	static int top[];
	static int max;
	static int min;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = 10;
		StringTokenizer st;
		for (int t = 1; t <= testcase; t++) {
			dump = Integer.parseInt(bf.readLine());
			map = new int[100];
			top = new int[101];
			max = -1;
			min = 1000;
			st = new StringTokenizer(bf.readLine());
			for (int i = 0; i < 100; i++) {
				map[i] = Integer.parseInt(st.nextToken());
				if (max < map[i])
					max = map[i];
				if (min > map[i])
					min = map[i];
				top[map[i]] += 1;
			}

			int cnt = 0;
			int ans = 0;
			while (cnt <= dump) {
				cnt++;
				if (max == min) {
					ans = 0;
					break;
				}
				if (max - min == 1) {
					ans = 1;
					break;
				}
				ans = max - min;

				top[max] -= 1;
				top[min] -= 1;
				top[(max - 1)] += 1;
				top[(min + 1)] += 1;

				if (top[max] <= 0) {
					int c = max;
					while (true) { // MAX
						c--;
						if (top[c] != 0) {
							max = c;
							break;
						}
					}
				}

				if (top[min] <= 0) {
					int c = min;
					while (true) { // Min
						c++;
						if (top[c] != 0) {
							min = c;
							break;
						}
					}
				}

			}
			System.out.println("#" + t + " " + ans);

		}
		bf.close();
	}
}
