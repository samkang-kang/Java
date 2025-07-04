package tw.work;

public class Work06 {

	public static void main(String[] args) {
		double temp = Math.random();
		// Math.random() 回傳 0.0 ~ 1.0（不含 1）的隨機double數
		// 例如可能是：0.72345
		int score = (int) (temp * 101) + 0;
		System.out.println(score);

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}

}
