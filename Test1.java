interface one 
{
	void print1();
	void print2();
}

interface two extends one
{
	void print3();
}

class Test implements two
{
	public void print1()
	{
	System.out.println("one");
	}
	public void print2()
	{
	System.out.println("two");
	}
    public void print3()
	{
	System.out.println("three");
	}
}

class Test1
{
	public static void main(String args[])
	{
	Test t = new Test();
	t.print1();
	t.print2();
	t.print3();
	}
}