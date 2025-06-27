package tw.work;

public class Work27 {

	public static void main(String[] args) {
		Work271 obj1= new Work271();
		System.out.println(obj1.i);
		System.out.println(Work271.j);

		Work271 obj2= new Work271();
		System.out.println(obj2.i);
		System.out.println(Work271.j);
		
		Work271 obj3= new Work271();
		System.out.println(obj3.i);
		System.out.println(Work271.j);
		
		
		
		

	}

}

class Work271{
	int i;
	static int j;
	Work271(){
		i++;
		j++;
		
	}
}