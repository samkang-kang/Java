package tw.work;

public class Work29 {

	public static void main(String[] args) {
		Work291 obj1 = new Work291();
		Work291 obj2 = new Work292();
		Work291 obj3 = new Work293();
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
		Work292 obj4 = (Work292)obj2;
		obj4.m2();

		System.out.println(obj2 == obj4);
		System.out.println(obj2  instanceof Work293);
	}

}

class Work291 {
	void m1() { System.out.println("Work291:m1()");}
}

class Work292 extends Work291 {
	void m1() { System.out.println("Work292:m1()");}
	void m2() { System.out.println("Work292:m2()");}
}

class Work293 extends Work291 {
	void m1() {System.out.println("Work293:m1()");}

	}














