package controller;

public class Validation {
	public static boolean isValidName (String name) {
		int len = name.length();
		char ch=' ';
		for (int cnt=0; cnt<len; cnt++) {
			ch = name.charAt(cnt);
			if (Character.isLetter(ch) || Character.isWhitespace(ch))
				;
			else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isValidAge(int age) {
		if (age>=15 && age<=50)
			return true;
		else
			return false;
	}
	
	public static boolean isValidGender (String gender) {
		switch (gender) {
		case "Male", "Female": return true;
		} 
		return false;
	}
}