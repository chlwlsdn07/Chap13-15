// equals 예제
public class chap14_02 {
    private String name;
    private String uniqueId;

    @Override // 굳이 안써도 되지만 재정의 강조와 오류 감지를 위해 사용
    public boolean equals(Object o){
        chap14_02 value = (chap14_02)o;
        if(value.name.equals(name) && value.uniqueId.equals(uniqueId)) {
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        chap14_02 myValue1 = new chap14_02();
        myValue1.name = "kim";
        myValue1.uniqueId = "123";

        chap14_02 myValue2 = new chap14_02();
        myValue2.name = "kim";
        myValue2.uniqueId = "123";

        if(myValue1.equals(myValue2)){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }
    }
}
