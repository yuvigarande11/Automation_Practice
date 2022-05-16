package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList b=new ArrayList();
		b.add(20);
		b.add("yuvraj");
		b.add('c');
		b.add(203.1);
		System.out.println("Array list b :"+b);
		System.out.println("***********************************");
		b.add(2, "tilakraj");
		System.out.println("***********************************");
		System.out.println("Array list b :"+b);
		System.out.println("***********************************");
		b.set(3, "Dipam");
		System.out.println("Array list b :"+b);
		ArrayList b1=new ArrayList();
		b1.addAll(b);
		System.out.println("Array list b1 :"+b1);
		b1.add(2000);
		System.out.println("Array list b1 :"+b1);
		b1.add(0, 1);
		System.out.println("Array list b :"+b1);
		ArrayList <Integer> c=new <ArrayList> ArrayList();	
	c.add(20);
	c.add(24);
	c.add(2);
	c.add(2000);
	System.out.println("The list c :"+c);
	Collections.sort(c);
	System.out.println("The list c :"+c);
	System.out.println("the maximum number in array collection c :"+c.get(c.size()-1));
	Collections.sort(c);
	System.out.println("The list c :"+c);
	System.out.println("the maximum number in array collection c :"+c.remove(1));
	System.out.println("The list c after removing element on index 1 :"+c);
	c.forEach(a->
	System.out.println(a)
			);
	
	
	
	}
	
}
