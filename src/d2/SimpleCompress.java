package d2;
import java.io.*;
import java.util.*;

public class SimpleCompress {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			sb = new StringBuilder();
			System.out.println("#" + " " + tc);
			int rows = Integer.parseInt(br.readLine());
		
			for(int i = 0; i < rows; i++) {
				String[] str = br.readLine().split(" ");
				String s= str[0];
				int r =Integer.parseInt(str[1]);
				for(int j =0; j < r; j++) {
					sb.append(s);
				}
			}
			char[] ca = sb.toString().toCharArray();
			for(int i =0; i < sb.length(); i++) {
				if(i % 10 == 9) {
					System.out.println(ca[i]);}
					else System.out.print(ca[i]);
				
			}
			System.out.println();
		
		}
	}
}
