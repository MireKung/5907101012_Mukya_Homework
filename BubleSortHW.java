/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
package th.ac.utcc.cpe.Mukya12.BubbleTest; 

public class BubleSortHW {  
	private double [] element;
	private int eSize;
	
	public BubleSortHW(int size){
		if(size > 0)
			this.element = new double [size];
		else
			//default element.length == 10
			this.element = new double[10];
		
		eSize = 0 ;
	}

	public void insert(double e){
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show(){
		for(int i = 0 ; i < eSize ; i++){
			System.out.println(this.element[i]+ " ");
		}
		System.out.println(" ");
	}
	public void bubbleSort(){
		int out,in;
		
		for(out=eSize-1 ; out> 0; out--){
			for(in=0; in< out ; in++){
				if(this.element[in]<this.element[in+1]){
					this.swap(in,in+1);
				}
			}
		}
	}
	
	private void swap(int L, int R){
		double temp = this.element[R];
		this.element[R]=this.element[L];
		this.element[L]=temp;
	}
	//MAIN
	public static void main(String[]args){  
		//
		int max = 20;
		BubleSortHW bubble = new BubleSortHW(max);
		
		bubble.insert(87.5);
		bubble.insert(43.6);
		bubble.insert(98.9);
		bubble.insert(32.45);
		bubble.insert(91.18);
		bubble.insert(78.36);
		bubble.insert(26.25);
		bubble.insert(12.5);
		
		//show original order
		System.out.print("Original Order : ");
		bubble.show();
		
		// sory and thens how the result
		bubble.bubbleSort();
		System.out.print("Sorced Order :");
		bubble.show();
		
	}
}
