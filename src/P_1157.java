import java.util.Arrays;
import java.util.Scanner;

public class P_1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.next().toUpperCase();
        input.close();

        int[][] result = new int[2][25];
        for(int i=65; i<=90; i++) {
            result[0][i] = i;
            result[1][i] = 0;
        }

        for(int i=0; i<sentence.length(); i++) {
            char temp = sentence.charAt(0);
        }
    }
}
