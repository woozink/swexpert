package d2;

import java.util.*;
import java.io.*;

public class Flyingben2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			
			int t = Integer.parseInt(br.readLine());
			int [] count = new int[101];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score =0;
			
			for (int i = 0; i < 1000; i++) {
				score = Integer.parseInt(st.nextToken());
				count[score]++;
			}
			
			int maxCount = count[100];
			int maxIndex = 100;
			
			for(int i = 99; i > -1; i--) {
				if(maxCount < count[i] ){
					maxCount = count[i];
					maxIndex = i;
				}
		
			}
		
			System.out.printf("# %d   %\n" , t , maxIndex);
		}
	}
}
