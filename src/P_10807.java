import java.io.*;
import java.util.ArrayList;

/*
2022-12-07 문제 풀이 완료
 */
public class P_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //결과 저장 배열
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array_count = new ArrayList<>();

        //count: 입력받을 갯수
        //input: String 형식으로 받을 배열
        //search: 검색 대상이 될 정수
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int search = Integer.parseInt(br.readLine());

        //temp: String을 Int형으로 변환할때 사용할 임시 변수
        //index: 배열의 위치를 저장할 변수
        int temp;
        int index;

//        bw.write("Count: "+count+"\nList: "+ Arrays.toString(input)+"\nSearch: "+search+"\n\n");

        for(int i=0; i<count; i++) {
            temp = Integer.parseInt(input[i]);
//            bw.write("Number: "+temp+"\n");

            //존재하면 인덱스를 구하여 총 갯수+1
            if(array.contains(temp)) {
                index = array.indexOf(temp);
                array_count.set(index, array_count.get(index)+1);
//                bw.write("존재: "+array_count.get(index)+"\n\n");
            } else {    //존재하지 않으면, 새롭게 추가
                array.add(temp);
                array_count.add(1);
//                bw.write("존재하지 않음. 새로 추가.\n\n");
            }
        }

        bw.write(array.contains(search) ? "0" : array_count.get(array.indexOf(search))+"");
        bw.close();
    }
}
