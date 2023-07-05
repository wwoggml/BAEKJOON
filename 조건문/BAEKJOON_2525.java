package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int min, hour = 0;
        if(B + C <= 59) {
            hour = A;
            min = B+C;
        }
        else {
            min = (B+C) % 60;
            hour = A + (B+C)/60;
            if(hour >= 24) hour -= 24;
        }
        System.out.println(hour + " " + min);
    }
}
