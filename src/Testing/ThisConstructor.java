package Testing;

public class ThisConstructor {
	public static void main(String[] args) {
		Sample s1=new Sample(10);
	}
}
class Sample{
	
	Sample(int id)
	{
		this("Akshay");
		System.out.println("Id:  "+id);
	}
	Sample(String s)
	{
		System.out.println("Name: "+s);
	}
}
