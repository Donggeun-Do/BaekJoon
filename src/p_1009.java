import java.io.*;

/*
2022-12-07 문제 풀이 완료
 */
public class p_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //cases: 테스트케이스 개수
        int cases = Integer.parseInt(br.readLine());

        for(int i=0; i<cases; i++) {
            //입력 2가지 변수로 저장.
            String[] input = br.readLine().split(" ");
            int object_1 = Integer.parseInt(input[0]);
            int object_2 = Integer.parseInt(input[1]);

            //계산 결과 저장용 변수에 초기값 지정.
            int calc = 1;

            //지수 만큼 제곱해주기 위해서 for문 동작.
            for(int j=0; j<object_2; j++)
                calc = (calc*object_1)%10;

            //0번째 컴퓨터는 존재할 수 없으므로, 10번으로 배정.
            if(calc == 0)
                calc = 10;

            //계산결과를 출력
            bw.write(calc+"\n");
        }
        bw.close();
    }
}
