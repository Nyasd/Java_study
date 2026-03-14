package cs2025.hfut.ch2;

public class Point2D {
	int x,y;
	
	public Point2D(int x) {
		this.x = x;
	}
	public Point2D(int x,int y) {
		this(x);
		this.y = y;
	}
}
class Point3D extends Point2D{
	int z;
	public Point3D(int x,int y,int z) {
		super(x,y);
		//super();
		super.x = x;
		super.y = y;
		this.z = z;
	}
}
