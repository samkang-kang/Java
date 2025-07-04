package tw.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Work52 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("dir1/coffee.jpg");
		byte[] buf = new byte[(int) source.length()];
		try (FileInputStream fin = new FileInputStream("dir1/coffee.jpg");

				FileOutputStream fout = new FileOutputStream("dir2/coffee2.jpg");) {
			fin.read(buf);
			fout.write(buf);
			fout.flush();
			System.out.println("Finish");
			System.out.println(System.currentTimeMillis() - start);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
