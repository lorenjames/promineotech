package week03;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); //Strings are technically different in memory therefore are not the same ever
		System.out.println(a.equals(b)); //Compares two strings using .equals method
		
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y); //Primitive data types are the same in memory so can be equal
		
		
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);

	}

}
