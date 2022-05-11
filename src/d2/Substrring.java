package d2;

import java.io.*;

public class Substrring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test = 1; test <= T; test++) {
			String input = br.readLine();

			for (int i = 1; i < input.length(); i++) {
				String a = input.substring(0, i);
				String b = input.substring(i, i + i);

				if (a.equals(b)) {
					System.out.println("#" + test + " " + a.length());
					break;
				}
			}
		}

	}
}
