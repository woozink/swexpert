package String;

import java.io.*;
import java.util.*;

public class AgainstStr {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {

			String[] str = br.readLine().split(" "); // 공백 분리
			int R = Integer.parseInt(str[0]); // String -> int
			String S = str[1];

			for (int i = 0; i < S.length(); i++) {
				for (int j = 0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();

		}
	}
}


