import java.util.Arrays;
import java.util.Scanner;

/*
2022-05-27 풀이 완료
 */
public class P_2941 {
    static boolean logging_flag;
    public static void main(String[] args) {
        logging_flag=false;
        Scanner input = new Scanner(System.in);

        String[] sentence = input.next().split("");
        logging("sentence: ", Arrays.toString(sentence));
        input.close();

        int count=0;
        int limit = sentence.length;
        for(int i=0; i<sentence.length; i++) {
            logging("이번 문구:",sentence[i]);
            if(i<limit-1 && sentence[i].equals("c")) {
                if(sentence[i+1].equals("=") || sentence[i+1].equals("-")) {
                    count++;
                    i++;
                    logging("FIND č, Count=",Integer.toString(count));
                    continue;
                }
            }
            if (i<limit-1 && sentence[i].equals("d")) {
                if(i<limit-2 && sentence[i+1].equals("z")) {
                    if (sentence[i+2].equals("=")) {
                        count++;
                        i=i+2;
                        logging("FIND dž, Count=",Integer.toString(count));
                        continue;
                    }
                }
                if(sentence[i+1].equals("-")) {
                    count++;
                    i++;
                    logging("FIND đ, Count=",Integer.toString(count));
                    continue;
                }
            }
            if(i<limit-1 && sentence[i].equals("l")) {
                if (sentence[i + 1].equals("j")) {
                    count++;
                    i++;
                    logging("FIND lj, Count=",Integer.toString(count));
                    continue;
                }
            }
            if(i<limit-1 && sentence[i].equals("n")) {
                if (sentence[i + 1].equals("j")) {
                    count++;
                    i++;
                    logging("FIND nj, Count=",Integer.toString(count));
                    continue;
                }
            }
            if(i<limit-1 && sentence[i].equals("s")) {
                if (sentence[i + 1].equals("=")) {
                    count++;
                    i++;
                    logging("FIND š, Count=",Integer.toString(count));
                    continue;
                }
            }
            if(i<limit-1 && sentence[i].equals("z")) {
                if (sentence[i + 1].equals("=")) {
                    count++;
                    i++;
                    logging("FIND ž, Count=",Integer.toString(count));
                    continue;
                }
            }
            count++;
            logging("FIND ELSE, Count=",Integer.toString(count));
        }

        System.out.println(count);
    }

    public static void logging(String input1, String input2) {
        if(logging_flag==true) {
            System.out.println(input1 + " / "+input2);
        }
    }
}
