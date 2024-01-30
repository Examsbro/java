class InvaildAgeException extends Exception
{
    InvaildAgeException(String s)
    {
        super(s);
    }
}
public class TestCustomException1 
{
    static void vaildate(int age) throws InvaildAgeException
    {
        if(age<18)
            throw new InvaildAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args) {
        try 
        {
            vaildate(13);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception occured "+e);            
        }
        System.out.println("Custom exception Demo... completed");
    }
    
}
