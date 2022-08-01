import java.io.*;

/*
문제 1085번 직사각형에서 탈출
2022-08-01 문제풀이 완료
 */
public class P_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        //가로 계산
        //우선 x 위치 기준으로 저장
        int temp_row = x;
        if(temp_row > (w-x))
            temp_row = w-x;

        //우선 y 위치 기준으로 저장
        int temp_col = y;
        if(temp_col > (h-y))
            temp_col = h-y;

        System.out.println(temp_row>=temp_col ? temp_col : temp_row);

        br.close();
    }
}
