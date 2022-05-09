package d1;

import java.io.*;
import java.util.*;

public class Diagonal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == i) {
					System.out.print("#");
				} else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}
