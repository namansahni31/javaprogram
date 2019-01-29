public class Circlee
{
	private String color;
	private double radius;
	double area;
	public Circlee() {
	radius=1.0;
    color="red";
	}

	public Circlee(double r,String s ) {
	radius=r;
	color=s;
    }

    public void setradius(double a) 
    {
        radius=a;
    }
    public void setstring(String b)
    {
        color=b;
    }

    public double getradius()
    {
    return radius;
    }
    public String getstring()   
    {
    return color;
    }
    public double area()
    {
    area= 3.14*radius*radius;
    return area;
    }
    public void print()
    {
    System.out.print("the area is :"+area);
    }
}