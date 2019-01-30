public class ExceptionTest
{
	public static void main(String args[])
 {
	String s = null;
	try
    {
	if(s==null)
	{
	throw new Exception("s is a null string");
	}
	else 
	{
	System.out.println("the string is " +s);
	}
     }
   catch(Exception e)
    {
    System.out.println(e);
    }
    finally
    {
    System.out.println("the program is executed finally");
    }
  }
}