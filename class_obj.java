class calculator{
    int add(int a, int b)
    {
        return a+b;
    }
}



public class class_obj{
    public static void main(String argc[])
    {
        int num1=4;
        int num2=5;
        calculator obj=  new calculator();
        int result= obj.add(num1, num2);
        System.out.println(result);
    }
}