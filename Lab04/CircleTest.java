//2110883 김혜수
//2022.09.29
//Lab04 객체배열 생성하여 원의 반지름을 저
package Lab04;
class Circle{
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	//getset 사용 
	public int getRadius() { return radius;}
	public void setRadius(int radius) { this.radius = radius;}
		
	
	//toString 메소드 
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}

public class CircleTest {

	public static void main(String[] args) {
		
		
		Circle[] circles = new Circle[3];
		
		for (int i=0; i<circles.length;i++) {
			circles[i]= new Circle((int)(Math.random()*100));
		}
		
		for (int i=0; i<circles.length;i++) {
			System.out.println(circles[i]);
		} 

	}

}
