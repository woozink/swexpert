package ssafy;

import java.io.*;
import java.util.*;

public class Solution1 {

	public static void swap(List<Integer> numbers, int a, int b) {
		int temp = numbers.get(a);
		numbers.set(a, numbers.get(b));
		numbers.set(b, temp);
	}
	
	public static void main(String[] args) {
		// Primitive type 원시 타입 (int long float double char boolean short byte)
		// Reference type 참조타입 (Object)
		// Null
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		
		System.out.println(numbers);
		swap(numbers, 2,3);// 2번째 수 <-> 3번째 수
		// 6<->7
		swap(numbers, 6,7);
		System.out.println(numbers);

	}
}

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int T = Integer.parseInt(br.readLine());
//
//		for (int tc = 1; tc <= T; tc++) {
//			int cnt = 0;
//			int N = Integer.parseInt(br.readLine());
//			int[] arr = new int[N + 2];
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for (int i = 0; i < N; i++) {
//				arr[i] = Integer.parseInt(st.nextToken());
//			}
//
//			for (int i = 0; i < N; i++) {
//				
//
//				// 짝수일때
//				if (arr[i] % 2 == 0) {
//					if (arr[i + 1] % 2 == 1) {
//						continue;
//					} else {
//						if (arr[i + 2] % 2 == 0) {
//							break;
//						} else {
//							swap(arr[i + 1], arr[i + 2]);
//							cnt++;
//						}
//					}
//				}
//				// 홀수 일때
//				else {
//					if (arr[i + 1] % 2 == 0) {
//						continue;
//					} else {
//						if (arr[i + 2] % 2 == 1) {
//							break;
//						} else {
//							swap(arr[i + 1], arr[i + 2]);
//							cnt++;
//						}
//					}
//				}
//			}
//
//			System.out.println("#" + tc + " " + cnt);
//
//		}
//	}



