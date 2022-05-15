package d2;
import java.io.*;
import java.util.*;

public class SudoCharge {
	static int result = 0;
	
	public static int Select(int P,int Q, int R, int S, int W) {
		int A = 0; 
		int B =0;
		
		A = W*P;
		
		if(W <= R) {
			B= Q; 
		}else {
			int x = (W-R) *S;
			B= x +Q;
		}
		if(A > B) result = B;
		else {
			result = A;
		}
		
		
		return result;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			Select(P,Q,R,S,W);
			
			System.out.print("#" + tc + " " + result);
		}
		
		
	}
}
