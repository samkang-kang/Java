package tw.work;

import tw.sam.api.Bike;

public class Work23 {

	public static void main(String[] args) {
		String s1 = "Work";
		String s2 = "Work";		
		String s3 = new String("Work");
		String s4 = new String("Work");
		
		
		
		int a = 10 , b = 10 ;
		System.out.println(a==b);
		System.out.println( s1 == s2); // == >  比物件內容
		System.out.println( s3 == s4);
		System.out.println( s1 == s3);
		System.out.println( s1.equals(s3)); // 比字串內容
		
		
	}

}
