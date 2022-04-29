// clone 예제
public class chap14_03 {
    private String name;
    private String uniqueid;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return o;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        chap14_03 myValue1 = new chap14_03();
        myValue1.name = "kim";
        myValue1.uniqueid = "123";

        chap14_03 myValue2 = (chap14_03)myValue1.clone();

        System.out.println(myValue1.name +" "+ myValue1.uniqueid);
        System.out.println(myValue2.name +" "+ myValue2.uniqueid);

    }
}
