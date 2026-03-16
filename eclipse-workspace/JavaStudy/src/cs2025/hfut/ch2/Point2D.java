package cs2025.hfut.ch2;

public class Point2D {
	int x,y;
//	public void Point2D() {
//	}
	public Point2D() {
	}
	public Point2D(int x) {
		this.x = x;
	}
	public Point2D(int x,int y) {
		this(x);
		this.y = y;
	}
	//父类定义方法
	void draw() {
		System.out.println("Draw Point2D");
	}
}
class Point3D extends Point2D{
	int z;
	public Point3D(int x,int z) {
//		super(x,y);
		//super();
//		super.x = x;
//		super.y = y;
		this.z = z;
	}
	//子类重写父类方法
	//子类不能范围更严格/抛出更多异常*?
	@Override
	/*private*/ void draw() /*throws IOException*/ {
		System.out.println("Draw Point3D");
	}
}
