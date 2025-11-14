class demo{
   public  String getpen(int x)
   {
       if(x>=10)
       {
           return "pen";
       }
       else{
           return "nothing";
       }
   }
   public void musicplay()
   {
    System.out.println("playing the music");
   }
}
public class methods {
    public static void main(String argc[])
    {
        demo obj= new demo();
        String ans= obj.getpen(20);
        System.out.println(ans);

        obj.getpen(10);
    }
}
