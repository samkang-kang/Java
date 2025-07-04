package tw.work;

public class Work44 {

	public static void main(String[] args) {
		Work441 obj = new Work441();
		try {
			obj.m1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Work441 {
	void m1() throws Exception {
		m2();
	}

	void m2() throws Exception {
		m3();

	}

	void m3() throws Exception {
		System.out.println("m3()");
		throw new Exception();
	}
}
