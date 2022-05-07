package d2;

import java.io.*;
import java.util.*;

public class Game369 {

	private static void checkNum(int number) {

		String str = Integer.toString(number);
		char[] c = str.toCharArray();
		boolean flag = true;

		for (char value : c) {
			int temp = value - '0';
			if (temp != 0 && temp % 3 == 0) {
				System.out.printf("-");
				flag = false;
			}
		}
		if (flag) {
			System.out.printf("%d ", number);
		} else {
			System.out.printf(" ");
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			checkNum(i);
		}
	}
}
