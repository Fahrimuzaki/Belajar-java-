
// library
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//object
Scanner nama = new Scanner(System.in);
		
		// penggunaan 
		int variabel = nama.nextInt();
		
		
		// contoh program nya
		System.out.print("masukan panjang :  ");
		int user = nama.nextInt();
		
		System.out.print("masukan lebar : " );
		int user2 = nama.nextInt();
		
		System.out.print("user = " + (user + user2));
	}
}
