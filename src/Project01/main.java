package Project01;

public class main {

	public static void main(String[] args) {
		
		car c1 = new car();  //create new object
		
		c1.color = "Red";    //initialize attributes
		c1.name = "Toyota";
		c1.speed = 150;
		c1.weight = 45.3;
		c1.no = 123;
		
		c1.speed();  //Call methods from car class
		c1.color();
		c1.weight();
		c1.name();

	}

}
