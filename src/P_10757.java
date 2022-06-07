import java.math.BigInteger;
import java.util.Scanner;

/*
2022-06-07 풀이 완료
 */
public class P_10757 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();
        input.close();

        BigInteger result = A.add(B);

        System.out.println(result);
    }
}
