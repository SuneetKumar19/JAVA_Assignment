import java.util.Scanner;

class Basic
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            Students newx = new Students();
            newx.RollNo = input.next();
            newx.Name = input.next();
            newx.printer();
        }
    }
}
class Students
{
     String Name;
     String RollNo;
    void printer()
    {
    System.out.println(RollNo + " " + Name);
    }
}