package HomeWork;

import java.util.Scanner;
public class Node {
	protected int data;
	protected Node link;
	
	public Node(){
		link = null;
		data = 0;
	}
	public Node(int data,Node link){
		this.data = data;
		this.link=link;
	}
	 public void setLink(Node link){
	        this.link = link;
	    	} 
	 
	    public void setData(int data){
	        this.data = data;
	    	}
	    
	    public Node getLink(){
	        return link;
	    	}
	    
	    public int getData(){
	        return data;
	    	}
}