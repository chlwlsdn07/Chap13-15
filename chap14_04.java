import java.util.regex.Pattern;

// java.util.regax 이용한 전화번호 추출 예제
import java.util.regex.Matcher;
public class chap14_04 {
    public static void main(String[] args) {
        String REGEX = "[0-9//-]+";
        String INPUT = "hello, my number is 010-8983-5137, yours 010-3295-3137";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);

        while(m.find()) {
            System.out.println(INPUT.substring(m.start(), m.end()));
        }
    }

}
