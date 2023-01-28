import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner nama = new Scanner(System.in);
		
		int variabel,date;
		date = nama.nextInt();
		
	//RUMUS 
		// Variabel = (date == 10) ? (true) :  (false);
		variabel = (date == 10) ? (date + date) : (date / 2);
		
		
		
		System.out.print(variabel);
	
		
	}
}
