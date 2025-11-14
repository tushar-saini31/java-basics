public class Arthmetic_operation {
    public static void main(String a[])
    {
        int num1=23;
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        num1+=2;
        System.out.println(num1);

        num1*=2;
        System.out.println(num1);

        int num2=1;
        int result=++num2; //preIncrement
        System.out.println(result);
        
        num2=1;
         result=num2++;  //postIncrement
        System.out.println(result);

        for(int i=1; i<5; i++)
        {
            System.out.print(i);
        }
        System.out.println(); 
         for(int i=1; i<5; ++i)
        {
            System.out.print(i);
        }

    }
}
