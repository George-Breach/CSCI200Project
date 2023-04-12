import java.util.Vector;

public class classSets {
	private Vector<Character> set = new Vector<Character>(); //New vector 
	String nameOfSet; 										 //Unique name for this vector
	
	
	//Add element into the set
	public void addElement(char element) {					
		this.set.add(element);
	}

	//Print the name of the set and what it contains.
	public void printSet() {
		System.out.println(getName() + " = " + this.set);
	}
	
	//Returns the set as a vector.
	public Vector<Character> getSet() {
		return this.set;
	}
	
	//Prints the set name and its cardinality (size).
	public void printCardinality() {
		System.out.println("|" + getName() + "| = " + this.set.size());
	}
	
	//Set the name of a set to a string.
	public void setName(int classNum) {

		this.nameOfSet = getChar(classNum);
	}
	
	//Get the name of the set.
	public String getName() {
		return this.nameOfSet;
	}
	
	public String getChar(int classNum) {
		String value = "A";
		
		switch(classNum) {
			case 1: 
				value= "B";
				break;
			case 2: 
				value= "C";
				break;
			case 3: 
				value= "D";
				break;
			case 4: 
				value= "E";
				break;
			case 5: 
				value= "F";
				break;
			case 6: 
				value= "G";
				break;
			case 7: 
				value= "H";
				break;
			case 8: 
				value= "I";
				break;
			case 9: 
				value= "J";
				break;
			case 10: 
				value= "K";
				break;
			case 11: 
				value= "L";
				break;
			case 12: 				
				value= "M";
				break;
		}
		
		return value;
		
	}



} //end class
	
	

