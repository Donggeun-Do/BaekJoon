import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2022-12-06 문제 풀이 완료
 */
public class P_3003 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] original = {1, 1, 2, 2, 2, 8};
        int[] result = new int[input.length];

        for(int i=0; i<original.length; i++) {
            int temp = Integer.parseInt(input[i]);

            result[i] = original[i]-temp;
        }

        for(int i=0; i<original.length; i++)
            System.out.print(result[i]+" ");
    }
}
