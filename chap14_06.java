import java.time.LocalDateTime;

// 날짜 및 시간 비교
 class chap14_06 {
     public static void main(String[] args) {
         LocalDateTime startDateTime = LocalDateTime.of(2022, 1 ,22, 12, 30);
         LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 11, 15);

         boolean flag = false;
         // startDateTime이 endDateTime보다 이전 날짜인지 비교
         flag = startDateTime.isBefore(endDateTime);
         System.out.println("startDateTime.isBefore(endDateTime) : " + flag);
         // 동일 날짜인지 비교
         flag = startDateTime.equals(endDateTime);
         System.out.println("startDateTime.isEqual(endDateTime) : " + flag);
         // startDateTime이 endDateTime보다 이후 날짜인지 비교
         flag = startDateTime.isAfter(endDateTime);
         System.out.println("startDateTime.isAfter(endDataTime) : " + flag);
     }
    
}
