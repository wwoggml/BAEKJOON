package 배열_일차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N, M,a,b, temp;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] array = new int[N+1];

        for(int i = 1; i<N+1; i++)
            array[i] = i;

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            for(int h = a; h<b; h++){
                temp = array[h];
                array[h] = array[b];
                array[b--] = temp;
            }
        }

        for(int i = 1; i<N+1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
