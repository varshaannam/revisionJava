package revision;

public class Teacher  implements School{
	public void student() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Teacher obj = new Teacher();
		obj.student();
		System.out.println(obj.rollno);*/
		School obj1 = new Teacher();
		obj1.student();
		System.out.println(obj1.rollno);
		School.display();
	}

}
