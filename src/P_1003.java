import java.io.*;

/*
 * 2022-06-28 문제풀이 완료
 * 단
 */

public class P_1003 {
    static int count_zero;
    static int count_one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.parseInt(br.readLine());
        int[] arr = new int[times];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j : arr) {
            count_zero = 0;
            count_one = 0;

            fibonacci(j);

            bw.write(count_zero + " " + count_one + "\n");
            bw.flush();
        }
        bw.close();
    }

    public static void fibonacci(int number) {
        if (number==0) {
            count_zero++;
        } else if (number==1) {
            count_one++;
        } else {
            fibonacci(number-1);
            fibonacci(number-2);
        }
    }
}
