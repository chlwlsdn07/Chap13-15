import java.time.DayOfWeek;
import java.time.LocalDateTime;

import java.time.temporal.TemporalAdjusters;

// 특정날짜 계산하기 예제
public class chap14_05 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 2, 22, 12, 30);

        LocalDateTime targeDateTime = localDateTime.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println(targeDateTime);
    }
}
