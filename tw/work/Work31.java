package tw.work;

public class Work31 {

	public static void main(String[] args) {
		// interface = 介面
		Work311 obj1 = new Work312();
		Work311 obj2 = new Work313();
		Work314 obj3 = new Work312();
		obj1.m1();
		obj3.m3();
		
		
	}
}
interface Work311{
	void m1();
	void m2();
}

class Work312 extends Object implements Work311,Work314{
	public void m1 () {}
	public void m2 () {}
	public void m3 () {}
	public void m4 () {}
}
class Work313 implements Work311 {
	public void m1 () {}
	public void m2 () {}
}

interface Work314{
	void m3();
	void m4();
	
}

interface Work315 extends Work314{
	void m5();
	void m6();
	
}
class Work316 implements Work315{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}
	
}

