public class Main {
	public static void main(String[] args) {
		boolean a,b,hasil;
		
//operator logika
		
		a = true ;
		b = false;
		
		//or
		hasil = a || b;
		
		System.out.println(hasil);
		
		// and
		hasil = a && b;
		System.out.println(hasil);
		
		//xor
		hasil = a ^ b;
		System.out.println(hasil);
		
		
		//not
		  //hanya satu operand
		  hasil = !a;
		  System.out.println(hasil);
	}
}
