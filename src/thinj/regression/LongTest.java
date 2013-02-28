package thinj.regression;

public class LongTest {
	private static long cLong = 123456;

	public static void main() {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		heapTest();
		test10();
		test11();
		test12();
		test13();
		test14();
	}

	private static void test12() {
		long l1;
		l1 = 1234567890;
		Regression.verify(l1 / 10L == 123456789);
		Regression.verify(l1 / 100L == 12345678);

		l1 = 12345678901L;
		Regression.verify(l1 / 10L == 1234567890L);
		Regression.verify(l1 / 100L == 123456789L);

		
		l1 = 1234567890123456789L;
		Regression.verify(l1 / 10L == 123456789012345678L);
		Regression.verify(l1 / 100L == 12345678901234567L);
		Regression.verify(l1 / 1000L == 1234567890123456L);
		Regression.verify(l1 / 10000L == 123456789012345L);
		Regression.verify(l1 / 100000L == 12345678901234L);
		Regression.verify(l1 / 1000000L == 1234567890123L);
		Regression.verify(l1 / 10000000L == 123456789012L);
		Regression.verify(l1 / 100000000L == 12345678901L);
		Regression.verify(l1 / 1000000000L == 1234567890L);
		Regression.verify(l1 / 10000000000L == 123456789L);
		Regression.verify(l1 / 100000000000L == 12345678L);
		Regression.verify(l1 / 1000000000000L == 1234567L);
		Regression.verify(l1 / 10000000000000L == 123456L);
		Regression.verify(l1 / 100000000000000L == 12345L);
		Regression.verify(l1 / 1000000000000000L == 1234L);
		Regression.verify(l1 / 10000000000000000L == 123L);
		Regression.verify(l1 / 100000000000000000L == 12L);
		Regression.verify(l1 / 1000000000000000000L == 1L);
	}
	
	private static void test13() {
		long l1;
		l1 = -1234567890;
		Regression.verify(l1 / 10L == -123456789);
		Regression.verify(l1 / 100L == -12345678);

		l1 = -12345678901L;
		Regression.verify(l1 / 10L == -1234567890L);
		Regression.verify(l1 / 100L == -123456789L);

		
		l1 = -1234567890123456789L;
		Regression.verify(l1 / 10L == -123456789012345678L);
		Regression.verify(l1 / 100L == -12345678901234567L);
		Regression.verify(l1 / 1000L == -1234567890123456L);
		Regression.verify(l1 / 10000L == -123456789012345L);
		Regression.verify(l1 / 100000L == -12345678901234L);
		Regression.verify(l1 / 1000000L == -1234567890123L);
		Regression.verify(l1 / 10000000L == -123456789012L);
		Regression.verify(l1 / 100000000L == -12345678901L);
		Regression.verify(l1 / 1000000000L == -1234567890L);
		Regression.verify(l1 / 10000000000L == -123456789L);
		Regression.verify(l1 / 100000000000L == -12345678L);
		Regression.verify(l1 / 1000000000000L == -1234567L);
		Regression.verify(l1 / 10000000000000L == -123456L);
		Regression.verify(l1 / 100000000000000L == -12345L);
		Regression.verify(l1 / 1000000000000000L == -1234L);
		Regression.verify(l1 / 10000000000000000L == -123L);
		Regression.verify(l1 / 100000000000000000L == -12L);
		Regression.verify(l1 / 1000000000000000000L == -1L);
	}

