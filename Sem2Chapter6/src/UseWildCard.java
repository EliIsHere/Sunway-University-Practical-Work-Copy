import java.util.*;

public class UseWildCard {
	public static void main(String[] args) {
		A a[] = new A[5];
		B b[] = new B[5];
		C c[] = new C[5];
		
		
		ArrayList <A> listA = new ArrayList<A>();
		ArrayList <B> listB = new ArrayList<B>();
		ArrayList <C> listC = new ArrayList<C>();
		
		UseWildCard uw = new UseWildCard();
		uw.sub0(new A());
		uw.sub0(new B());
		uw.sub0(new C());
		
		uw.sub2(listA);
		//uw.sub2(listB);	//syntax error
		//uw.sub2(listC);	//syntax error
		
		uw.sub2b(listA);
		uw.sub2b(listB);
		uw.sub2b(listC);
		uw.sub2b(new ArrayList<Book>());
		uw.sub2b(new ArrayList<Exception>());
		
		uw.sub2c(listA);
		uw.sub2c(listB);
		uw.sub2c(listC);
		//uw.sub2c(new ArrayList<Book>());		//syntax error
		//uw.sub2c(new ArrayList<Exception>());		/syntax error
	}
	void sub0(A obj) {}
	void sub(A[] arr) {}
	void sub2 (ArrayList <A> list ) {}//only accept <A> type of list
	
	<E> void sub2b (ArrayList <E> list ) {}//accept all		//not recommended
	void  sub2c (ArrayList <? extends A/*from A downwards (include class A, B, and C)*/> list) {}		//? is called wakat

}

class A{}
class B extends A{}
class C extends B{}
class Book{}
