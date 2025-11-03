public class ArrayOfObject {
	public static void main(String[] args) {
		BooK bk = new BooK();
		System.out.println();
		BooK bk2 = new BooK("book 2", 69.95);

		System.out.println("Book1");//method 1
		System.out.printf("Title: %s\nPrice: RM%.2f\n", bk.title, bk.price);

		System.out.println("Book2");//method 2
		bk2.print();
	}

	//method to receive an array of Books


	//method to return an array of Books
}

class BooK {
	String title;
	double price;

	BooK(){
		this("my book", 19.90);
		System.out.println("here");

	}

	public BooK(String title, double price) {//source->generate constructor using field->generate(after alterations)
		System.out.println("here pt2");
		this.title = title;
		this.price = price;
	}

	public void print() {
		System.out.println("Title: "+title+"\nPrice: RM"+price+"\n");

	}

	
	public String toString() {
		return String.format("Title: %s\nPrice: %.2f", title, price);
	}
	

}