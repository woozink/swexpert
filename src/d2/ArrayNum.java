package d2;

import java.io.*;
import java.util.*;

public class ArrayNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        List<Integer> list = new ArrayList<Integer>();
        int TC = Integer.parseInt(br.readLine());
        for (int test = 1; test <= TC; test++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            System.out.print("#" + test + " ");
            while (!list.isEmpty()) {
                System.out.print(list.remove(0) + " ");
            }
            System.out.println();
        }
    }
}