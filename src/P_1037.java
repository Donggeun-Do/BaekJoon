import java.io.*;
import java.util.Arrays;

/*
문제 1037번 약수
2022-08-02 문제풀이완료
 */
public class P_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        //입력받은 내용 순서대로 정렬하여 arr 배열에 저장.
        Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(s -> Integer.parseInt(s)).sorted().toArray(Integer[] :: new);

        //약수가 한개이고, 그 약수가 2인 경우는 4밖에 없으므로 4 출력
        //그 외에는 첫번째 약수와 마지막 약수를 곱해 원래 수 출력
        if(number==1 && arr[0] == 2) {
            System.out.println(4);
        } else {
            System.out.println(arr[0]*arr[arr.length-1]);
        }

        br.close();
        bw.close();
    }
}
