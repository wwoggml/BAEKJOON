package 배열_일차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];

        for(int i = 0; i<9; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        int max = array[0], index = 0;
        for(int i = 0; i<9; i++){
            if(max < array[i]) {
                max = array[i];
                index = i;
            }

        }

        System.out.println(max);
        System.out.println(index);
    }
}
