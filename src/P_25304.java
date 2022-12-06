import java.io.*;

/*
2022-12-07 문제 풀이 완료
 */
public class P_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //total_verification, 입력받은 총합
        //total, 계산한 총합을 저장
        //count, 입력받은 총 갯수
        int total_verification = Integer.parseInt(br.readLine());
        int total = 0;
        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++) {
            String[] array = br.readLine().split(" ");

            //String 배열로 받은 값을 int로 형변환하고, 계산결과 total에 저장.
            int subject = Integer.parseInt(array[0]);
            int subject_count = Integer.parseInt(array[1]);

            total = total+subject*subject_count;
        }

        //입력받은 값과 계산한 값이 같으면 Yes, 아니면 No 출력
        if(total_verification==total)
            bw.write("Yes");
        else
            bw.write("No");

        bw.close();
    }
}
