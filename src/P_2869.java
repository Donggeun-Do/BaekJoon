import java.util.Scanner;

public class P_2869 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int v = input.nextInt();

        input.close();

        logging("a: "+a+"\n");
        logging("b: "+b+"\n");
        logging("v: "+v+"\n");

        int day = v/a-a;

        if (day+a <= v) {
            System.out.println(day+1);
        } else {

        }
    }

    static boolean logging_flag=true;
    public static void logging(String input1) {
        if(logging_flag) {
            System.out.print(input1);
        }
    }
}
