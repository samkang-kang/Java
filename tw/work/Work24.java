package tw.work;

public class Work24 {

	public static void main(String[] args) {

		String name = "Work功課的";
		System.out.println(name);
		String name2 = name.concat("Chao");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.length());
		String name3 = name.replace('a','A');
		System.out.println(name3);
		System.out.println("---------");
		String s1 = new String ("Brade");
		String s2 = s1;
		System.out.println(s1 == s2 );
		s2 = "Work";
		System.out.println(s1 == s2 );
	}

}
