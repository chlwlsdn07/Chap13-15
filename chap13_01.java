import java.util.Scanner;

// 0을 넣었을 때 예외처리가 되는 코드
public class chap13_01{
    public static void main(String[] args) {
        int intNum;
        Scanner scanner = new Scanner(System.in);
        intNum = scanner.nextInt();
        int result = 1000/intNum;
        System.out.println("Result :"+result);
        scanner.close();
    }


}