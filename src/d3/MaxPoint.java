package d3;

import java.io.*;
import java.util.*;

public class MaxPoint {
	static int[] arr, maxArr;
	static int n, swapCount, maxCount;
	static int prevCnt = -1;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			n = str.length();
			swapCount = Integer.parseInt(st.nextToken());

			arr = new int[n + 1];
			maxArr = new int[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i + 1] = str.charAt(i) - 48;
			}

			maxCount = Integer.MIN_VALUE;
			answer = Integer.MIN_VALUE;

			// 가장 큰 수를 찾아서 맨 앞으로 보낸다. swap
			// 여러 개 있으면 다 해본다.
			// 이미 맨 앞에 있으면 나머지 수로 반복.
			dfs(1, 0);

			if (swapCount > maxCount) {
				check();
			}

			bw.write("#" + t + " " + answer);
			bw.newLine();
		}

		br.close();
		bw.close();
	}

	private static void check() {
		int remainCnt = swapCount - maxCount;

		for (int i = 1; i <= n - 1; i++) {
			// 중복되는 숫자가 있는 경우
			if (maxArr[i] == maxArr[i + 1]) {
				answer = getNum(maxArr);
				return;
			}
		}

		// 중복되는 숫자가 없는 경우
		// 남은 카운트 수에 따라 마지막 인덱스 스왑
		if (remainCnt % 2 == 0) {
			answer = getNum(maxArr);
			return;
		} else {
			swap(maxArr, n - 1, n);
			answer = getNum(maxArr);
			return;
		}
	}

	private static void dfs(int left, int cnt) throws IOException {
		maxCount = Math.max(maxCount, cnt);

		// 교환 횟수 끝나면
		if (cnt == swapCount) {
			int num = getNum(arr);
			answer = Math.max(answer, num);
			return;
		}

		if (cnt == maxCount) {
			maxArr = arr.clone();
		}

		int max = 0;
		for (int i = left; i <= n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = left; i <= n; i++) {
			if (i != left && max == arr[i]) {
				swap(arr, left, i);
				dfs(left + 1, cnt + 1);
				swap(arr, i, left);
			}

			if (i == left && max == arr[i]) {
				dfs(left + 1, cnt);
			}
		}
	}

	private static int getNum(int[] arr) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num += arr[i];
			if (i != n)
				num *= 10;
		}
		return num;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}