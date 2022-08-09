import java.io.*;

/**
 * 난이도 브론즈 V
 * 2558번 A+B - 2
 * 2022-08-08 문제 풀이 완료
 */
public class P_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(a+b));

        br.close();
        bw.close();
    }
}
