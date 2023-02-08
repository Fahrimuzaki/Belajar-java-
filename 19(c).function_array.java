import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
// Macam macam function array
		
		int data1[] = {0,1,2,3,4,5,6,7,8,9};

		// 1. .toString = untuk ngeprint 
		System.out.println(Arrays.toString(data1));
		
		
		//2. cara copy array (.copyOf)
       int data2[] = Arrays.copyOf(data1, 10 );
		System.out.println(Arrays.toString(data2));
		
		
      //3. cara copy array  (.copyOfRange)
    int data3[] = Arrays.copyOfRange(data1, 0,10 );
    System.out.println(Arrays.toString(data3));
    
   
    
    //4. cara fill array
    int data4[] = new int[10];
    Arrays.fill(data4, 5);
    
    System.out.println(Arrays.toString(data4));
    
    //5.  cara ngecek sama atau tidak array
    System.out.println( Arrays.equals(data1,data2));
     
     
     //6. cara ngecek lebih besar
   System.out.println( Arrays.compare(data1,data2));
   
   // 7. cara ngecek index yang berbeda
System.out.println( Arrays.mismatch(data1,data2));
     
     
     // 8.cara mengurutkan data array
     int data5[] ={8,6,7,3,9,1,4,5,2};
     Arrays.sort(data5);
    System.out.println(Arrays.toString(data5));
     
     
   //9. cara mengetahui posisi array yang telah
     // di sort
   int posisi =  Arrays.binarySearch(data5, 7);
   
    System.out.println(posisi);
	}
}
