package d2;

import java.util.*;
import java.io.*;

public class WhereWeGo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int tc = 1; tc <= T; tc ++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int [][] arr = new int[n][n];	
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j =0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int a = 0;
			int b = 0;
			int cnt = 0;
			int result = 0;
			
			
			for(int i = 0; i < n; i++) {
				for(int j =0; j < n; j++) {
					if(j != n-1) {
						if(arr[i][j] ==1) {
							a++;
						}else {
							if(a == k) {
								cnt++;
							}
							a=0;
						}
					}if(j == n-1){
						if(arr[i][j] == 1) {
							a++;
							if(a == k) {
								cnt++;
							}
							a=0;
						}else {
							if(a== k) {
								cnt++;
							}
							a=0;
						}
					
					}
				}
				result += cnt;
				cnt = 0;
			}
			
			
			// 수
			for(int i = 0; i < n; i++) {
				for(int j =0; j < n; j++) {
					if(j != n-1) {
						if(arr[j][i] ==1) {
							b++;
						}else {
							if(b == k) {
								cnt++;
							}
							b=0;
						}
					}if(j == n-1) {
						if(arr[j][i] == 1) {
							b++;
							if(b == k) {
								cnt++;
							}
							b=0;
						}else {
							if(b== k) {
								cnt++;
							}b=0;
						}
					}
				}
				result += cnt;
				cnt = 0;
			}
			System.out.println("#" + tc + " " + result);		
		}
	}
}
