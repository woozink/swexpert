package d2;
import java.util.*;
import java.io.*;

public class MiddleAvg2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int i = 0; i < 10; i ++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(arr);
			double sum = 0;
			
			for(int i = 1; i < 9; i++) {
				sum += arr.get(i);
			}
			
			System.out.println("#" + tc + " " + Math.round(sum/8));
		}
	}
}
