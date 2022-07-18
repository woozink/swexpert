package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;


public class OddnumAdd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int result =0;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num %2 !=0) {
					result += num;
				}
			}
			System.out.println("#" + i +" " + result);
			result = 0;
		}
	}

}