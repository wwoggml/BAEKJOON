package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            total += a * b;
        }

        if(X == total) System.out.println("Yes");
        else System.out.println("No");
    }
}
