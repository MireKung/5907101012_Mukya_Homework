/**
 /* @author Mukya_Wongdaraphanich 5907101012
 */
package th.utcc.cpe.Mukya.DataStructure.genericTest;
import java.lang.reflect.Array;
import java.util.*;

import th.utcc.cpe.Mukya.DataStructure.insertionSort.InsertionSortArray;

public class genericInsertionSort <T extends Comparable<T>> {
	private T [] element;
	private int eSize;
	
	public genericInsertionSort(Class <T> myclass,int size){

		if(size>0){
		element = (T[])Array.newInstance(myclass,size);	
		}
		else
			element = (T[])Array.newInstance(myclass,10);
		eSize=0;
	}
	    
	public void insert(T e){
		this.element[eSize] = e;
		eSize++;
	}
	
		public void show(){
		for(int i = 0 ; i < eSize ; i++){
			System.out.println(this.element[i]+ " ");
		}
		System.out.println(" ");
	}		
		
		   
	public void insertionSortHighoLow(){
		int out,in;
		T temp;
		
		for(out=1 ; out<eSize; out++){
			temp = this.element[out];
			for(in = out;in>0 && this.element[in-1].compareTo(temp)==-1;in--){
				this.element[in]=this.element[in-1];
		}
		this.element[in]=temp;
		}
	}
	
	public void insertionSortLowtoHigh(){
		int out,in;
		T temp;
		
		for(out=1 ; out<eSize; out++){
			temp = this.element[out];
			for(in = out;in>0 && temp.compareTo(this.element[in-1])==-1;in--){
				this.element[in]=this.element[in-1];
		}
		this.element[in]=temp;
		}
	}
	
	   // generic method printArray
		//only can print if it's a normal Array
	   public static <T> void printArray( T[] inputArray ) {
	      // Display array elements
	      for(int i=0; inputArray.length > i ;i++) {
	    	  
	         System.out.print(inputArray[i]+" ");
	      }
	      
	      System.out.println();
	   }

public static void main(String[]args){ 
	int max = 20;
	
	genericInsertionSort<Double> test1 = new genericInsertionSort<Double>(Double.class,max);
	
	test1.insert(1.0);
	test1.insert(8.0);
	test1.insert(18.0);
	test1.insert(12.0);
	test1.insert(97.0);
	test1.insert(38.0);
	System.out.println("original Order was");
	test1.show();
	System.out.println("After sroted from high to low is");
	test1.insertionSortHighoLow();
	test1.show();
	System.out.println("After sroted from low to high is");
	test1.insertionSortLowtoHigh();
	test1.show();
}
}
