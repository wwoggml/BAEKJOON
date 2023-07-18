import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            int[] array = new int[26];
            array[str.charAt(0) - 'a']++;
            count++;

            for(int j = 1; j<str.length(); j++) {
                if(array[str.charAt(j) - 'a'] == 0) array[str.charAt(j) - 'a']++;
                else {
                    if(str.charAt(j) == str.charAt(j-1)) array[str.charAt(j) - 'a']++;
                    else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
