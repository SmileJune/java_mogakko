public class Print {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;

        System.out.println("-------------------------------");
        System.out.print("덧셈, 뺄셈, 곱셈의 결과를 볼까요?\n");
        System.out.printf("a+b는 %d, a-b는 %d, a*b는 %d\n", a + b, a - b, a * b);
        System.out.println("그렇다면 a와 b는?!");
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.println("-------------------------------");
    }
}
