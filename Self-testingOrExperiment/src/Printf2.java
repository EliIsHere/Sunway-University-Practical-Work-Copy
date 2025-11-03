
public class Printf2 {
	public static void main(String[] args) {
		int id1=123, id2=3344, id3=5566, id4=7890;
		String name1="John", name2="Jane Peter", name3="LSK", name4="Joanne";
		
		System.out.println("Id       name    Id");
		System.out.println(id1 + "    " + name1 + "   " + id1);
		System.out.println(id2 + "    " + name2+ "   " + id1);
		System.out.println(id3 + "    " + name3+ "   " + id1);
		System.out.println(id4 + "    " + name4+ "   " + id1);
		
		System.out.println("\n\n");

		System.out.printf("%4s %10s %4s\n",  "Id", "name", "id");//(+) no. is right alignment
		System.out.println();
		System.out.printf("%4d %10s %4d\n",  id1, name1, id1);
		System.out.printf("%4d %10s %4d\n",  id2, name2, id2);
		System.out.printf("%4d %10s %4d\n",  id3, name3, id3);
		System.out.printf("%4d %10s %4d\n\n\n",  id4, name4, id4);
		
		System.out.printf("%-4s %-10s %-4s\n",  "Id", "name", "id");//(-) no. is left alignment
		System.out.println();
		System.out.printf("%-4d %-10s %-4d\n",  id1, name1, id1);
		System.out.printf("%-4d %-10s %-4d\n",  id2, name2, id2);
		System.out.printf("%-4d %-10s %-4d\n",  id3, name3, id3);
		System.out.printf("%-4d %-10s %-4d\n",  id4, name4, id4);
	}
}
