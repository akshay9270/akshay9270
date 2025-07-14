package Testing;

public class ThisMethod {
	public static void main(String[] args) {
		Instance i=new Instance();
		i.display();
	}
}
class Instance
{
	void sample()
	{
		System.out.println("This is instance method");
	}
	void display()
	{
		this.sample();
		System.out.println("Display method called");
	}
}