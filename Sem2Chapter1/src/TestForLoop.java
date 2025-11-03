
public class TestForLoop {
	public static void main(String[] args) {
		for (int cnt=0; cnt<5; cnt++)
			System.out.println(cnt);

		for (int cnt=0, cnt2=1, cnt3=3, cnt4=5;

				cnt<5 && cnt2<10;
				cnt++, cnt2+=2, cnt3-- ) {
			System.out.println(cnt);
			System.out.println(cnt2);
			System.out.println(cnt3);
			System.out.println(cnt4);
			System.out.println();
		}


		//System.out.println(cnt); //syntax error
		//System.out.println(cnt2);//syntax error
		//System.out.println(cnt3);//syntax error
		//System.out.println(cnt4);//syntax error

		char ch='a';
		int num=10;
		double dnum=1.1;
		for (; ch<'p' || num>0;  ch++, num--, dnum+=0.2) {
			for (ch='a', num=10,dnum=1.1; ch<'p' || num>0;  ch++, num--, dnum+=0.2) {

			}
		}
	}
}