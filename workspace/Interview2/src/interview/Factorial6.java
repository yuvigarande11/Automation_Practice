package interview;

public class Factorial6 {
static int Factorial1(int number) {
	int factorial=1;
for(int i=number;i>0;i--) {
	factorial=factorial*i;
}
	System.out.println(factorial);
	return 10;
}
public int factorial2(int num1) {
	int factorials2=1;
while(num1>0) {
	factorials2=factorials2*num1;
	num1--;
}	System.out.println("The factoral is "+factorials2);
return factorials2;
}
 static void Fact(int num2){
	int factorials3=1;
	while(num2>0) {
		factorials3=factorials3*num2;
		num2--;	}
	

System.out.println("The factoral is "+factorials3);

}
	public static void main(String[] args) {
		
		Factorial6.Factorial1(10);
		Factorial6 ab=new Factorial6();
	
		ab.factorial2(5);
		Fact(4);
	}

}
