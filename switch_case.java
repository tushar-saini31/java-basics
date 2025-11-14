 public class switch_case{
    public static void main(String argc[])
    {
        String day="sunday";
        String result="";
        switch(day)
        {
            case "saturday", "sunday"-> result="3.00";
            case "monday"-> result = "4.00am";
            case "tuesday" -> result ="6.00am";
        }

        System.out.println(result);

    }
 }