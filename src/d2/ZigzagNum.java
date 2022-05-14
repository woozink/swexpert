package d2;
import java.io.*;
import java.util.*;


public class ZigzagNum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int N = Integer.parseInt(br.readLine());
			
			for(int i =1; i <= N; i ++) {
				if( i %2 != 0 ) {
					sum += i;
				}
				else {
					sum -= i;
				}
			}
			System.out.println(sum);
		}
	}
}
