package d2;

import java.io.*;
import java.util.*;

public class Snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			
			int count =1;
			int x = 0;
			int y = 0;
			int dir = 0;
			
			
			while(count <= n *n) {
				arr[x][y] = count ++;
				x += dx[dir];
				y += dy[dir];
				
				if(x < 0 || x>= n || y< 0 || y>=n || arr[x][y] != 0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					
					x += dx[dir];
					y += dy[dir];
				}
			}
			
			System.out.printf("# %d\n",t);
			for(int i = 0; i <n; i++) {
				for(int j = 0; j <n; j ++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
		}
	}
}
