import java.io.*;

/**
 * 난이도 브론즈 IV
 * 10039번 평균 점수
 * 2022-08-08 문제 풀이 완료
 */
public class P_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int input = 0;
        for(int i=0; i<5; i++) {
            input = Integer.parseInt(br.readLine());

            //40점 미만일때는 sum 변수에 40 더함.
            if (input < 40)
                sum += 40;
            //그 외에는 점수 그대로 sum 변수에 반영
            else
                sum += input;
        }

        //평균 출력하고 종료.
        bw.write(String.valueOf(sum/5));

        br.close();
        bw.close();
    }
}
