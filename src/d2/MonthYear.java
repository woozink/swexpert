package d2;

import java.util.*;
import java.io.*;

public class MonthYear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int endDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		for (int tc = 1; tc <= T; tc++) {
			st =new StringTokenizer(br.readLine());
			
			int m1 = Integer.parseInt(st.nextToken());
			int d1 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int d2 = Integer.parseInt(st.nextToken());
			
			int day1 = 0;
			int day2 = 0;
			
			for(int i=1; i <m1; ++i) {
				day1 += endDay[i-1];
			}
			day1 += d1;
			
			for(int i = 1; i <m2; ++i) {
				day2 += endDay[i-1];
			}
			day2 += d2;
			
			System.out.println("#" + tc + " "+ (day2 -day1+1));
		}
	}
}
