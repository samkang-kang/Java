package tw.work;

public class Work33 {

	public static void main(String[] args) {
		String test = "1987";
		if (test.matches("[0-9]{4}")) {
		long count = test.chars().filter(c->c == '1').count();
		System.out.println(count);
		System.out.println("------");
		
		test.chars().forEachch(ch -> System.out.println((char)ch));
		
			}else {
			System.out.println("XX");
		}
	}

}
