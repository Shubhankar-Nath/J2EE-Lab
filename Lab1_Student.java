import java.util.Scanner;

class Lab1_Student 
{
    int id;
    String name;
    int marks[]=new int[5];

    void showDetails(int id ,String name , int marks[]) 
    {
        System.out.println("Name is :" + this.name +" and id is :"+ this.id);
        System.out.println("\n MARKS OF SUBJECTS ARE ");
        for(int i=1;i<=3;i++)
        {
            System.out.println("\t Marks in subject "+ i +" is: " + this.marks[i] );
        }
    }
    void result(int marks[])
    {
        int pass=0,fail=0;
        for(int i=1;i<=3;i++)
        {
            if(marks[i]>=50)
                pass++;
            else
                fail++;
        }       
        System.out.println("\n pass in " +pass + "subjects");
        System.out.println("\n fail in " +fail + "subjects");
    }
    void getDetails()
    {
        int choice;
        System.out.println("")
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter id:");
        id = sc .nextInt();
        System.out.println("Enter name:");
        name =sc.next();
        System.out.println("Enter the marks of the students:");
        //this.marks[] =new int[5];
        for (int i=1;i<=3;i++)
        {
            marks[i]=sc.nextInt();
        }
        showDetails(id,name,marks);
        result(marks);
    }
    public static void main(String[] args)
    {
        Lab1_Student ls=new Lab1_Student();
        ls.getDetails();
    }
}