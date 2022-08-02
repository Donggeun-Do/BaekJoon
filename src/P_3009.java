import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int[][] arr = new int[3][2];
        for(int i=0; i<3; i++) {
            String[] temp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
        }

        //처리
        ArrayList<int[]> front = new ArrayList<>();
        ArrayList<int[]> behind = new ArrayList<>();
        for(int i=0; i<3; i++) {

        }

        br.close();
        bw.close();
    }
}
