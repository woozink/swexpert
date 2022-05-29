package ssafy;
import java.io.*;
import java.util.*;

public class Solution2 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int sum =0;
			int N = Integer.parseInt(br.readLine());
			int [] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i <N; i++) {
				for(int j =0; j < N; j++) {
					int x = arr[i] % arr[j];
					sum += x;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
