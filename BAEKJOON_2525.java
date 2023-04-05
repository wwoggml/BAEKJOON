import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int addmin = Integer.parseInt(br.readLine());

        int totalMin = hour * 60 + min;
        totalMin += addmin;
        hour = (totalMin / 60) % 24;
        min = totalMin % 60;

        System.out.println(hour + " " + min);
    }
}
