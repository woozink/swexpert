package d3;

import java.io.*;
public class Section {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws IOException{
		int T = Integer.parseInt(bf.readLine());
		for(int t=1;t<=T;t++) {
			int answer = 0, N = Integer.parseInt(bf.readLine());
			int [][]field = new int[N][N];
			for(int i =0;i<N;i++) {
				String tmp = bf.readLine();
				for(int j =0;j<N;j++)field[i][j] = tmp.charAt(j)-48;
			}
			for(int i =0;i<N;i++)
				for(int j=Math.abs(N/2-i);j<=2*(N/2)-Math.abs(N/2-i);j++)
					answer+=field[i][j];
			sb.append("#").append(t).append(" ").append(answer).append("\n");
		}
		System.out.println(sb);
	System.out
	}
}
