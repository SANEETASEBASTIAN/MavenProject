package newq;

import java.util.ArrayList;

public class Class {

	public static void main(String args[]) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(1001);
		a1.add(122);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		
		System.out.print(a1.set(2,3));
		
	}
}

