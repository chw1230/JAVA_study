package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 95;

        if( 90 <= score ){
            System.out.println("출력: 학점은 A 입니다.");
        } else if ( 80 <= score ) {
            System.out.println("출력: 학점은 B 입니다.");
        } else if ( 70 <= score ) {
            System.out.println("출력: 학점은 C 입니다.");
        } else if ( 60 <= score ) {
            System.out.println("출력: 학점은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
    }
}
