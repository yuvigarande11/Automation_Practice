package collection;


import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		List b= new ArrayList();
		a.add(123);
		a.add(45);
		a.add(67);
		a.add(90);
		System.out.println(a);
		a.add(1,456);
		System.out.println(a);
		System.out.println("Size of the array list :"+a.size());
		System.out.println(a.get(2));
		System.out.println("***********element print using for loop***********");
		for(int i=0;i<a.size();i++) {
			System.out.println("element print by :"+a.get(i));}
		
			System.out.println("***********element print using for each loop***********");
			for (Object c : a) {
				System.out.println("element print by :"+c);
			}
		}
	
}
