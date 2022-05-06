package d1;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class AveNum {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <10 ; j++ ) {
				int num = Integer.parseInt(st.nextToken());
				result += num;
			}
			double x = result/10.0;
			System.out.println("#"+ i + " "+ Math.round(x));
			result=0;
		}
		
	}

}
