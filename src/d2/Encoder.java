package d2;
import java.util.*;
import java.io.*;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Encoder {
	public static void main(String[] args)throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		for(int n =0; n < x; n++) {
			String s = br.readLine();
			Decoder d = Base64.getDecoder();
			byte[]b = d.decode(s);
			System.out.println("#" + (n+1)+ " " + new String(b));
		}
	}
}
