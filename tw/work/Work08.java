package tw.work;

public class Work08 {

	public static void main(String[] args) {
		int month =6;
		int days;
		
		switch (month) {
		case 1,3,5,7,8,10,12:
		days = 31;
		case 2:
		days = 28;
		case 4,6,9,11:
		days = 30;
		break;
		default :
		days = -1;			
		}
		System.out.printf("%d月有%天",month,days);

	}

}
