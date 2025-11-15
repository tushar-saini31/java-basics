class demo{
    private int rollno;
    private String name;

    public void setter(int no)
    {
        rollno=no;
    }
    public void setter(String na)
    {
        name=na;
    }
    public void getter()
    {
        System.out.println(rollno+" "+name);
    }
}
public class getter_setter {
    public static void main(String argc[])
    {
        demo obj= new demo();
        obj.setter(32);
        obj.setter("rahul");

        obj.getter();
    }
}
