import java.text.SimpleDateFormat;
import java.util.Date;//initially not included

public class dateortime {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mma dd/MM/yyyy");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");

		String currentDateTime = dateFormat.format(date);
		System.out.println(currentDateTime);

		String currentDate = dateFormat2.format(date);
		System.out.println(currentDate);
	}

}
