public class if_else {
    public static void main(String argc[])
    {
        int num=23;
        if(num<34 && num>20)
        {
            System.out.println(num);
        }
        else{
            System.out.println("not correct");
        }

        int x=3;
        int y=5;
        if(x<y)
        {
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }


        int a=4;
        int b=6;
        int c=5;

        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>a && b>c)
        {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
