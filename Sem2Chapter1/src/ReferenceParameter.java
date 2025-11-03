
public class ReferenceParameter {
	public static void main(String[] args) {
		Book3 bk = new Book3();
		bk.title = "my book";
		bk.price = 29.90;
		
		ReferenceParameters rp = new ReferenceParameters();
		System.out.println("line 9 title: " +bk.title);
		rp.sub(bk.title);
		System.out.println("line 11 title: " +bk.title);
		
		System.out.println("line 14 price: "+bk.price);
		rp.sub2(bk.price);
		rp.sub4(bk);
	}
}
class ReferenceParameters {
	void sub(String str) {
		System.out.println("str:" + str);
		str = "orange";
		System.out.println("str:" + str);
	}
	
	void sub2(double price) {
	System.out.println("price:" + price);
	price=10.99;
	System.out.println("price:" + price);
	}
	
	void sub3(Book3 book) {
		System.out.println(book);
		book.title = "another book";
		book.price = 9.9;
		System.out.println("at the end of method sub3: "+book);
	}
	
	void sub4(Book3 book) {
		System.out.println("In method sub4: "+book);
		book = new Book3();
		book.title = "sub4 book";
		book.price = 10.90;
		System.out.println("at the end of method sub4: "+book);
	}
}
class Book3 {
	String title;
	double price;
	
	public String toString() {
		return "Title: "+title+", price: "+price;
	}
}