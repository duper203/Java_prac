//2110883 김혜수
//2022.09.29
//Lab04 자동차 회사에서 생산한 자동차 개
package Lab04;
class Car{
	private String model;
	private String make;
	static int numberOfcars;	//정적변수 
	
	public Car(String model, String make) {
		super();
		this.model = model;
		this.make = make;
		numberOfcars++;
	}
	//정적 메소드 
	public static int getNumberOfCars() {
		return numberOfcars;
	}
	
	//get set

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static int getCount() {
		return numberOfcars;
	}

	public static void setCount(int numberOfcars) {
		Car.numberOfcars = numberOfcars;
	}
	
	//tostring메소드 
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + "]";
	}
	
	
	
	
}


public class CarTest {

	public static void main(String[] args) {
		new Car("3SERIES","BENZ");
		new Car("3SERIES","BENZ");
		new Car("3SERIES","BENZ");
		System.out.println("총"+Car.getNumberOfCars()+"대의 자동차가 생산되었습니다."); //설정자 메소드 호

	}

}
