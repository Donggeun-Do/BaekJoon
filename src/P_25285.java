import java.util.Scanner;

/*
2022-07-26 문제 풀이 완료
 */

public class P_25285 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        int[][] info = new int[times][2];
        for(int i=0; i<times; i++) {
            info[i][0] = input.nextInt();
            info[i][1] = input.nextInt();
        }
        input.close();

        for(int i=0; i<times; i++) {
            int height = info[i][0];
            int weight = info[i][1];
            double bmi = 0;

            if (height<140.1) {
                System.out.println(6);
            } else if (height>=140.1 && height < 146) {
                System.out.println(5);
            } else if (height>=146 && height < 159) {
                System.out.println(4);
            } else if (height>=159 && height < 161) {
                bmi = bmi_calc(height, weight);
                if (bmi >= 16.0 && bmi < 35.0) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
            } else if (height >= 161 && height < 204) {
                bmi = bmi_calc(height, weight);
                if (bmi >= 20.0 && bmi < 25.0) {
                    System.out.println(1);
                } else if ((bmi >= 18.5 && bmi<20.0) || (bmi >= 25.0 && bmi < 30.0)) {
                    System.out.println(2);
                } else if ((bmi >= 16.0 && bmi<18.5) || (bmi >= 30.0 && bmi < 35.0)) {
                    System.out.println(3);
                }  else {
                    System.out.println(4);
                }
            } else if (height >= 204) {
                System.out.println(4);
            }
        }
    }

    public static double bmi_calc(int height, int weight) {
        double d_height = (double)height/100;
        return weight/(d_height*d_height);
    }
}
