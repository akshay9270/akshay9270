package Testing;

public class SuperKeyword {
	public static void main(String[] args) {
		SubClass c1=new SubClass();
		c1.testSub();
	}
}

class SuperClass{
	
	
	void testSuper() {
		System.out.println("Super Class Method");
		
	}
}

class SubClass extends SuperClass{
	
	void testSub() {
		super.testSuper();
		System.out.println("Sub Class Method");
	}
}
