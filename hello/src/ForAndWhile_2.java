import java.util.Scanner;

public class ForAndWhile_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int input = sc.nextInt();

        int sum = 0;
        int i =1;
        while(i <= input){
            sum += i;
            i++;
        }

        System.out.printf("1부터 %d까지 합은 %d입니다.", input, sum);
    }
}
