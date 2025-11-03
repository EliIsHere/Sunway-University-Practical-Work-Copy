import java.util.Calendar;

public class NewDateTimeOutput {
	public static void main(String[] args) {
		Calendar cc = Calendar.getInstance();
		
		int dd = cc.get(Calendar.DATE);
		int mm = cc.get(Calendar.MONTH)+1;
		int yy = cc.get(Calendar.YEAR);
		
		System.out.printf("%d/%d/%d/", dd,mm,yy);
		System.out.println();
		int hr=cc.get(Calendar.HOUR);
		int min = cc.get(Calendar.MINUTE);
		
		if(min<10)
			System.out.printf("%d:0%d", hr, min);
		else
			System.out.printf("%d:%d", hr, min);
		
		
	}

}
