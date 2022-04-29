// try catch 문으로 예외 처리하기(Checked 예외 처리방안)
import java.io.FileNotFoundException;
import java.io.FileReader;
public class chap13_02 {
    public static void main(String[] args) {
        
        try{
            FileReader file = new FileReader("a");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
