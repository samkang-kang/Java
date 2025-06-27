package tw.work;

public class Work07 {

	public static void main(String[] args) {
		int year = 2023;
		boolean isLeap;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;}
				 else 
					{isLeap = false;}
			} else 
				{isLeap = true;}		
		} else 
			{isLeap = false;}
		

		System.out.printf("%d年是%s年", year, isLeap ? "閏" : "平");
	}

}
