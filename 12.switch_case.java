import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner nama = new Scanner(System.in);
		
		System.out.printf("masukan angka : ");
		int a = nama.nextInt();
		
		switch(a){
		    case 1: System.out.printf("satu"); break;
		    case 2: System.out.printf("dua"); break;
		    case 3 : System.out.printf("Tiga"); break;
		    default : System.out.printf("selainnya");
		}
		
		
	}
}
