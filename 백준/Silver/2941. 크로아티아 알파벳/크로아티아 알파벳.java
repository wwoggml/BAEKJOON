import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String result = str.replace("s=", "š").replace("c=","č").replace("c-","ć").replace("dz=","a").replace("d-","đ")
                .replace("lj", "a").replace("z=", "ž").replace("nj","a");

        System.out.println(result.length());
    }
}
