public class for_ech_loop {
    public static void main(String argc[])
    {
        int arr[]= new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i]=i;
        }

        for(int num: arr)
        {
            System.out.println(num); 
        }
    }
}
