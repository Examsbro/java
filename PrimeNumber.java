import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        n=s.nextInt();
        System.out.println("The number is: "+n);
        for(int i=2;i<=n;i++)
        {
            int p=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    p++;
                }
            }
            if(p==0)
                System.out.println("Prime nos are:"+i);
        }
    }
    
}
