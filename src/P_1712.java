import java.util.Scanner;

public class P_1712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fix_price = input.nextInt();
        int make_price = input.nextInt();
        int sell_price = input.nextInt();
        input.close();

        int profit=sell_price-make_price;

        if (profit <= 0) {
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println((fix_price/profit)+1);
    }
}
