interface Printable
{
    public abstract void print();
}
interface Showable
{
    public abstract void show();
}
class Multiple_Inheritance implements Printable,Showable
{
    @Override
    public void print()
    {
        System.out.println("Welcome");
    }
    public void show()
    {
        System.out.println("Hello");
    }
} 
public class MultipleInheritanceEx 
{
    public static void main(String[] args) {
        Multiple_Inheritance m=new Multiple_Inheritance();
        m.print();
        m.show();
    }
    
}
