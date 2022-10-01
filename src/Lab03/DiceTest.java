//2110883 김혜수
//2022.09.22
//LAB03_06 주사위 던지기 
package Lab03;

class Dice {
	private int value;

	public Dice() {
		value = 0;
	}

	void roll() {
		value = (int) ((Math.random() * 6) + 1);
	}

	int getValue() {
		return value;
	}
}

public class DiceTest {

	public static void main(String[] args) {

		Dice num1 = new Dice();
		Dice num2 = new Dice();

		int count = 0;
		int add;
		do {
			num1.roll();
			num2.roll();

			count += 1;

			int value1 = num1.getValue();
			int value2 = num2.getValue();
			System.out.println("주사위1 =" + value1 + " " + "주사위2 = " + value2);

			add = value1 + value2;

		} while (add != 2);

		System.out.println("(1,1)이 나오는데 걸린 횟수:" + count);

	}

}
