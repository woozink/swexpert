package d3;

import java.io.*;
import java.util.*;

public class Sum {
	static int arr[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[100][100];
			int horizonSum = 0;
			int verticalSum = 0;
			int hMax = 0;
			int vMax = 0;
			int max = 0;
			for(int i=0; i<100;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					horizonSum += arr[i][j];
					verticalSum += arr[j][i];
				}
				if(horizonSum >= max) {
					hMax = horizonSum;
				}
				
				if(verticalSum >= max) {
					vMax = verticalSum;
				}			
			}
			max = Math.max(hMax, vMax);
			
			System.out.println(Math.max(max, diagCal(arr)));
		}
	}
	
	public static int diagCal(int [][]arr) {
		int diagSum1 =0;
		int diagSum2 = 0;
		int max1 = 0;
		int max2 = 0;
		for(int i = 0; i < 100; i ++) {
			for(int j = 0; j < 100; j++) {
				diagSum1 += arr[i][i];
				diagSum2 += arr[i][100-i];
			}
			if(max1 <= diagSum1) {
				max1 = diagSum1;
			}
			if(max2 <= diagSum2) {
				max2 = diagSum2;
			}
		}
		return Math.max(max1, max2);
		
	}
}
