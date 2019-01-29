public class Rectangle
{
	private double length;
	private double width;
	double area,perimeter;
	public Rectangle() {
		
	length=10;
	width=10;
	}

	public Rectangle(double l,double w) {
	length = l;
	width = w;
    }

    public void setDimension(double a,double b)
    {
    length=a;
    width=b;
    }

    public double getlength()
    {
    return length;
    }
    public double getwidth()
    {
    return width;
    }
    public double area()
    {
    area= length*width;
    return area;
    }
    public double perimeter()
    {
    perimeter=2*(length+width);
    return perimeter;
    }
    public void print()
    {
    System.out.print("the area is :"+area);
    System.out.print("the perimeter is:"+perimeter);
    }
}