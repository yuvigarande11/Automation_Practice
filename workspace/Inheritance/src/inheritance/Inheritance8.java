package inheritance;

public class Inheritance8 {

	public static void main(String[] args) {
Triangle abc =new Triangle();
		abc.Area();
		
	}}

	
		class Area {
		void	Area() {
				System.out.println("The area of shape");
			}
			void tr(int length,int breadth) {
				double ar=(length*breadth);
			System.out.println("The length is of square ="+length);
			System.out.println("The breadth is of square="+breadth);
			System.out.println("The area is of square ="+ar);	
			}
		}
		class Triangle extends Area{
			 void Area() {
				super.tr(2,20);
				//int ar=(length*breadth)*(1/2);
				//System.out.println("The area is of triangle ="+ar);
			}
			void tr(int length,int breadth) {
				double ar=(length*breadth)*0.5;
			System.out.println("The length is of triangle ="+length);
			System.out.println("The breadth is of triangle ="+breadth);
			System.out.println("The area is of triangle ="+ar);	
			}
		}
	
