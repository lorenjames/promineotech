package week03;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName,lastName);
		
		System.out.println(fullName);

	}
	
	public static String createFullName(String x, String y) {
		
		String fullName = x + " " + y;
		return fullName;
	}

}
