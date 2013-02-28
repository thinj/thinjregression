package thinj.regression.gc;

import thinj.regression.Regression;

public class GC {
	public static void test1() {
		for (int i = 0; i < 1000; i++) {
			Object oo1 = new Object();
		}
		System.out.println(4711);
	}

	// Very simple linked list:
	private static class LinkObject {
		private LinkObject aNext;
		private int[] aPayload;

		public LinkObject(int size) {
			aPayload = new int[size];
			// Re-run test without setting anext = null => crash !!!
			aNext = null;
		}
	}

	public static void circularObjects() {
		LinkObject list = null;
		while (true) {
			LinkObject element = new LinkObject(100);

			if (list == null) {
				element.aNext = element;
				list = element;
			} else {
				element.aNext = list.aNext;
				list.aNext = element;
			}
		}
	}

	public static void main() {
		String s = "this is a test";
		System.out.println("s getClass: " + s.getClass());
		String[] sa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		boolean caught = false;
		try {
			circularObjects();
		} catch (OutOfMemoryError e) {
			caught = true;
		}
		Regression.verify(caught);

		
		
		
		Regression.verify((s + sa[0] + sa[1] + sa[2] + sa[3] + sa[4] + sa[5] + sa[6] + sa[7]
				+ sa[8] + sa[9]).equals(s + "0123456789"));
		
//		
//		
//		test1();
//		Regression.verify((s + sa[0] + sa[1] + sa[2] + sa[3] + sa[4] + sa[5] + sa[6] + sa[7]
//				+ sa[8] + sa[9]).equals(s + "0123456789"));
	}
}
