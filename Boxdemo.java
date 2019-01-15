import java.util.*;
class Box
{
	double width,w;
	double height,h;
	double depth,d;
	void setdim()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return w*h*d;
	}
}

class Boxdemo
{
	public static void main(String args[]) 
	{
	Scanner s1 =new Scanner(System.in);
	System.out.println("enter the value for box1");
	double vol;
	Box b1 = new Box();
	Box b2 = new Box();
	b1.width=s1.nextInt();
	b1.height=s1.nextInt();
	b1.depth=s1.nextInt();
	vol=b1.volume();
	System.out.print(vol);
	}

}