// 제네릭 기본 예제
public class chap15_01 {
    static class MyHolder<T>{
        T item;
        void set(T obj){
            item = obj;
        }
        T get(){
            return item;
        }
    }
    static MyHolder<Integer> myHolder = new MyHolder<Integer>();

    static void produce(){
        myHolder.set(6);
        //myHolder.set("6")   오류
    }
    static void consume() {
        System.out.println(myHolder.get()/2);
    }
    public static void main(String[] args) {
        produce();
        consume();
    }
}
