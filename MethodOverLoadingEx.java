public class MethodOverLoadingEx 
{
 void Display(int a,int b)
 {
    System.out.println(a+b);
 }
 void Display(int a,int b,int c)
 {
    System.out.println(a-b-c);
 }   
 void Display(String s1,String s2)
 {
    System.out.println(s1+s2);
 }
 public static void main(String[] args) 
 {
    MethodOverLoadingEx m=new MethodOverLoadingEx();
    m.Display("Hello", "World");
    m.Display(30, 40);
    m.Display(30, 20, 10);  
 }
}
