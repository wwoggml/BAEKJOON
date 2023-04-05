import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[31];

        for(int i = 0; i<28; i++) {
            int a = Integer.parseInt(br.readLine());
            array[a] = a;
        }

        for(int i = 1; i<=30; i++) {
            if(array[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
