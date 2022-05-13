package d2;

import java.util.*;
import java.io.*;

public class NumArrRotation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc =1; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			
			int[][] valArr = new int[N][N];
			int[][] turn90Arr = new int[N][N];
			int[][] turn180Arr = new int[N][N];
			int[][] turn270Arr = new int[N][N];

			
			for(int i =0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j <N; j ++) {
					valArr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j =0; j < N; j++) {
					turn90Arr[i][j] = valArr[N-j-1][i];
					turn180Arr[i][j] = valArr[N-i-1][N-j-1];
					turn270Arr[i][j] = valArr[j][N-i-1];

				}
			}
			System.out.println("#" + tc);
			
			for(int i =0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.println("" + turn90Arr[i][j]);
				}
				System.out.println(" ");
				for(int j = 0; j < N; j++) {
					System.out.println("" + turn180Arr[i][j]);
				}
				System.out.println(" ");
				for(int j = 0; j < N; j++) {
					System.out.println("" + turn270Arr[i][j]);
				}
				System.out.println("\n");
			}
			
		}
		
	}
}
