package revision;

public class Bike extends Vehicle {
	void display() {
		System.out.println("child class method");
		//super.display();
	}
		public static void main(String []args) {
			Bike obj = new Bike();
			
			obj.display();
			Vehicle obj1 = new Vehicle();
			obj1.display();
		}
	}


