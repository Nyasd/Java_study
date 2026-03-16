package cs2025.hfut.ch3;

public interface MyInterface {
	public static final int num=100;//自动赋予变量前：public static final
	public abstract void go();
}

interface A{
	public abstract void go();
}

interface B extends A,Runnable{
	public abstract void run2();
}

class BImpl implements B{

	@Override
	public void go() {
		
	}

	@Override
	public void run() {
		
	}

	@Override
	public void run2() {
		
	}
	
}