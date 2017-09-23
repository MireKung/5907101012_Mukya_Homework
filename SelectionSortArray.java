/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
package th.ac.utcc.cpe.Mukya12.SelectionSorttest;

import th.ac.utcc.cpe.Mukya12.BubbleTest.BubleSortHW;

public class SelectionSortArray { 
	private int [] element;
	private int eSize;
	
	public SelectionSortArray(int size){
		if(size > 0)
			this.element = new int [size];
		else
			//default element.length == 10
			this.element = new int[10];
		
		eSize = 0 ;
	}

	public void insert(int e){
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show(){
		for(int i = 0 ; i < eSize ; i++){
			System.out.println(this.element[i]+ " ");
		}
		System.out.println(" ");
	}
	
	public void selectionSort(){
		int out,in,min;
		
		for(out=0 ; out<eSize-1; out++){
			min = out;
			for(in=out +1 ; in< eSize ; in++){
				if(this.element[in]<this.element[min]){
					min=in;
				}
				this.swap(out,min);
			}
		}
	}
	
	private void swap(int L, int R){
		int temp = this.element[L];
		this.element[L]=this.element[R];
		this.element[R]=temp;
	}

public static void main(String[]args){ 
	
	int max = 20;
	SelectionSortArray select = new SelectionSortArray(max);
	
	select.insert(87);
	select.insert(43);
	select.insert(98);
	select.insert(32);
	select.insert(91);
	select.insert(78);
	select.insert(26);
	select.insert(12);
	
	//show original order
	System.out.print("Original Order : ");
	select.show();
	
	// sory and thens how the result
	select.selectionSort();
	System.out.print("Sorced Order :");
	select.show();
	
}
}
