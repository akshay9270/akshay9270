package Testing;

public class SuperKeywordConstructor {
	public static void main(String[] args) {
		new ChildCla();
	}
}
class ParentCla{

	public ParentCla(int a,int b) {
		System.out.println(a+b);
	}
	
}

class ChildCla extends ParentCla{
	
	
	public ChildCla() {
		super(10,20);
	}
    
}