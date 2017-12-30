package th.utcc.cpe.Mukya.DataStructure.genericTest;

public  class genericTest <T>{
	
	public static int[] element;
	public int size;
	
	public genericTest(){
		element = new int[10];
		size=0;
	}

	public void insert(int e){
		this.element[size] =  e;
		size++;
	}
	public void show(){
		for(int i = 0 ; i < size ; i++){
			System.out.println(this.element+ " ");
		}
		System.out.println(" ");
	}
	
	public static <T> void insertionSort(T[] inputArray){
		int out,in;
		int temp;
		T temps;
		for(out=1 ; out<10; out++){
			temps = inputArray[out];
			temp=(int)temps;
			for(in = out;in>0 ;in--){
				element[in]=element[in-1];
		}
		element[in]=temp;
		}
	}
	
	   // generic method printArray
	   public static <T> void printArray( T[] inputArray ) {
	      // Display array elements
	      for(int i=0; inputArray.length > i ;i++) {
	    	  
	         System.out.print(inputArray[i]+" ");
	      }
	      
	      System.out.println();
	   }

	   public static void main(String args[]) {
		   
		   
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 5, 4, 3, 2, 1 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      
	      insertionSort(intArray);
	      
	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}
