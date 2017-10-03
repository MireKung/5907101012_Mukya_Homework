/**
 * @author Mukya Wongdaphanich 5907101012
 */
package th.ac.utcc.cpe.Mukya.stackandQueue;

public class stack {
	private int maxSize;
	private int [] stackArray;
	private int top;
	
	public stack(int z){
		this.maxSize=z;
		stackArray = new int[maxSize];
		top=-1;
	}
	public void push(int p){
		stackArray[++top]=p;
	}
	public int pop(){
		return stackArray[top--];
	}
	public boolean isEmthy(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public static void main(String[]args){
		stack a = new stack(10);
		
		for(int i=1; !a.isFull();i++){
			a.push(10*i);
		}
		for( ; !a.isEmthy() ; ){
			int i = a.pop();
			System.out.print(i+ " ");
		}
		System.out.println(" ");
	}
}
