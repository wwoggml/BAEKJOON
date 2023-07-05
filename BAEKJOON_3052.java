import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BAEKJOON_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        int size = 10, count = 0, result = 0;
//        int[] array = new int[size];
//
//        for(int i = 0; i<size; i++) {
//            array[i] = Integer.parseInt(bf.readLine());
//        }
//
//        for(int i = 0; i<size; i++) {
//            count = 0;
//            for(int j = i+1; j<size; j++) {
//                if(array[i] % 42 == array[j] % 42) count++;
//            }
//            if(count == 0) result++;
//        }
//
//        System.out.printf("%d", result);

        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i<10; i++) {
            h.add(Integer.parseInt(bf.readLine()) % 42);
        }

        System.out.println(h.size());
    }
}

