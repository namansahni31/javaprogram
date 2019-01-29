abstract class Shape1 
{
	double shape1;
	double shape2;
	double area;
	Shape1(double a,double b)
	{
	shape1 = a;
	shape2 = b;
	}
	double area()
	{
	area=0;
	return 0;
	}
	abstract void display();
	{
	}
  }
class Rectangle extends Shape1 
{
 Rectangle(double a,double b)
 { 
 super(a,b); 
 }
 double area()
 {
 area = shape1*shape2;
 return area;
 } 
 void display()
 {
 	System.out.println(""+area);
 } 
}  
class Triangle extends Shape1
{
	Triangle(double a,double b)
	{
	super(a,b);
	}
	double area()
 {
 area = 0.5*shape1*shape2;
 return area;
 } 
 void display()
 {
 System.out.println(""+area);
 } 
}
class FindArea
{
	public static void main(String args[])
	{
	//Shape1 s = new Shape1(5,4);
	Rectangle r = new Rectangle(3,5);
	Triangle t = new Triangle(6,7);
	Shape1 sh;
	sh=r;
	sh.area();
	sh.display();
	sh=t;
	sh.area();
	sh.display();

	}
}