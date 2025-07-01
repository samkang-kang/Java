package tw.work;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Work57 {

	public static void main(String[] args) {
		Work573 obj = new Work573 ();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/Work571.obj"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}
class Work571{
	Work571() {System.out.println("Work571");}
}
class Work572 extends Work571{
Work572() {System.out.println("Work572");}
}
class Work573 extends Work572{
Work573() {System.out.println("Work573");}
}
}












