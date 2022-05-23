package String;
import java.io.*;
import java.util.*;

public class Addnum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String a = br.readLine();
		int sum = 0;
		for(int i = 0; i < n; i ++) {
			sum += a.charAt(i)-'45';
		}
		
		System.out.println(sum);
		
	}
}
