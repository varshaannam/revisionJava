package revision;

public class Testbuffer {

	public static void main(String[] args) {
		//insert
		
		StringBuffer S = new StringBuffer("javapoint");
		
		System.out.println	(S.insert(2, "hoi"));
		//delete
		
		System.out.println(S.delete(1,3));
		//REPLACE
		
		System.out.println(S.replace(1, 3, "java"));
		//Reverse
	
		System.out.println(S.reverse());
		// append
		System.out.println(S.append("fast"));
		

	}

}
