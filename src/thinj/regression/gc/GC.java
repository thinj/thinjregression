package thinj.regression.gc;


public class GC {
	public static void main() {
		for (int i = 0; i < 10000; i++)
		{
			Object oo1 = new Object();
		}
		System.out.println(4711);
	}
}
