class Cylinder extends Circlee
{
	private double height;
	double volume;
	Cylinder()
	{
	super();
	height=1.0;
	}
	Cylinder(double r,String s,double h) {
	super(r,s);
	height=h;
	}
	public void setradius(double a,double c)
   {
   super.setradius(a);
   height=c;
   }
   public void setstring(String b,double c)
   {
   super.setstring(b);
   height=c;
    }

    public double getheight()
    {
    return height;
    }
    public double volume()
    {
    volume=3.14*getradius()*getradius()*height;
    return volume;
    }
    public void print()
    {
    System.out.print("volume is :" +volume);
    
    }
}