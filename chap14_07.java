import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 날짜 포맷팅 예제
public class chap14_07 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022,1,22,13,30,15);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("y년 M월 d일 E요일 a h시 m분 s초 ");
        String dateTimestr = localDateTime.format(dateTimeFormatter);
        System.out.println(dateTimestr);
    }
}
