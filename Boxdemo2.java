class Box {
	double width,w;
	double height,h;
	double depth,d;
	Box(double width,double h,double d) {
	this.width=width;
	this.height=h;
	this.depth=d;
	}
	double volume () {
	return width*height*depth;
	}
}
class Boxdemo2 
{
	public static void main(String args[])
	{ double vol;
	Box box3 = new Box(13,4,5);
	vol=box3.volume();
	System.out.println(vol);
    }
}