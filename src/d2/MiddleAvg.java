package d2;
import java.io.*;
import java.util.*;

public class MiddleAvg {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int []arr = new int[10];
		for(int tc =0; tc <T; tc++) {
			int sum = 0;
			int result = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			for(int i = 1; i < 9; i++) {
				sum += arr[i];
			}
			result = sum / 8;
			
			System.out.println(Math.round(result*10)/10);
		}
		
	}
}
