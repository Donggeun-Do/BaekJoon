import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 난이도 브론즈 III
 * 3009번 네 번째 점
 * 2022-08-04 문제 풀이 완료
 */
public class P_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        ArrayList<Integer> front = new ArrayList<>();
        ArrayList<Integer> behind = new ArrayList<>();
        for(int i=0; i<3; i++) {
            String[] temp = br.readLine().split(" ");
            front.add(Integer.parseInt(temp[0]));
            behind.add(Integer.parseInt(temp[1]));
        }

        //정렬
        Collections.sort(front);
        Collections.sort(behind);

        //0번째 내용과 1번째 내용이 같으면 혼자 남는 인덱스는 2
        //0번째 내용과 1번째 내용이 다르면 혼자 남는 인덱스는 0
        if(front.get(0).equals(front.get(1))) {
            bw.write(front.get(2)+" ");
        } else {
            bw.write(front.get(0)+" ");
        }

        if(behind.get(0).equals(behind.get(1))) {
            bw.write(behind.get(2)+"");
        } else {
            bw.write(behind.get(0)+"");
        }

        br.close();
        bw.close();
    }
}
