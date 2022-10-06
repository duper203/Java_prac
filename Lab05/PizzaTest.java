//2110883 김혜수
//22.10.06
//Lab05 pizzaTest
package Lab05;
class Circle{
	protected int radius;
	public Circle(int r) {radius = r;}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
};

class Pizza extends Circle{	
	private String name;
	Pizza(int r) { super(r);}
	Pizza(String name, int radius) {
		super(radius);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "피자의 종류:" + name + ", 피자의 크기:"+ radius;
	}
	
	
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		System.out.println(obj);
	}

}
