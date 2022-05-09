package d1;
import java.io.*;

public class Double {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		for(int i =1; i <= n; i++) {
			sum *= 2;
			if(i ==1) {
				System.out.print(i+" "+ i*2 +" ");
			}else {
				System.out.print(sum + " ");
			}
		}
	}
}
