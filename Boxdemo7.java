class Box {
	double width;
	double height;
	double depth;
	Box()
	{
		System.out.println("constructor overloading");
	width =-1;
	height =-1;
	depth =-1;
	}
	Box(double w,double h,double d) {
	width =w;
	height =h;
	depth =d;
	}

	Box(double len) {
	 width=height=depth=len;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class Boxdemo7 {
public static void main(String args[]) 
{
	Box mybox1 = new Box();
	Box mybox2 = new Box(4,3,5);
	double vol;
	vol =mybox1.volume();
	System.out.println("volume is" +vol);
	vol =mybox2.volume();
	System.out.println("volume is" +vol);
	Box mycube = new Box(7);
	vol = mycube.volume();
	System.out.println("volume of my cube is: " +vol);
   }
}