import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        for(int i=0;i<t;i++)
        {
            int len = input.nextInt();
            Students newx[] = new Students[len];
            for(int j=0;j<len;j++)
            {
                String roll;
                String name;
                roll=input.next();
                name= input.next();
                 Students base = new Students();
                 base.RollNo=roll;
                 base.Name=name;
                //  base.Save(roll,name);
                 newx[j]=base;
            }
            for(int j=0;j<len;j++)
            {
                
                // System.out.println(newx[j].RollNo);
                
                for(int k=j+1;k<len;k++)
                {
                    String a1=newx[j].RollNo;
                    String a2=newx[k].RollNo;
                    if(a2.compareTo(a1)<0)
                    {
                        Students lol;
                        lol=newx[j];
                        newx[j]=newx[k];
                        newx[k]=lol;
                    }
                }
                
            }
            for(int j=0;j<len;j++)
            {
                String finalx;
                finalx=newx[j].RollNo+" "+newx[j].Name;
                System.out.println(finalx);
            }
        }
    } 
}
    class Students
{
    String Name;
    String RollNo;
    
}
