class data{
    static String name;
    int mobile_no;
    int model;
    
    public  void show()
    {
        System.out.println(name+" "+ mobile_no + " " + model);
    }
}

public class static_variable {
    public static void main(String argc[])
    {
          data obj1 = new data();
           
          obj1.name="vikas";
          obj1.mobile_no=2324;
          obj1.model=34;

          data obj2= new data();

          obj2.name="sahil";
          obj2.mobile_no=12423;
          obj2.model=32;

          obj1.show();
          obj2.show();

        }
}
