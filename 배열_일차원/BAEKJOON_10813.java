package 배열_일차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        int temp = 0;

        for(int i = 0; i<N; i++) {
            array[i] = i + 1;
        }
        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            temp = array[a-1];
            array[a-1] = array[b-1];
            array[b-1] = temp;
        }

        for(int i = 0; i<N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
