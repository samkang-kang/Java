package tw.work;

public class Work08 {

	public static void main(String[] args) {
		int month = 11;
		int days;
		//在 switch 中，每個 case 都需要加上 
		//break，否則會 繼續執行下面的 case
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12: 
				days = 31;
				break;
			case 2: 
				days = 28;
				break;
			case 4, 6, 9, 11: 
				days = 30;
				break;
			default:
				days = -1;
		}
		
		System.out.printf("%d月有%d天", month, days);
	}
}