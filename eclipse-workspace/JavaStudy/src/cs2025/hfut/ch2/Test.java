package cs2025.hfut.ch2;

public class Test {
	public static void main(String[] args) {
		//正常创建的3D
		Point3D p1=new Point3D(0,0);
		//显式上溯造型
		Point2D p2=new Point3D(0,0);
		//隐式方法参数传递格式的上溯造型
		test(p1);
		test(p2);
	}
	
	static void test(Point2D p) {
		p.draw();
	}
}
