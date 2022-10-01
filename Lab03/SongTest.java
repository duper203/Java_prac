//2110883 김혜수
//2022.09.22
//LAB03_02 song의 정보 출력하기 
package Lab03;

class Song{
	private String title;
	private String artist;
	private int length;
	
	public Song() {
		this.title ="제목없음 ";
		this.artist ="정보 없음 ";
		this.length =0;
	}
	public Song(String title) {
		this(title,"",0);	
	}
	public Song(String title, String artist) {
		this(title, artist, 0);
	}
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public String toString() {
		return("Song["+"제 목 = "+title+", "+"가수 = "+artist+", "+"곡의 길이 = "+length+"]");
	}
}
public class SongTest {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalya", "carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);		
	}
}
