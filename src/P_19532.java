import java.util.Arrays;
import java.util.Scanner;

public class P_19532 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] line1 = new int[3];
        for(int i=0; i<3; i++)
            line1[i] = input.nextInt();

        int[] line2 = new int[3];
        for(int i=0; i<3; i++)
            line2[i] = input.nextInt();

        logging("=====입력 출력=====\n");
        logging(Arrays.toString(line1)+"\n");
        logging(Arrays.toString(line2)+"\n");

        int head1=line1[0];
        int head2=line2[0];

        if(head1>0 && head2>0) {
            for(int i=0; i<3; i++) {
                line1[i]*=head2;
                line2[i]*=-head1;
            }
        } else {
            for(int i=0; i<3; i++) {
                line1[i]*=head2;
                line2[i]*=head1;
            }
        }

        logging("=====1차 결과 출력(X값 통일)=====\n");
        logging(Arrays.toString(line1)+"\n");
        logging(Arrays.toString(line2)+"\n");

        int[] result = new int[3];
        for(int i=0; i<3; i++) {
            result[i] = line1[i]+line2[i];
        }
        logging("=====2차 결과 출력(X소거)=====\n");
        logging(Arrays.toString(result)+"\n");

        int resultY = result[2]/result[1];
        logging("=====3차 결과 출력(Y연산 완료)=====\n");
        logging(resultY+"\n");

        int resultX = (line1[1]*-resultY+line1[2])/line1[0];
        logging("=====2차 결과 출력(X연산 완료)=====\n");
        logging(resultX+"\n");

        System.out.println(resultX + " " + resultY);
    }

    static boolean logging_flag=false;
    public static void logging(String input1) {
        if(logging_flag==true) {
            System.out.print(input1);
        }
    }

}
