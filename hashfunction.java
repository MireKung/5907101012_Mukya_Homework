package th.Mukya;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
import java.lang.reflect.Array;
import java.util.*;

public class hashfunction {
	public words[] theArray;
	public static int size;
	
	public hashfunction(){}
	
	public hashfunction(int size){
		this.size=size;
		theArray = new words[size];
		
	}
	
	public void insert(words item){
		String key = item.getWord();
		int hashVal = hashFunc3(key);
		
		while(theArray[hashVal]!=null && theArray[hashVal].getWord()!="-1"){
			++hashVal;
			hashVal%=size;
		}
		theArray[hashVal]= item;
		
	}
	
	public words find(String key){
		int hashVal = hashFunc3(key);
		
		while(theArray[hashVal]!=null){
			
			if(theArray[hashVal].getWord().equals(key)||theArray[hashVal].getWord()==(key))
				return theArray[hashVal];
			
			++hashVal;
			hashVal %=size;
		}
		return null;
	}
	
	public words find(String key,words check){
		int hashVal = hashFunc3(key);
		
		while(theArray[hashVal]!=null){
			
			if(check.getWord().equals("next")){
				return theArray[hashVal+1];
			}
			else if(check.getWord().equals("previous")){
				return theArray[hashVal-1];
			}
			++hashVal;
			hashVal %=size;
		}
		return null;
	}
	
	public words delete(String key){
		int hashVal = hashFunc3(key);
		
		while(theArray[hashVal]!=null){
			if(theArray[hashVal].getWord()==key||theArray[hashVal].getWord().equals(key)){
				words temp = theArray[hashVal];
				theArray[hashVal] = null;
				return temp;
			}
			++hashVal;
			hashVal%=size;
		}
		return null;
	}
	
	public static int hashFunc3(String key){
		int hashVal=0;
		for(int j=0 ; j<key.length();j++){
			int letter = key.charAt(j)-96;
			hashVal = (hashVal*27+letter)%size;
		}
		return hashVal;
	}	}