
public class LetterAndSpaceOnly {
	public static void main(String[] args) {
		char ch = ' ';
		String name = "joe";
		int len = name.length();
		for(int cnt=0; cnt<len; cnt++) {
			ch = name.charAt(cnt);
			if (Character.isLetter(ch)||Character.isWhitespace(ch)) {
				System.out.println("only letter/space");	
			}
			else
				System.out.println("has other");
		}
	}

}
