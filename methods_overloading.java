class add{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
      return a+b+c;
    }
    public double add(double n1, double n2)
    {
        return n1+n2;
    }

}
public class methods_overloading{
    public static void main(String argc[])
    {
       add obj= new add();
       int ans=obj.add(2,3);
       System.out.println(ans);
    }
}