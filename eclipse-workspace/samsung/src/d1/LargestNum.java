package d1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LargestNum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		
		int T = Integer.parseInt(br.readLine());
	
		for(int tc = 1; tc <= T; tc ++) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 10; i++) {
				int result = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			System.out.println("#" + "tc" + " " + max);

		}
		
	}

}
