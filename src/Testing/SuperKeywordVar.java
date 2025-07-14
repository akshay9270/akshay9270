package Testing;

public class SuperKeywordVar {
	public static void main(String[] args) {
		new Child().print();
	}
}
class ParentClass{
	int parentAge=50;
	
}
class Child extends ParentClass{
	int childAge=20;
	
	void print() {
		int parentAge=80;
		System.out.println(parentAge);
		System.out.println("Child Age "+childAge);
		System.out.println(super.parentAge);
	}
}