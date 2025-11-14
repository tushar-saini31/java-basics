class Student{
    String student_name;
    int age ;
    int roll_no;
}
public class objects{
    public static void main(String argc[])
    {
        Student s1= new Student();
        s1.student_name="sahil";
        s1.age=12;
        s1.roll_no=345;
        
        Student s2 =new Student();
        s2.student_name="vikas";
        s2.age=20;
        s2.roll_no=234;

        Student s3= new Student();
        s3.student_name="gurav";
        s3.age=23;
        s3.roll_no=4543;

        Student students[]= new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0; i<3; i++)
        {
            System.out.println(students[i].student_name+"  "+ students[i].roll_no);
        }

    }
}