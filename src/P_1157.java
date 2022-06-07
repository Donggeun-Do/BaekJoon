import java.util.Arrays;
import java.util.Scanner;

/*
2022-06-07 풀이완료
 */
public class P_1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.next().toUpperCase();
        input.close();

        int[][] result = new int[2][26];
        for(int i=65; i<=90; i++) {
            result[0][i-65] = i;
            result[1][i-65] = 0;
        }

        for(int i=0; i<sentence.length(); i++) {
            char temp = sentence.charAt(i);

            result[1][temp-65]++;
        }

        int flag=0;
        int max=0;
        int count=0;
        for(int i=0; i<result[0].length; i++) {
            if (result[1][i]==max) {
                count++;
            }
            if(result[1][i] > max) {
                max = result[1][i];
                flag = result[0][i];
                count=1;
            }
        }
//        System.out.println("max: "+max);
//        System.out.println("count : "+count);

        if(count==1)
            System.out.println((char) flag);
        else
            System.out.println("?");
    }
}
