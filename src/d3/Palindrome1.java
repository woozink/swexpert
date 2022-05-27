package d3;
import java.io.*;
import java.util.*;

public class Palindrome1 {
	private static int ROW_SIZE = 8;
	private static int COL_SIZE = 8;
	private static char[][] arr = new char[ROW_SIZE][COL_SIZE];
	
	
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
		
		for(int i = 0; i < ROW_SIZE; i++) {
			for(int  j= 0; j < COL_SIZE-length+1; j++) {
				boolean check1 = true;
				boolean check2 = true;
				
				String rowString = "";
				String colString = "";
				if(isPalindrome(rowString)) {
					cnt++;
				}
				if(isPalindrome(colString)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	private static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
