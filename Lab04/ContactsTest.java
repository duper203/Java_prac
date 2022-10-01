//2110883 김혜수
//2022.09.29
//Lab04  연락처 저장하고 검색하기 
package Lab04;
import java.util.Scanner;
import java.util.ArrayList;

class Contact{
	private String name;
	private String phone;
	private String email;
	static int count = 0;
	
	public Contact(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		count++;
	}
	
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}
	public String getphone() { return phone;}
	public void setphone(String phone) { this.phone = phone;}
	public String getemail() { return email;}
	public void setemail(String email) { this.email = email;}

	@Override
	public String toString() {
		return name + "의 전화번호:" + phone + " 이메일:" + email;
	}
}

public class ContactsTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연락처를 입력하시오(종료-1)");	
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		while (true) {
			
			System.out.print("이름과 전화번호 이메일을 입력하시오:");
			
			String name1 = scan.next();
			
			if (name1.equals("-1")) {
				break; 
			}
			
			String phone1 = scan.next();
			String email1 = scan.next();
			
			contacts.add(new Contact(name1, phone1, email1));
		}
		System.out.println("지인들의 수는"+ Contact.count+"입니다 ");
		System.out.print("검색할 이름을 입력하시오:");
		String name = scan.next();
		
		for(int i = 0; i<contacts.size(); i++) {
			System.out.println(contacts.get(i));
			// if(name.equals(contacts.get(i).getName())) {
			// 	System.out.println(contacts.get(i));
			// }

}
}
}
