/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
package th.ac.utcc.cpe.Mukya12.InsertionSort;
 
public class InsertionSortArray {  
	private int [] element;
	private int eSize;
	
	public InsertionSortArray(int size){
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
	
	public void insertionSort(){
		int out,in,temp;
		
		for(out=1 ; out<eSize; out++){
			temp = this.element[out];
			for(in = out;in>0 && this.element[in-1]>=temp;in--){
				this.element[in]=this.element[in-1];
		}
		this.element[in]=temp;
		}
	}

public static void main(String[]args){ 
	int max = 20;
	InsertionSortArray insertion = new InsertionSortArray(max);
	
	insertion.insert(87);
	insertion.insert(43);
	insertion.insert(98);
	insertion.insert(32);
	insertion.insert(91);
	insertion.insert(78);
	insertion.insert(26);
	insertion.insert(12);
	
	//show original order
	System.out.print("Original Order : ");
	insertion.show();
	
	// sory and thens how the result
	insertion.insertionSort();
	System.out.print("Sorced Order :");
	insertion.show();
	
}
}
