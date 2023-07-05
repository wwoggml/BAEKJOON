package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45) System.out.println(H + " " + (M-45));
        else if(M < 45 && H == 0) {
            System.out.println((H+23) + " " + (M+15));
        }
        else System.out.println((H-1) + " " + (M+15));

    }
}
