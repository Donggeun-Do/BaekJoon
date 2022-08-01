import java.io.*;

/*
문제 5086번 배수와 약수
2022-08-02 문제 풀이 완료
 */
public class P_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        String[] input_line;
        String input = br.readLine();
        while (!input.equals("0 0")) {
            //입력받은 줄 나누어서 int형 변수 a, b에 저장
            input_line = input.split(" ");
            a = Integer.parseInt(input_line[0]);
            b = Integer.parseInt(input_line[1]);

            //판별
            if(b%a==0) {
                bw.write("factor\n");
            } else if (a%b==0) {
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }

            //0 0 검증위해 다시 읽어들임.
            input = br.readLine();
        }

        br.close();
        bw.close();
    }
}
