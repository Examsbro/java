abstract class Shape
{
    int a=2;
    int b=3;
    abstract void printArea();
}    
class Rectangle extends Shape
{
    void printArea()
    {
        int c;
        c=a*b;
        System.out.println("Area of Rectangle: "+c);
    }
}
class Triangle extends Shape
{
    void printArea()
    {
        int c;
        c=(a*b)/2;
        System.out.println("Area of Triangle: "+c);
    }
}
class Circle extends Shape
{
    void printArea()
    {
        int c;
        c=(int)((3.14)*(a*a));
        System.out.println("Area of Circle: "+c);
    }
}
public class AbstractClassEx 
{
    public static void main(String[] args) {
        Shape r=new Rectangle();
        Shape t=new Triangle();
        Shape c=new Circle();
        r.printArea();
        t.printArea();
        c.printArea();
    }
    
}
