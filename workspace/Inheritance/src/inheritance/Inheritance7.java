package inheritance;
public class Inheritance7{

	public static void main(String[] args) {
		Employee abc=new Employee(123);
		System.out.println("****************************************");
	abc.getsalary(25000);
	System.out.println("****************************************");
	Employee ab=new Employee(1100);
	System.out.println("****************************************");
	ab.getsalary(2.3);
	}}

class Company {int age=30;
	
	Company(){
		System.out.println("It is the statment of Parent class");
	}
	Company(double salary){
		
		System.out.println("The salary of the employee is "+salary);
		
	}
	Company(int EmpId){
		
		System.out.println("The employee Id is "+EmpId);
		System.out.println("the age of the employe is "+this.age);
		
		}
	void getSalary(int Salary) {
		this.age=35;
		System.out.println("The age of the employee is "+this.age);
		System.out.println("The salary is "+Salary);
		//return Salary;
	}
	void getSalary(double empId) {
		this.getSalary(35000);
		System.out.println("The Employee Id is  "+empId);
		//return empId;
	}
	
	//global variable
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
	
	
	//return empId;
}
	
	
	
	

// child class of Company
class Employee extends Company{
	
	int compId;
	int salary;
	Employee(int pay) {super(2523);
		System.out.println("The salary is "+this.salary);
			System.out.println("The payment of the employ:-  "+pay);
	
	}
	Employee(double salary){super(1111);
	this.compId=1111;
	System.out.println("The CompId is  "+this.compId);
	}
	void getsalary(int salary) {getsalary(2222.23);
		this.salary=200000;
		System.out.println("The global variable of parent class is "+super.age);
		System.out.println("The salary is  "+salary);
		System.out.println("The salary is  "+this.salary);
		
		
	}
	void getsalary(double salary) {
	this.salary=0000;
	System.out.println("The salary is  "+salary);
	System.out.println("The salary is  "+this.salary);
	
	//return salary;
	
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
}

}