public class logical_operator{
    public static void main(String argc[])
    {
          int x=3;
          int y=5;
          int a=6;
          int b=4;

          boolean result= a>b && x<y;
          System.out.println(result);

        result= a<b && x<y;
        System.out.println(result);

        result= a>b || x<y;
        System.out.println(result);

        result= a>b & x<y;
        System.out.println(result);

        result= a>b && x<y;
        System.out.println(!result);
    }
}
