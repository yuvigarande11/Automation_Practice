
package constructor;

class Cons {
	int roll;
	double salary;
	Cons(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons c1 = new Cons(101,250045.45);
		c1.display();
		Cons c2 = new Cons(201,550045.45);		
		c2.display();
	}
}