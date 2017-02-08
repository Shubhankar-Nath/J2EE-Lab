import java.util.Scanner;
public class Lab1_Convert
 {
public static void main (String[] args)
{
    float d1,d2;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter distance in feet:");
    d1=sc.nextFloat();
    System.out.println("Enter distance in inches:");
    d2=sc.nextFloat();
    if(d2>=12.0)
    {
        d1=d1+(d2/12);
        d2=d2%12;
       System.out.println("Total distance is"+d1+"feet and"+d2+"inches");
    }
    else
        System.out.println("Total distance is"+d1+"feet and"+d2+"inches");
}
}
