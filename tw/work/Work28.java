package tw.work;

public class Work28 {

	public static void main(String[] args) {

	}

}


class Work281{
	protected Number m1() { 
		System.out.println("Work282:m1()");
		return 1;
	}
}

class Work282 extends Work281{
//	@Override //覆寫的意思 不是新方法可加可不加 加上去會幫忙報錯
	protected Number m1() {
		System.out.println("Work282:m1()");
		return null;
	}
	
}