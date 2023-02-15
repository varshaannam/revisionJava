package revision;

public class Throws1 {
	static void Checkage(int age) {
		if (age<18) {
			throw new ArithmeticException("not eligible for voting");
		}
		else {
			System.out.println("eligible for voting");
		}}
		public static void main(String[] args) {
			
		Throws1.Checkage(19);
		
	}

	

}
