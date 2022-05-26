package String;
import java.io.*;

public class WordStudy {
	
	// 대문자 출력이니까 입력문자를 모두 문자로 변환 String.toUpperCase();
	// 알파벳 A ~Z 는 26가지 
	// 입력 문자열 길이만큼 반복문자 실
	
	// map 사용해서 다시 풀어볼 것 !
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().toUpperCase();
	
		int max = 0;
		
		String result = "";
		
		while(true) {
			String index = String.valueOf(S.charAt(0));
			int size = S.length();
			S =S.replace(String.valueOf(S.charAt(0)), "");
			int newSize = S.length();
			
			if(max == (size - newSize)) {
				result += index;
			}
			
			if(max <(size -newSize)) {
				max = (size - newSize);
				result = index;
			}
			if(S.equals("")) break;
		}
		
		if(result.length() == 1) {
			System.out.println(result);
		}else {
			System.out.println("?");
		}
	}
}
