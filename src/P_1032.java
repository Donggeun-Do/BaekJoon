import java.io.*;

/*
Link: https://www.acmicpc.net/problem/1032
2022-07-30 문제 풀이 완료
 */

public class P_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력받기
        int times = Integer.parseInt(br.readLine());
        String[] original = new String[times];
        for(int i=0; i<times; i++) {
            original[i] = br.readLine();
        }

        //입력값이 한개면 그냥 바로 출력 후 종료
        if(times == 1) {
            bw.write(original[0]);
            br.close();
            bw.close();
            System.exit(0);
        }

        //입력받은 내용 한글자씩 자르기
        String[][] handling = new String[times][original[0].length()];
        for(int i=0; i<times; i++) {
            handling[i] = original[i].split("");
        }

        //한글자씩 자른 배열로 각각 자리 비교하기.
        String result = "";
        boolean flag = true;
        String temp = "";
        for(int i=0; i<original[0].length(); i++) {
            for(int j=0; j<times-1; j++) {
                temp = handling[0][i];
                if(handling[j][i].equals(handling[j+1][i]))
                    flag = true;
                else {
                    flag = false;
                    break;
                }
            }

            if(flag == true)
                result = result + "" + temp;
            else
                result+="?";
        }

        //내용 출력 작성
        bw.write(result);

        //Buffer Close
        br.close();
        bw.close();

    }
    static boolean logging_flag=true;
    public static void logging(String input1) {
        if(logging_flag) {
            System.out.print(input1);
        }
    }
}
