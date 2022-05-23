package String;
import java.io.*;
import java.util.*;

public class Ascii {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		int result = st.charAt(0);
		
		System.out.println(result);
		
	}
}
