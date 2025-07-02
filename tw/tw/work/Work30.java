package tw.work;

public class Work30 {

	public static void main(String[] args) {		
//		Work301 obj1 = new Work301();
		Work301 obj1 = new Work302();
		Work301 obj2 = new Work303();
		obj1.m3();
		obj2.m3();
		
		Work301 obj3 = new Work301() {
			void m3 () {
				System.out.println("Work301:m3()");
			}
		};
		obj3.m3();
	}

}

abstract class Work301 {
	Work301(){System.out.println("Work301");}
		void m1() {}
		void m2() {}		
		abstract void m3 ();			
}
class Work302 extends Work301{
	void m3() {
		System.out.println("Work302:m3()");
	}
}
class Work303 extends Work301{
	void m3() {
		System.out.println("Work303:m3()");
	}
}