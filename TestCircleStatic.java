class CircleStatic {
 private double radius;
 private static int numberofobjects;
 public void setradius(double a)
 {
 radius=a;
 numberofobjects++;
 }	
public double getradius()
{
	return radius;
}
public static int getnumberofobjects()
{
	return numberofobjects;
}
public void findarea()
{
	double area;
	area=3.14*radius*radius;
	System.out.print("The area is " +area);
  }
}
public class TestCircleStatic
{
	public static void main(String args[])
	{
	CircleStatic circle1 = new CircleStatic();
	System.out.print("Circle1 information");
	circle1.setradius(5);
	System.out.print("circle1 radius :" +circle1.getradius());
	System.out.println("the number of circle objects" +CircleStatic.getnumberofobjects());
	CircleStatic circle2 = new CircleStatic();
	circle1.findarea();
	circle2.setradius(5);
	System.out.println("the number of objects" +CircleStatic.getnumberofobjects());
	circle2.findarea();
	}
}-
