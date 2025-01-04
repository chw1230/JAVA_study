package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2022, 12, 20);
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

        // 계산(불변) -> 변경하는 경우에 객체를 통해서 반환값을 받아서 이용해야한다.
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10day = " + ofDate);
    }
}
