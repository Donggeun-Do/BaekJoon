import java.io.*;

/*
2022-12-03 풀이완료
 */
public class P_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int result = 0;
        boolean flag;

        //입력 및 핸들링 과정
        String[] string_arr = br.readLine().split(" ");
        int[]  arr = new int[string_arr.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(string_arr[i]);
        }

        //배열을 돌면서 체크
        for(int i=0; i<number; i++) {
            //초기화
            flag = true;
            int temp = arr[i];

            //타겟이 1이 아니고, 자기 자신이 아니면서 다른 수로 나뉘는게 있는지 체크
            //있으면 false로 플래그 수정, result에 영향 주지 않음.
            //끝까지 true 상태로 유지하면 result에 1 추가.
            if (temp != 1) {
                for(int j=2; j<temp; j++) {
                    if (temp%j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result++;
                }
            }
        }

        //출력 후 마무리.
        System.out.println(result);
    }
}
