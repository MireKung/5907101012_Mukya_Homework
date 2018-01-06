package th.Mukya;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
public class words {
	protected String word,type,meaning;
	
	public words(){}
	
	public words(String word,String type ,String meaning){
		this.word=word;
		this.type=type;
		this.meaning=meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String toString(){
		return (word+" type : "+type+" definition : "+meaning);
	} }