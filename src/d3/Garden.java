package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Garden {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
 
        StringBuilder sb = new StringBuilder();
        for(int t=1;t<=T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer tok = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(tok.nextToken());
            int D = Integer.parseInt(tok.nextToken());
 
            int count = 1;
            for(int i=D*2+1;i<N;i+=D*2+1) {
                count++;
            }
 
            sb.append(count).append("\n");
        }
 
        System.out.print(sb.toString());
    }
}
