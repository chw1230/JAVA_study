package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2003, 12, 30, 10, 6, 20);
        System.out.println("현 시간 = " + nowDt);
        System.out.println("지정 시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산 (불변)
        LocalDateTime plusOfDt = ofDt.plusDays(1);
        System.out.println("지정 시간 + 1d= " + plusOfDt);

        // 비교
        System.out.println("혖재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowDt.isBefore(ofDt));
        System.out.println("혖재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowDt.isAfter(ofDt));
        System.out.println("혖재 날짜 시간이 지정 날짜과 같은가?" + nowDt.isEqual(ofDt));

    }
}