	private static void test10() {
		long l1 = 4711;
		long l2 = 10000;
		Regression.verify(l1 + l2 == 14711);
		Regression.verify(l1 - l2 == -5289);

		l1 = 12345678901234L;
		l2 = 98765432198765L;
		Regression.verify(l1 + l2 == 0x650E124EC65FL);
		Regression.verify(l1 - l2 == -0x4E992AB2667BL);

		l1 = 17L;
		l2 = 7L;
		Regression.verify(l1 * l2 == 119);
		Regression.verify(l1 / l2 == 2);
		Regression.verify(l1 % l2 == 3);

				
		l1 = 0xffffL;
		l2 = 0xaaaaL;
		Regression.verify((l1 & l2) == l2);
		Regression.verify((l1 | l2) == l1);
		Regression.verify((l1 ^ l2) == 0x5555L);
		Regression.verify(~l1 == 0xffffffffffff0000L);

		l1 = 12345678L;
		Regression.verify(-l1 == -12345678L);

		l1 = 0xffffL;
//		dump((int) l1);
//		dump((int) (l1 << 4));
//		dump((int) (l1 >> 4));
		Regression.verify(l1 << 4 == 0xffff0L);
		Regression.verify(l1 >> 4 == 0xfffL);

		l1 = 0xa000b000c000d000L;
		Regression.verify(l1 >>> 4 == 0x0a000b000c000d00L);
		Regression.verify(l1 >> 4 == 0xfa000b000c000d00L);

		l1 = 0xfedcba9876543210L;
		Regression.verify(l1 >>> 4 == 0x0fedcba987654321L);
		Regression.verify(l1 >> 4 == 0xffedcba987654321L);
		
		char ch = 56;
		l1 = ch;
		Regression.verify(l1 == 56L);

		int i = 317;
		l1 = i;
		Regression.verify(l1 == 317L);
	}
	
//	static void dump(int val) {
//		int mask = 0x80000000;
//		for (int i = 0; i < 32; i++) {
//			if ((val & mask) != 0) {
//				System.out.print("1");
//			} else {
//				System.out.print("0");
//			}
//			if ((i & 3) == 3) {
//				System.out.print(" ");				
//			}
//			mask = (mask >> 1) & 0x7fffffff;
//		}
//		System.out.println();				
//	}

	private static void test1() {
		// tests lstore_0/lload_0/lcmp
		long l = 4712;
		int i = 12345678;
		Regression.verify(l == 4712);
		Regression.verify(l < 4713);
		Regression.verify(l > 4711);

		l = 0x7100000000000000L;

		Regression.verify(l == 0x7100000000000000L);
		Regression.verify(l < 0x7200000000000000L);
		Regression.verify(l > 0x7000000000000000L);
	}

	private static void test2() {
		// tests lstore_1/lload_1
		int i1 = 12345678;
		long l = 4712;
		// int i2 = 12345678;
		Regression.verify(l == 4712);
		Regression.verify(l < 4713);
		Regression.verify(l > 4711);

		l = 0x7100000000000000L;

		Regression.verify(l == 0x7100000000000000L);
		Regression.verify(l < 0x7200000000000000L);
		Regression.verify(l > 0x7000000000000000L);
	}

	private static void test3() {
		// tests lstore_2/lload_2
		int i1 = 12345678;
		int i2 = 12345678;
		long l = 4712;

		Regression.verify(l == 4712);
		Regression.verify(l < 4713);
		Regression.verify(l > 4711);

		l = 0x7100000000000000L;

		Regression.verify(l == 0x7100000000000000L);
		Regression.verify(l < 0x7200000000000000L);
		Regression.verify(l > 0x7000000000000000L);
	}

	private static void test4() {
		// tests lstore_3/lload_3
		int i1 = 12345678;
		int i2 = 12345678;
		int i3 = 12345678;
		long l = 4712;

		Regression.verify(l == 4712);
		Regression.verify(l < 4713);
		Regression.verify(l > 4711);

		l = 0x7100000000000000L;

		Regression.verify(l == 0x7100000000000000L);
		Regression.verify(l < 0x7200000000000000L);
		Regression.verify(l > 0x7000000000000000L);
	}

	private static void test5() {
		// tests lstore/lload
		int i1 = 12345678;
		int i2 = 12345678;
		int i3 = 12345678;
		int i4 = 12345678;
		long l = 4712;

		Regression.verify(l == 4712);
		Regression.verify(l < 4713);
		Regression.verify(l > 4711);

		l = 0x7100000000000000L;

		Regression.verify(l == 0x7100000000000000L);
		Regression.verify(l < 0x7200000000000000L);
		Regression.verify(l > 0x7000000000000000L);
	}

	private static void test6() {
		// tests neighbors:
		int i1 = 0x55555555;
		long l = 4712;
		int i2 = 0xaaaaaaaa;

		Regression.verify(l == 4712);
		Regression.verify(i1 == 0x55555555);
		Regression.verify(i2 == 0xaaaaaaaa);
	}

