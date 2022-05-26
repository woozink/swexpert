package d3;

import java.io.*;
import java.util.*;

public class Sum2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			
			int t = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			int result = 0;
			
			for(int i=0; i<100;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}	
			}
			
			result = calMax(arr);

			
			System.out.printf("# %d \n", tc , result);
		}
	}
	
	public static int calMax(int [][]input) {
		int[][] arr = input;
		int max =0;
		int[] diagnalSum = new int[2];
		
		for(int i = 0; i < 100; i ++) {
			int []sum = new int[2];
			
			for(int j = 0; j < 100; j++) {
				sum[0] += arr[i][j];
				sum[1] += arr[j][i];
			}
			if(max <= (int)Math.max(sum[0], sum[1])) {
				max = (int)Math.max(sum[0], sum[1]);
			}
			sum =new int[] {0,0};
			diagnalSum[0] += arr[i][i];
			diagnalSum[1] += arr[i][99-i];
		}		
		if(max <= (int)Math.max(diagnalSum[0], diagnalSum[1])) {
			max = (int)Math.max(diagnalSum[0], diagnalSum[1]);
		}
		
		return max;
	}
}
