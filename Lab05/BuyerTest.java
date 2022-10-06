package Lab05;
class Item{
	private int price;
	private String name;
	
	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + ", getPrice()=" + getPrice() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
class Food extends Item{
	
	
	public Food( String name, int price) {
		super(price, name);
	}
	

	@Override
	public String toString() {
		return "[Food]"+getName() ;
	}
	
}

class Book extends Item{
	private String author;
	
	

	public Book( String name, int price, String author) {
		super(price, name);
		this.author = author;
	}
	
	

	@Override
	public String toString() {
		return "[Book]"+ getName() + ", 저자:"+ author;
	}
	
	
	
	
	
}

class Movie extends Item{
	private String director;

	public Movie( String name, int price, String director) {
		super(price, name);
		this.director = director;
	}

	@Override
	public String toString() {
		return "[Movie]"+ getName() + ", 감독:"+director;
	}
	
}

class Buyer{
	private int money;

	public Buyer(int money) {
		super();
		this.money = money;
	}
	
	public void buy(Item t, int n) {
		
		if (t.getPrice()*n <= money) {
			System.out.println( t.toString()+"=>" + n + "개 구매 ");
			money -= t.getPrice()*n;
			System.out.println("구매완료 후 잔액: "+money);
		}
		else {
			System.out.println("****잔액 부족으로 구매 불가능****");
			System.out.println("잔액: "+money);
		}
	}

	@Override
	public String toString() {
		return "Buyer [money=" + money + "]";
	}
	
}

public class BuyerTest {

	public static void main(String[] args) {
		Buyer m = new Buyer(50000);
		m.buy((new Food("비빔밥", 7000)), 3);
		m.buy((new Food("라면", 5000)), 2);
		m.buy((new Book("java", 12000,"이설명")), 1);
		m.buy((new Movie("부산행", 9000, "연상호")), 1);
		m.buy((new Food("김밥", 2000)), 3);
	}

}
