package tw.work;

import java.io.File;

public class Work40 {

	public static void main(String[] args) {
		File f1 = new File ("d:/sam/test");
		if (f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			f1.mkdir();
		}

	}

}
