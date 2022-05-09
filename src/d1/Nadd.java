package d1;

import java.util.*;
import java.io.*;

public class Nadd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum =0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i==n) {
				System.out.print(i + " = " + sum);
			}else {
				System.out.print(i + " + ");
			}
		}
	}
}
