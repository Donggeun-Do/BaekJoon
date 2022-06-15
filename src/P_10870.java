import java.util.Scanner;

/**
 * 2022-06-15 풀이 완료
 */
public class P_10870 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int a) {
        int result;
        if(a==0) {
            result = 0;
        } else if (a==1) {
            result = 1;
        } else {
            result = fibonacci(a-2)+fibonacci(a-1);
        }
        return result;
    }
}
