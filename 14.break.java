public class Main {
	public static void main(String[] args) {
		
		for (int a = 1; a <= 10; a++ )
		{

	      	    if(a == 4){
	     	        continue; // melompat kondisi
	      	    }
		    
		         if(a == 8){
		         break;   // mengakhiri looping (merusak)
	     	    }
     		    System.out.println("Hello " + a);
		    
		}
		
		
		return ; // mengakhiri program java
	}
}
