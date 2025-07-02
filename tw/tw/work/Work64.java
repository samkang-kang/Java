package tw.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Work64 {

	public static void main(String[] args) {

		File source = new File("dir1/SAM1.jpg");
		byte[] buf = new byte[(int) source.length()];

		try (
			
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
			Socket socket = new Socket(InetAddress.getByName("10.0.101.133"), 7777);
			BufferedOutputStream bout = new BufferedOutputStream(socket.getOutputStream());
		) {
			int totalRead = bin.read(buf);
			if (totalRead != buf.length) {
				System.out.println("Warning: not all bytes read!");
			}

			bout.write(buf);
			bout.flush();
			System.out.println("Send OK");

		} catch (Exception e) {
			e.printStackTrace();  
		}
	}
}
