import java.io.FileReader;
import java.io.IOException;

import javax.management.RuntimeErrorException;

// finally문 에제
public class chap13_04 {
    public static void main(String[] args) {
        FileReader fReader = null;
        try{
            fReader = new FileReader("a");
            fReader.read();
        }catch(IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{fReader.close(); }catch(Exception e) {};
        }
    }
}
