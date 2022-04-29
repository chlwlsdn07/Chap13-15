// 제네릭 메소드 예제
public class chap15_02 {
    static class MyHoledr<T>{
        T item;

        void set(T obj){
            item = obj;
        }
        T get() {
            return item;
        }
        static class Util {
            static public <T> MyHoledr<T> boxing(T item){
                MyHoledr<T> myHoledr = new MyHoledr<T>();
                myHoledr.set(item);
                return myHoledr;

            }

        }
        public static void main(String[] args) {
            MyHoledr<Integer> myHoledr = Util.boxing(Integer.valueOf(1));
        }

    }
}
