package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST,LOGIN,ADMIN]:");
        AuthGrade option = AuthGrade.valueOf(sc.nextLine().toUpperCase());
        show(option);
    }

    private static void show(AuthGrade option){
        System.out.println("당신의 등급은 "+option+" 입니다.");
        System.out.println(" ==메뉴 목록==");
        if(option.getLevel()>0){
            System.out.println("- 메인 화면");
        }
        if (option.getLevel()>1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (option.getLevel()>2) {
            System.out.println("- 관리자 화면");
        }
    }

}
