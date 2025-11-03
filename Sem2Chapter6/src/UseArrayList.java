import java.util.*;

public class UseArrayList {

	public static void main(String[] args) {//array list can add ANYTHING but can't delete specific data
		ArrayList list = new ArrayList();

		list.add(1234);
		list.add(0.12);
		list.add(false);
		list.add("lol");
		list.add('f');
		list.add("title");

		System.out.println(list);

		for (int cnt=0; cnt<list.size();cnt++) {
			System.out.printf("%d: ", cnt);
			System.out.println(list.get(cnt));
		}
		System.out.println();
		
		for(Object obj:list)
			System.out.println(obj);
		Object obj = null;
		if (obj  instanceof Integer)
			System.out.println(" Integer type");
		else if (obj instanceof Double)
			System.out.println(" Double Type");
		else if(obj instanceof Character)
			System.out.println(" Character Type");
		else if (obj instanceof String)
			System.out.println(" String type");
		else if (obj instanceof Book)
			System.out.println(" Book type");
		else if (obj instanceof Boolean)
			System.out.println(" Boolean type");

		ArrayList <String> list2 = new ArrayList <String>();
		//can only add based on type listed
		list2.add("lol2");
		list2.add("today");
		System.out.println(list2);
		System.out.println("size: "+list2.size());
	}

	class Book{
		String title;
		int year;
		public Book(String title, int year) {
			this.title = title;
			this.year = year;

		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", year=" + year + "]";
		}


	}
}
