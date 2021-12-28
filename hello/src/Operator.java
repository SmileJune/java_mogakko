import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("=====사칙연산 출력하기=====");
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);  // %를 출력하려면 %%라고 작성해야 한다!

    }
}
