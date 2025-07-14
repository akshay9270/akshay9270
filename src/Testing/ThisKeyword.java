package Testing;
//differentiate between local and instance variable
class MainApp {
	String name;
	int id;
	double sal;
	MainApp(String n,int i,double sal)
	{
		this.name=n;
		this.id=i;
		this.sal=sal;
	}
	void details(){
		System.out.println("Employee name "+name);
		System.out.println("Employee id "+id);
		System.out.println("Employee sal "+sal);
	}
}
class ThisKeyword
{
	public static void main(String[] args) {
		MainApp t=new MainApp("Akshay", 1, 10000);
		t.details();
	}
}
