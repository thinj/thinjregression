package thinj.regression;

public class SystemTimeTest {
	public static void main(String[] args) {
		long now = System.nanoTime(); // 1000000000;
		for (int i = 0; i < 100; i++) {
			String s = "" + (-1234567890 + i);
		}
		System.out.println("Passed: " + (System.nanoTime() - now));
		// while (true) {
		// long now = System.nanoTime(); // 1000000000;
		// System.out.println("nano now: " + now);
		// // while (now == System.nanoTime() / 1000000000) {
		// // }
		// }
	}
}
