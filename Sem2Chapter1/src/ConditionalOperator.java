public class ConditionalOperator {
	public static void main(String[] args) {
		int num=4;
		int ans=0;
		int ans1 = 0;
		
		/*if (num>0)
			ans = 10;
		else
			ans = 20;*/
		ans = (num>0)?10:20;
		
		
		/*if (num==4)
			System.out.println("num is four");
		else
			System.out.println("num is not four");*/
		System.out.println((num==4)?"num is four":"num is not four");
		
		/*if (num==0)
			ans = 0;
		else if (num==1)
			ans = 10;
		else if (num==4)
			ans = 20;*/
		ans1 = (num==0)?0:(num==1)?10:(num==4)?5:null;
		
	}
}