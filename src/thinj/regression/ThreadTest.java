package thinj.regression;

public class ThreadTest {
	private static boolean aDone = false;

	public static void main(String[] args) {
		test1();
	}

	private static int aCount1 = 0;
	private static int aCount2 = 0;

	private static long aWhen1, aWhen2;

	private static void test1() {

		final int ONE_SEC = 1000000000;
		final int ONE_TENTH = ONE_SEC / 10;
		final int ONE_MILLI = ONE_SEC / 1000;
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				aWhen1 = System.nanoTime() + ONE_SEC;
				while (true) {
					if (aWhen1 < System.nanoTime()) {
						System.out
								.println("Hello world from t1: " + Thread.currentThread().getId());
						aCount1++;
						aWhen1 += ONE_SEC;
					}
				}
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				aWhen2 = System.nanoTime() + ONE_TENTH;
				while (aCount2 < 20) {
					if (aWhen2 < System.nanoTime()) {
						System.out
								.println("Hello world from t2: " + Thread.currentThread().getId());
						aCount2++;
						aWhen2 += ONE_TENTH;
					}
				}
			}
		});
		t2.start();

		while (true) {
			System.out.println((System.nanoTime() / ONE_MILLI) + ": Main thread: " + Thread.currentThread().getId() + "/" + aCount1
					+ ", " + aCount2);
		}
	}

	// private static void test2() {
	// aDone = false;
	// Thread t1 = new Thread(new Runnable() {
	// @Override
	// public void run() {
	// while (true) {
	// System.out.println("Hello world from t1: " + Thread.currentThread().getId());
	// aDone = true;
	// Thread.yield();
	// }
	// }
	// });
	// t1.start();
	//
	// while (!aDone) {
	// System.out.println("Main thread: " + Thread.currentThread().getId());
	// Thread.yield();
	// }
	// System.out.println("done = " + aDone);
	// }
}
