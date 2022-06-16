import java.util.Scanner;

public class P_17478 {
    static String split = "____";
    static String sentence1 = "\"재귀함수가 뭔가요?\"";
    static String sentence2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String sentence3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String sentence4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String after_sentence1 = "라고 답변하였지.";
    static int call_count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        professor_JH(number);
    }

    public static void professor_JH(int a) {

        if (a==0) {
            System.out.println(split.repeat(call_count)+sentence1);
            System.out.println(split.repeat(call_count)+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(split.repeat(call_count)+after_sentence1);
            return;
        }

        System.out.println(split.repeat(call_count)+sentence1);
        System.out.println(split.repeat(call_count)+sentence2);
        System.out.println(split.repeat(call_count)+sentence3);
        System.out.println(split.repeat(call_count)+sentence4);

        if(a!=0) {
            call_count++;
            professor_JH(a-1);
        }
        call_count--;
        System.out.println(split.repeat(call_count)+after_sentence1);
    }
}
