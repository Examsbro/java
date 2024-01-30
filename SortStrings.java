import java.util.Scanner;
public class SortStrings 
{
    public static void main(String[] args) 
    {
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        String names[]=new String[n];
        System.out.println("Enter names: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name["+(i+1)+"]: ");
            names[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1+i;j<n;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("\n Sorted names are in Ascending order: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }    
}
