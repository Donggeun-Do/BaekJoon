import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P_1339 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] sentence = new String[input.nextInt()];
        int[] how_long = new int[sentence.length];
        int total=0;
        for(int i=0; i< sentence.length; i++) {
            sentence[i] = input.next();
            how_long[i] = sentence[i].length();
            total+=sentence[i].length();
        }
        input.close();

        logging(Arrays.toString(sentence));
        logging(Arrays.toString(how_long));
        logging("total: "+total);
    }

    static boolean logging_flag = true;
    public static void logging(String input1) {
        if(logging_flag==true) {
            System.out.print(input1);
        }
    }
}
