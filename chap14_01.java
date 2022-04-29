// toString 예제
public class chap14_01 {
    private String name;
    private String uniqueId;

    @Override
    public String toString(){
        return "MyValue [name=" +name +", uniqueId=" +uniqueId +"]";
    }

    public static void main(String[] args) {
        chap14_01 myValue = new chap14_01();
        myValue.name ="kim";
        myValue.uniqueId = "123";

        System.out.println(myValue.toString());
    }
    
    
}
