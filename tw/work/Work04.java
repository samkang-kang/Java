package tw.work;

public class Work04 {

	public static void main(String[] args) {
		// 浮點數 : float double
		float var1 = 10;
		float var2 = 3;
		float var3 = var1/var2;
		System.out.println(var3);
		
		double var4= 10;
		double var5= 3;
		double var6 = var4/var5;
		System.out.println(var6);
		
	}

}

// 型別	      位元	     精度範圍	          結果差異
//float	    32-bit	  約 7 位有效數字	     度較低，速度快
//double	64-bit	約 15~16 位有效數字	    精度較高，速度略慢