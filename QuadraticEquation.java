import java.util.Scanner;

public class QuadraticEquation
{
    public static void main(String args[])
    {
        double a,b,c,d,l,r1,r2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=b*b-4*a*c;
        if(d>0)
        {
            l=Math.sqrt(d);
            System.out.println("Roots are real and distinct");
            r1=(((-b)+l)/(2*a));
            r2=(((-b)-l)/(2*a));
            System.out.println("r1= " +r1 +" r2= " +r2);
        }
        else if(d==0)
        {
            System.out.println("Roots are real and equal");
            r1=r2=((-b)/(2*a));
            System.out.println("r1= " +r1 +" r2= " +r2);
        }
        else
        {
            System.out.println("Roots are imaginary \n no real solutions");
        }
    }
}