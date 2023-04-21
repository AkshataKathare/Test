package com.xworkz.mock.util;

public class ValidationUtil {

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validLong(long flo) {
		if (flo > 300) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (element) {
				return true;
			}
		}
		return false;

	}

}
