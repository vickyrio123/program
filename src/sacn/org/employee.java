package sacn.org;

import java.util.Scanner;

public class employee {
	private void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the age");
		byte age = s.nextByte();
		System.out.println("enter the name");
		String name = s.next();
		
		System.out.println("enter the phno");
		long phno = s.nextLong();
		System.out.println("enter the salary");
		float sal = s.nextFloat();
		
		
	
	}

	private void cone() {
	System.out.println("dell");
	}

	private void sub() {
		System.out.println("done");

	}
	public static void main(String[] args) {
		employee e = new employee();
		e.add();
	}

}
