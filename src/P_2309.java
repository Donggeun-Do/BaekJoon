import java.lang.reflect.Array;
import java.util.*;

/*
2022-05-30 풀이 완료
 */
public class P_2309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //받아오기, 정렬하기.
        ArrayList<Integer> original = new ArrayList<>();
        for(int i=0; i<9; i++)
            original.add(input.nextInt());
        Collections.sort(original);
        input.close();

        int result;
        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                result = 0;
                logging("이번 제외","");
                logging(Integer.toString(i),Integer.toString(j));
                for(int k=0; k<9; k++){
                    if(k==i || k==j) {
                        continue;
                    } else {
                        logging(Integer.toString(original.get(k)),"더함.");
                        result = result+original.get(k);
                    }
                }
                logging("result",Integer.toString(result));
                if (result==100) {
                    logging("100 탐색 완료", "삭제 절차 시작");
                    logging("삭제 시작","i,j");
                    logging(Integer.toString(i), Integer.toString(j));
                    original.remove(i);
                    original.remove(j-1);
                    for(int k=0; k<7; k++) {
                        System.out.println(original.get(k));
                    }
                    System.exit(0);
                }
            }
        }
//        for(int i=0; i<9-1; i++) {
//            for(int j=i+1; j<9; j++) {
//                System.out.println("i="+i+", j="+j);
//            }
//        }
    }

    static boolean logging_flag = false;
    public static void logging(String input1, String input2) {
        if(logging_flag==true) {
            System.out.println(input1 + " : "+input2);
        }
    }

}
