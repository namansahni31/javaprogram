class Box {
	double width;
	double height;
	double depth;
	Box()
	{
	width =12;
	height =3;
	depth =5;
	}
	
	Box(double w,double h,double d) {
	width =w;
	height =h;
	depth =d;
	}

	double volume () {
	return width*height*depth;
	}
}
class Boxdemo1 {
public static void main(String args[]) 
{
	Box mybox1 = new Box();
	Box mybox2 = new Box(4,3,5);
	double vol;
	vol =mybox1.volume();
	System.out.println("volume is" +vol);
	vol =mybox2.volume();
	System.out.println("volume is" +vol);
   }
}