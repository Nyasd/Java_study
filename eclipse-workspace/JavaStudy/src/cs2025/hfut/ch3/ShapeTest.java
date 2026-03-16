package cs2025.hfut.ch3;

public class ShapeTest {
	public static void main(String[] args) {
		
	}
}

abstract class Shape{
	public abstract double area();
	//非抽象类必须重写所有抽象方法
//	public abstract int test();
}
abstract class Pole{
	int poleHeight=10;
	public abstract double area();
	public double volumn() {
		return this.area()*poleHeight;
	}
}

class CirclePole extends Pole {
	double r;

	public CirclePole(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return Math.PI * r * r;
	}
}

class RectanglePole extends Pole {
	double w, h;

	public RectanglePole(double w, double h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public double area() {
		return w * h;
	}
}