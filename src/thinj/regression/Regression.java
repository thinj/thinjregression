package thinj.regression;

/**
 * This class is used for regression tests only.
 * 
 * @author hammer
 * 
 */
public class Regression {
//	public static native void verify(boolean b);
	public static void verify(boolean b) {
		if (!b) {
			new Exception("Regression failed").printStackTrace();			
		}
	}
}
