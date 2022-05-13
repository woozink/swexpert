package d2;

import java.io.*;
import java.util.*;

public class NumRotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, N;
		int[][] arr, arr1, arr2, arr3;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			arr1 = rotate(arr, N);
			arr2 = rotate(arr1, N);
			arr3 = rotate(arr2, N);
			System.out.printf("#%d\n", test_case);
			print(arr1, arr2, arr3, N);
		}
	}

	public static int[][] rotate(int[][] arr, int N) {
		int[][] ret = new int[N][N];
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				ret[col][N - row - 1] = arr[row][col];
			}
		}
		return ret;
	}

	public static void print(int[][] arr1, int[][] arr2, int[][] arr3, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.print(" ");
			for (int j = 0; j < N; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.print(" ");
			for (int j = 0; j < N; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
	}
}