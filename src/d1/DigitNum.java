package d1;

import java.io.*;
import java.util.*;

public class DigitNum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		num = Integer.parseInt(br.readLine());
		
		while(num != 0) {
			sum += num %10;
			num /=10;
		}
		System.out.println(sum);
	}
}
