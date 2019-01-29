class Box extends Rectangle
{
	private double height;
	double area,perimeter;
	Box()
	{
	super();
	height=10;
	}
	Box(double l,double w,double h) {
	super(l,w);
	height=h;
	}
	public void setDimension(double a,double b,double c)
   {
   super.setDimension(a,b);
   height=c;
   }
    public double getheight()
    {
    return height;
    }
    public double area()
    {
    area=height*getwidth()*getlength();
    return area;
    }
    public double perimeter()
    {
    perimeter=height*getwidth()*getlength();
    return perimeter;
    }
    public void print()
    {
    System.out.print("area is :" +area);
    System.out.print("perimeter is :" +perimeter);
    }
}