import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========== 자기소개 입력하기 ===========");

        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("혈액형을 입력하세요 : ");
        String bloodType = scanner.nextLine();

        System.out.print("MBTI를 입력하세요 : ");
        String MBTI = scanner.nextLine();

        System.out.print("좌우명 한 문장을 입력하세요 : ");
        String motto = scanner.nextLine();

        System.out.printf("=========== 자기소개 입력 완료 ===========\n\n");

        System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요");
        scanner.nextLine();
        System.out.println();

        System.out.printf("저는 %s입니다. 나이는 %d살 이에요.\n", name, age);
        System.out.printf("혈액형은 %s형 이구요, %s입니다.\n\n", bloodType, MBTI);

        System.out.printf("***%s!!!!!!!***", motto);

    }
}
