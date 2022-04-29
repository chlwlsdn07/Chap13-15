// 와이들카드 예제
import java.util.List;
public class chap15_03 {
    static class MyHolder<T>{
        T item;

        void set(T obj){
        item = obj;
    }
    T get(){
        return item;
    }
    void setlist(List<?> list){}
}
void method(MyHolder<?> param){
    param.get();
    Object o = param.get();
}

MyHolder<?> field;

public static void main(String[] args) {
    MyHolder<?> myHolder = new MyHolder<String>();
}
}
