import java.io.*;
import java.util.Arrays;

public class P_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String temp = br.readLine();
            if (temp.equals("0 0 0"))
                break;

            Integer[] arr = Arrays.stream(temp.split(" ")).map(s -> Integer.parseInt(s)).sorted().toArray(Integer[] :: new);

            bw.write(arr[2]*arr[2] == arr[0]*arr[0]+arr[1]*arr[1] ? "right\n" : "wrong\n");
        }
        br.close();
        bw.close();
    }
}
