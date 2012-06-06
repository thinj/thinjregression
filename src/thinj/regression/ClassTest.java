package thinj.regression;

public class ClassTest {

	public static void main() {
		test1();

		System.out.println(new ClassTest().toString());
		System.out.println("" + 5);
		System.out.println("hej spade " + new Object().toString());
		Class<?> cl = new Object().getClass();
		System.out.println(cl.toString());
		Regression.verify(cl.toString().equals("#0"));
		
		System.out.println("Equals: " + "spade".equals("spade"));
	}

	private static void test1() {
		Class<?> x = String.class;
		System.out.println("dims: " + x.getName());
		Object[] oa = new Object[4];
		System.out.println(oa.getClass().getName());
	}
}
