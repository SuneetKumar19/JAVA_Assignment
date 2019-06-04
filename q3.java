import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        for(int i=0;i<t;i++)
        {
            int ta = input.nextInt();
            int student=input.nextInt();
            int taps=input.nextInt();

            Students newst[] = new Students[student];
           Teaching_Assis  newta[] =  new Teaching_Assis[ta];

            for(int j=0;j<ta;j++)
            {
                String roll;
                String name;
                roll=input.next();
                name= input.next();
                Teaching_Assis  base = new Teaching_Assis();
                 base.RollNo=roll;
                 base.Name=name;
                //  base.Save(roll,name);
                 newta[j]=base;
            }
            
            for(int j=0;j<student;j++)
            {
                String roll;
                String name;
                roll=input.next();
                name= input.next();
                 Students base = new Students();
                 base.RollNo=roll;
                 base.Name=name;
                //  base.Save(roll,name);
                 newst[j]=base;
            }
            for(int j=0;j<student;j++)
            {  
                // System.out.println(newx[j].RollNo)
                for(int k=j+1;k<student;k++)
                {
                    String a1=newst[j].RollNo;
                    String a2=newst[k].RollNo;
                    if(a2.compareTo(a1)<0)
                    {
                        Students lol;
                        lol=newst[j];
                        newst[j]=newst[k];
                        newst[k]=lol;
                    }
                }
            }
            int count=0,count2=0;
            int flag=0;
            for(int y=0;y<student;y++)
            {
                 String sn,st;
                 if(count2>=ta)
                 {
                     break;
                 }
                 st = newta[count2].RollNo + " " + newta[count2].Name;
                 sn = newst[y].RollNo + " " + newst[y].Name;
                 count++;
                 System.out.println(sn+" "+st);
                 if(count%taps==0&&(count2!=ta-1))
                 {
                     count2++;
                 }



            }
             
        }
    }  
}
   class Students
{
    String Name;
    String RollNo;
    
}
   class Teaching_Assis
{
    String Name;
    String RollNo;
}
