import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String Upperstr = str.toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i<Upperstr.length(); i++) {
            count[Upperstr.charAt(i) - 'A']++;
        }

        int max = 0;
        char c = 0;
        for(int i = 0; i<count.length; i++) {
            if(count[i] > max) {
                c = (char) (i + 65);
                max = count[i];
            }
            else if(count[i] == max) c = '?';
        }

        System.out.println(c);
    }
}
