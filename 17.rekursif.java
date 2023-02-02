import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner nama = new Scanner(System.in);
		
		int k =10;
		
		tambah(k);
		System.out.print("\n" + tambah(k));
	}
	
	   //  ini contoh fungsi rekursif 
	static int tambah(int a){
	    System.out.println(a);
	    if(a== 1){
	        return a;
	    }
	    return a + tambah(a - 1);
	}
}
