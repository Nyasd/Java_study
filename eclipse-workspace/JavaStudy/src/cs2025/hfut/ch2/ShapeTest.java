package cs2025.hfut.ch2;

public class ShapeTest {
	public static void main(String[] args) {
		//构造Shape[],生成5个随机数，根据随机数不同new不同对象
		Shape[] shapeArr = getShapeArr(5);
		//打印shape数组面积
		printArr(shapeArr);
	}

	private static void printArr(Shape[] shapeArr) {
		for(int i=0;i<shapeArr.length;i++) {
			System.out.println(shapeArr[i].area());
		}
	}

	private static Shape[] getShapeArr(int n) {
		Shape[] arr = new Shape[n];
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 4);
			switch (random) {
				case 0:
					arr[i] = new Shape();
					break;
				case 1:
					arr[i] = new Circle(5);
					break;
				case 2:
					arr[i] = new Rectangle(5,3);
					break;
				case 3:
					arr[i] = new Triangle(5,3);
					break;
			}
		}
		return null;
	}
}

class Shape {
	double area() {
		return 0;
	}
}

class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	double w, h;

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return w * h;
	}
}

class Triangle extends Shape {
	double w, h;

	public Triangle(double w,double h) {
		this.w=w;
		this.h=h;
	}

	@Override
	double area() {
		return w * h/2;
	}
}