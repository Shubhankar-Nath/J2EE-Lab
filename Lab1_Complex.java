import java.util.*;
class Lab1_Complex {
int real;
int img;
void getdata(int r, int i)
{
this.real=r;
this.img=i;
}
void add(int a, Comp s2){
this.real=a+s2.real;
this.img=s2.img;
}
void add(Comp s1, Comp s2)
{
this.real=s1.real+s2.real;
this.img=s1.img+s2.img;
}
public String toString()
{
return "Real: "+real+", Imaginary: "+img;
}
}
public class Complex
{
public static void main(String arg[])
{
System.out.println("R134214006");
Comp one=new Comp();
Comp two=new Comp();
Comp resu=new Comp();
Scanner sc= new Scanner(System.in);
System.out.println("Enter a real number");
int real=sc.nextInt();
System.out.println("Enter a complex number");
int a=sc.nextInt();int b=sc.nextInt();
one.getdata(a, b);
resu.add(real,one);
System.out.println(resu);
System.out.println("Enter one first complex number");
a=sc.nextInt();
b=sc.nextInt();
one.getdata(a, b);
System.out.println("Enter one second complex number");
a=sc.nextInt();
b=sc.nextInt();
two.getdata(a, b);
resu.add(one,two);
System.out.println(resu);
}
}