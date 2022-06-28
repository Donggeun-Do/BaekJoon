import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2022-06-28 문제풀이 완료
 */

public class P_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        int times = Integer.parseInt(temp);
        String[] result = new String[times];
        for(int i=0; i<times; i++) {
            String[] stringSplit = br.readLine().split(" ");
            int h = Integer.parseInt(stringSplit[0]);
            int w = Integer.parseInt(stringSplit[1]);
            int th = Integer.parseInt(stringSplit[2]);

            int room = th/h+1;
            int floor = th%h;
            if(floor==0) {
                floor=(th-1)%h+1;
                room--;
            }

            if(room < 10) {
                result[i] = floor+"0"+room;
            } else {
                result[i] = floor+""+room;
            }
        }
        br.close();
        for(int i=0; i<times; i++) {
            System.out.println(result[i]);
        }
    }
}
