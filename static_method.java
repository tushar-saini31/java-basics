class data{
    String name;
    int roll_no;
    static int mobile;
 
    // we can't access the non statci variable in the static method
    public static void show( data obj)
    {
        System.out.println(obj.mobile+" "+obj.roll_no);
    }
}

public class static_method {
    public static void main(String argc[])
    {
         data obj = new data();

         obj.name = "vikas";
         obj.roll_no=234;
         obj.mobile=3242;

         // we can access the static method with the help of class name
        System.out.println(data.mobile);
        // System.out.println(data.obj.roll_no)
    
        data.show(obj);


    }
}
