import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 2개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("둘 중에 큰 수는 : ");
        print(a, b);
    }

    static void print(int a, int b) {
        if (a == b) {
            System.out.println("같음");
        }
        if (a > b) {
            System.out.println(a);
        }
        if (a < b) {
            System.out.println(b);
        }
    }
}
