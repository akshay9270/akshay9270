package Testing;

class Employee{
	int eId=1;
	String eName="Akshay";
	double salary=20000;
	
	void work() {
		System.out.println("Employee is working !");
	}
	
	void play() {
		System.out.println("Employee is playing !");
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("Employee Id: "+e1.eId);
		System.out.println("Employee name: "+e1.eName);
		System.out.println("Employee Id: "+e1.salary);
		System.out.println("===================");
		e1.work();
		e1.play();
	}
}


