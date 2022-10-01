//2110883 김혜수
//2022.09.22
//LAB03_01 person의 정보 작성하기 
package Lab03;
class Person{
	private String name;
	private String phone;
	private String office;
	private String email;
	
	public Person(String n, String p, String o, String e) {
		name = n; phone = p; office = o; email = e;
	}
	@Override
	public String toString() {
		return("Person["+"name = "+name+", "+"mobile = "+phone+", "+"office = "+office+", "+"email = "+email+"]");
	}
	
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}
	public String getphone() { return phone;}
	public void setphone(String phone) { this.phone = phone;}
	public String getoffice() { return office;}
	public void setoffice(String office) { this.office = office;}
	public String getemail() { return email;}
	public void setemail(String email) { this.name = email;}
	
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person obj = new Person("Kim", "01012345678", "027104567", "a@b.c");
		System.out.println(obj);
	}

}
