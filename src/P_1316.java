import java.util.ArrayList;
import java.util.Scanner;

/*
2022-05-30 풀이 완료
 */
public class P_1316 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        int result =0;
        for(int i=0; i<times; i++) {
            String[] temp_input = input.next().split("");
            ArrayList<String> check = new ArrayList<>();

            String object = "";
            boolean flag=true;
            for(int j=0; j<temp_input.length; j++) {
                flag=true;
                logging("==========","==========");
                logging("obeject: ",object);
                logging("배열: ",temp_input[j]);
                logging("==========","==========");
                if(object.equals(temp_input[j])) {          //전꺼랑 연이어서 같으면 다음 검사로 넘어감
                    logging("===일치===","(다음으로 이동)");
                    continue;
                } else {                                    //전꺼랑 연이어서 '안' 같으면 추가 작업
                    if(!check.contains(temp_input[j])) {        //체크 배열에 있는지 확인해서 없으면
                        logging("[신규]ArrayList: ",temp_input[j]);
                        check.add(temp_input[j]);               //배열에 추가하고
                        object = temp_input[j];                 //obejct 새로 지정
                    } else {                                    //체크 배열에 이미 있는 알파벳이면
                        logging("[경고]이미 존재하는 알파벳!!","카운트 패스");
                        flag=false;
                        break;
                    }
                }
            }
            if (flag==true) {
                result++;
                logging("count 1추가, 현재 count: ", Integer.toString(result));
            } else {
                logging("count 동결, 현재 count: ", Integer.toString(result));
            }

        }
        input.close();
        System.out.println(result);
    }

    static boolean logging_flag = false;
    public static void logging(String input1, String input2) {
        if(logging_flag==true) {
            System.out.println(input1 + " / "+input2);
        }
    }
}
