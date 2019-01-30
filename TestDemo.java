class Test
{
	public void display()
	{
	System.out.println("Test Executed");
	}
}
public class TestDemo{
	public static void main(String args[]){
	Test t = null;
	try
	{
	t.display();
	}
	catch(Exception e){
	System.out.println(e);

	}

	}
}