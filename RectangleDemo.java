class Shape
{
	public void display()
	{
	System.out.println("This is shape");
	}
} 
class Rectangle extends Shape
{
	public void display()
	{
	System.out.println("This is rectangle");
    }
    public void IncreaseLength()
    {
    System.out.println("this is length");
    }
}
class RectangleDemo
{
	public static void main(String args[])
	{
	Shape s;
	s=new Rectangle();
	s.display();
	//s.IncreaseLength();
	Rectangle c =(Rectangle) s;
	c. IncreaseLength();
	}
}
