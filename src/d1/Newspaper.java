package d1;
import java.io.*;

class Newspaper {
	public static void main(String[] args) throws Exception{
		
		new Newspaper().run();
	}
	
	public void run() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toUpperCase();
		System.out.println(input);
	}
	
}
