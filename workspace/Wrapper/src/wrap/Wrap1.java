package wrap;

public class Wrap1 {

	public static void main(String[] args) {
		Integer A=25;//auto boxing/boxing
		System.out.println("the A is "+A);
	//	Double b=new Double(20);
		//System.out.println(""+b);
		Double doubleObj=25.2566;//autoboxing
		System.out.println("doubleObj: "+doubleObj);
		//only boxed object can be unboxed
		double salary=doubleObj.doubleValue();//unboxing 
		System.out.println(salary);
		System.out.println(doubleObj==salary);//
		
		Boolean b=true;//boxing
		boolean b1=b.booleanValue();//unboxing
		
		Character c1=new Character('a');//boxing
		char c2=c1.charValue();//unboxing
		
		Integer i=25;
		double d=i.intValue();
		

	}

}
