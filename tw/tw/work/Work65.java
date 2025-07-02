package tw.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Work65 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] allData = bin.readAllBytes();
			
			String urip = socket.getInetAddress().getHostName();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(String.format("upload%s.jpg", urip)));
			bout.write(allData);
			bout.flush();
			bout.close();
			
			
			
			socket.close();
			server.close();
			System.out.println("Receive OK");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}