	private static void test7() {
		long j = 0x7777777777777777L;
		test7_1(false, j, 3948);
//		System.out.println(j);
//		System.out.println(cLong);
	}

	private static void test7_1(boolean b, long j, int i) {
		Regression.verify(b == false);
		Regression.verify(j == 0x7777777777777777L);
		Regression.verify(i == 3948);

		j = 0xaaaaaaaaaaaaaaaaL;
		Regression.verify(b == false);
		Regression.verify(j == 0xaaaaaaaaaaaaaaaaL);
		Regression.verify(i == 3948);

		b = true;
		Regression.verify(b == true);
		Regression.verify(j == 0xaaaaaaaaaaaaaaaaL);
		Regression.verify(i == 3948);

		i = 0x55555555;
		Regression.verify(b == true);
		Regression.verify(j == 0xaaaaaaaaaaaaaaaaL);
		Regression.verify(i == 0x55555555);
	}

	private static void test8() {
		Regression.verify(test8_1() == 0xaaaaaaaaaaaaaaaaL);
	}

	private static long test8_1() {
		int x = 29384;
		long j = 0xaaaaaaaaaaaaaaaaL;
		boolean b = false;

		return j;
	}

	private static void test9() {
		MyClass mc = new MyClass();

		mc.aB = false;
		mc.aJ = 0x7777777777777777L;
		mc.aI = 3948;

		Regression.verify(mc.aB == false);
		Regression.verify(mc.aJ == 0x7777777777777777L);
		Regression.verify(mc.aI == 3948);

		mc.aB = true;
		mc.aJ = 3;
		mc.aI = 0x7fffffff;

		Regression.verify(mc.aB == true);
		Regression.verify(mc.aJ == 3);
		Regression.verify(mc.aI == 0x7fffffff);
	}

	/**
	 * Class for test of instance attributes of type long
	 */
	private static class MyClass {
		private int aI;
		private long aJ;
		private boolean aB;
	}

	// Very simple linked list:
	private static class LinkObject {
		private LinkObject aNext;
		private static long aGenerator = 0;
		private long aId;

		public LinkObject(LinkObject next) {
			aNext = next;
			// Set a long value:
			aId = aGenerator++;
		}

		public static void consumeHeap() {
			LinkObject l = null;

			while (true) {
				l = new LinkObject(l);
			}
		}
	}

	private static void heapTest() {
		boolean caught = false;
		try {
			LinkObject.consumeHeap();
		} catch (OutOfMemoryError e) {
			caught = true;
		}
		Regression.verify(caught);
	}

	private static void test11() {
		// Long array tests
		long[] la = new long[10];
		la[0] = 45;

		long j = la[0];

		Regression.verify(j == 45);

		boolean caught = false;
		try {
			la[10] = 56;
			System.out.println("hello wprod");
		} catch (ArrayIndexOutOfBoundsException e) {
			caught = true;
		}
		Regression.verify(caught);

		caught = false;
		la = null;
		try {
			la[10] = 56;
		} catch (NullPointerException e) {
			caught = true;
		}
		Regression.verify(caught);

		caught = false;
		try {
			j = la[10];
		} catch (NullPointerException e) {
			caught = true;
		}
		Regression.verify(caught);
	}
	
	private static long aIdGenerator = 0;

	private static void test14() {
		long l = 0;
		l = aIdGenerator++;
		Regression.verify(l == 0);
		Regression.verify(aIdGenerator == 1);
		
		l = aIdGenerator++;
		Regression.verify(l == 1);
		Regression.verify(aIdGenerator == 2);
		
		aIdGenerator = 1L << 32;
		Regression.verify(aIdGenerator == 0x100000000L);

		l = aIdGenerator++;
		Regression.verify(l == 0x100000000L);
		Regression.verify(aIdGenerator == 0x100000001L);

		l = aIdGenerator++;
		Regression.verify(l == 0x100000001L);
		Regression.verify(aIdGenerator == 0x100000002L);
}

	private static void _test11() {
		// Long array tests
		long[] la = new long[10];

		boolean caught = false;
		try {
			la[10] = 56;
			System.out.println("hello wprod");
		} catch (ArrayIndexOutOfBoundsException e) {
			caught = true;
		}
		Regression.verify(caught);
	}
}
