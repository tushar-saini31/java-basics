public class question {
    public static void main(String argc[])
    {
        

        int arr[]= new int[4];
        arr[0]=5;
        arr[1]=7;
        arr[2]=8;
        arr[3]=10;

        int cnt=0;
        int rem=0;
        for(int i=0; i<4; i++)
        {
            arr[i]+=rem;
           if(arr[i]>4)
           {
                cnt+=arr[i]/4;
                rem= arr[i]%4;
           }
           else{
               rem=arr[i];
           }
        }
    System.out.println(cnt);

    }
}
