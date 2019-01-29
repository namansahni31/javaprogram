interface geometricobject
{
	double getarea();
   double getperimeter();
   
}

class Circle implements geometricobject
{
public double radius=1.0;
double area;
double perimeter;
public Circle(double radius)
{
	this.radius=radius;
}
public double getarea(){
	area=3.14*radius*radius;
	return area;
}
public double getperimeter()
{
	perimeter=2*3.14*radius;
	return perimeter;
}
}

interface resizable
{
public double resize(int percent);
}

class ResizableCircle extends Circle implements resizable
{
	ResizableCircle(double a)
	{
	super(a);
	}
	public double resize(int percent)
	{

	radius=(radius*percent)/100;
	return radius;
	}
} 
class Test2
{
	public static void main(String args[])
	{
	 ResizableCircle t = new ResizableCircle(5); 
	 double p = t.getperimeter();
	 double a = t.getarea();
	 t.resize(6);
	 System.out.println(a);
	 System.out.println(p);
	 	}
}