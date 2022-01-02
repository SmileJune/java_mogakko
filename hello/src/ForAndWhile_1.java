import java.util.Scanner;

public class ForAndWhile_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int input = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지 합은 %d입니다.", input, sum);
    }
}

