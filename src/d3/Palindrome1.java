package d3;
import java.io.*;
import java.util.*;

public class Palindrome1 {
	private static char[][] arr = new char[8][8];
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc = 1; tc <=10; tc++) {
			int length = Integer.parseInt(br.readLine());
			
			for(int row =0; row < 8; row ++) {
				arr[row] = br.readLine().toCharArray();
			}
			System.out.println("#" + tc + " " +	palindrome(length, arr));
		}
	}
	
	private static int palindrome(int length, char[][] arr) {
		int cnt = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int  j= 0; j < 8-length+1; j++) {
				boolean check1 = true;
				boolean check2 = true;
				
				for(int k =0; i < length/2; k++) {
					if(arr[i][j+k] != arr[i][j+length-1-k]) {
						check1 = false;
					}
					if(arr[j+k][i] != arr[j+length-1-k][i]) {
						check2 = false;
					}
				}
				if(check1) cnt++;
				if(check2) cnt++;
			}
		}
		
		return cnt;
	}
}
