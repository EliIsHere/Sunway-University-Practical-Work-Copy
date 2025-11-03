package controller;

public class Practical2Validation {
	public static boolean isValidQ (String question) {
		int len = question.length();
		if (len==0)
			return false;
		else {
			return true;
		}
	}

	public static boolean isValidAns (String answer) {
		try {
			Double.valueOf(answer);
		} catch (NumberFormatException ex){ // Not a valid double value.
			return false;
		}
		return true;
	}

	public static boolean isValidQNum(int questionNo) {
		try {
			Integer.valueOf(questionNo);
		} catch (NumberFormatException ex){ // Not a valid double value.
			return false;
		}
		return true;
	}
}