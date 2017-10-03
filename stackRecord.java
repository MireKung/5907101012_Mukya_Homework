/**
 * @author Mukya Wongdaraphanich 5907101012
 */
package th.ac.utcc.cpe.Mukya.stackandQueue;
import th.ac.utcc.cpe.Mukya12.SubjecRecordFirstday.*;

public class stackRecord {
	private int maxSize;
	private SubjectRecord [] stackArray;
	private int top;
	
	public stackRecord(int z){
		this.maxSize=z;
		stackArray = new SubjectRecord[maxSize];
		top=-1;
	}
	public void push(SubjectRecord p){
		stackArray[++top]=p;
	}
	public SubjectRecord pop(){
		return stackArray[top--];
	}
	public boolean isEmthy(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public static void main(String[]args){
		SubjectRecord s1 = new SubjectRecord();
		s1.setName("Data Structure");
		s1.setCodeName("NC252");
		s1.setUnits(3);
		s1.setGrade("A");
		
		SubjectRecord s2 = new SubjectRecord();
		s2.setName("Data Structure+");
		s2.setCodeName("NC252+");
		s2.setUnits(4);
		s2.setGrade("A+");
		
		SubjectRecord s3 = new SubjectRecord();
		s3.setName("Data Structure++");
		s3.setCodeName("NC252++");
		s3.setUnits(5);
		s3.setGrade("A++");
		
		stackRecord stack = new stackRecord(5);

		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		
		SubjectRecord s4= stack.pop();
		SubjectRecord s5= stack.pop();
		SubjectRecord s6= stack.pop();
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
	
	}
}