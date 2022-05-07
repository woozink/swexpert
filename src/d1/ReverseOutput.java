package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
 
class ReverseOutput
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int N = Integer.parseInt(br.readLine());
         
        for(int i = N; i>=0; i--) {
            System.out.printf("%d ", i);
        }
     
    }
}
