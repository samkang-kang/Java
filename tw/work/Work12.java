package tw.work;

public class Work12 {

	public static void main(String[] args) {
        int[] p = new int[7]; 

        for (int i = 0; i < 100000; i++) {
            int point = (int)(Math.random() * 9) + 1;

            if (point >= 1 && point <= 9) {
                p[point<=6?point:point-3]++;
            } else {
                p[0]++;
            }
        }

        if (p[0] == 0) {
            for (int i = 1; i < p.length; i++) {
                System.out.printf("%d點出現%d次\n", i, p[i]);
            }
        } else {
            System.out.println("Error");
        }
    }
}
