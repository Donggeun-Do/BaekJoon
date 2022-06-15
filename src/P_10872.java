import java.util.Scanner;

/**
 * 2022-06-15 문제풀이완료
 */
public class P_10872 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        System.out.println(factorial(number));
    }

    public static int factorial(int a) {
        logging(">>>factorial 진입, ("+a+")\n");

        if(a==0) {
            return 1;
        }

        int result = a*factorial(a-1);
        logging(a+"*"+(a-1)+"! 연산, factorial 호출\n");
        return result;
    }

    static boolean logging_flag=false;
    public static void logging(String input1) {
        if(logging_flag) {
            System.out.print(input1);
        }
    }
}
