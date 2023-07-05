import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] array = new int[26];
        int k = 0;
        for(char i = 'a'; i<='z'; i++, k++) {
            for(int j = 0; j<S.length(); j++) {
                if(S.charAt(j) == i) {
                    array[k] = j;
                    break;
                }
                else  array[k] = -1;

            }
        }

        for(int i = 0; i<26; i++)
            System.out.print(array[i] + " ");
    }
}
