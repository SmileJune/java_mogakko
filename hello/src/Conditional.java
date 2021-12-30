import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 개발자 MBTI 결과 보기 ====");
        System.out.print("당신의 MBTI를 입력하세요 : ");
        String str = sc.nextLine();

        str = str.toUpperCase();
        System.out.println(checkDeveloperTypeByMBTI(str));

    }

    static String checkDeveloperTypeByMBTI(String str) {
        String[] MBTI = {"INFP", "ENJF", "INFJ", "ISTJ", "ENTJ", "ISFJ", "INTJ", "ENFP", "ENTP", "ESFJ", "ESFP", "ESTP", "ESTJ", "INFP", "ISTP", "ISFP"};
        String[] developerType = {"백엔드형", "프론트엔드형", "풀스택형", "퍼블리셔형", "아키텍쳐형", "보안전문가형", "데이터분석가형", "AI형", "IOS형", "안드로이드형", "게임 개발자형", "IoT 개발형", "QA형", "블록체인형", "임베디드 개발자형", "네트워크 개발자형"};

        for (int i = 0; i < MBTI.length; i++) {
            if (str.equals(MBTI[i])) {
                return developerType[i];
            }
        }

        return "정확한 MBTI 유형이 아니네요 !";
    }
}
