package globalVariable;

public class Global {
		static int radius=15;
	public static void main(String[] args) {
		
			double radius;		//local variable
			radius=20.0;
			double area=3.14*radius*radius;
			System.out.println("area of the circle="+area);
			System.out.println("radius  of the circle="+radius);
			System.out.println("radius  of the circle given by the Global variable="+Global.radius);


	}

}
