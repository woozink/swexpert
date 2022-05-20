package d2;
import java.io.*;
import java.util.*;

public class Soinsu {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer str = new StringTokenizer(br.readLine());
	        StringBuilder sb = new StringBuilder();
	        int T = Integer.parseInt(str.nextToken());
	 
	        for (int tc = 1; tc <= T; tc++) {
	            str = new StringTokenizer(br.readLine());
	            int N = Integer.parseInt(str.nextToken());
	            int cnt=0;
	            sb.append("#"+tc+" ");
	 
	            while(true){
	                if(N%2==0) {
	                    cnt++;
	                    N = N/2;
	                }else{
	                    sb.append(cnt+" ");
	                    cnt=0;
	                    break;
	                }
	            }
	            while(true){
	                if(N%3==0) {
	                    cnt++;
	                    N = N/3;
	                }else{
	                    sb.append(cnt+" ");
	                    cnt=0;
	                    break;
	                }
	            }
	            while(true){
	                if(N%5==0) {
	                    cnt++;
	                    N = N/5;
	                }else{
	                    sb.append(cnt+" ");
	                    cnt=0;
	                    break;
	                }
	            }
	            while(true){
	                if(N%7==0) {
	                    cnt++;
	                    N = N/7;
	                }else{
	                    sb.append(cnt+" ");
	                    cnt=0;
	                    break;
	                }
	            }
	            while(true){
	                if(N%11==0) {
	                    cnt++;
	                    N = N/11;
	                }else{
	                    sb.append(cnt+" ");
	                    cnt=0;
	                    break;
	                }
	            }
	            System.out.println(sb);
	            sb.delete(0,sb.length());
	 
	        }
	    }
}
