import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class GUI extends JFrame implements ActionListener {
	
	// JFrames are a container that represents a window.
	// Buttons are declared here so they can be referred to by any method in the class.
	private JButton ListSet, Cardinality, Combination, isSetEqual, isSubset, Union, Intersection, Difference, CartesianProduct, addSet, Quit, removeSet, back, modifyOneSet, compareTwoSets;
	
	//Home Page = Quit, modifyOneSet, compareTwoSets
	//modifyOneSet Page = Quit, back, ListSet, Cardinality, Combination, addSet
	//compareTwoSets Page = Quit, back, isSetEqual, Union, Intersection, Difference, CartesianProduct, isSubset
	//
	//
	
	// The place where the infix expression is displayed.
	private JLabel display = new JLabel("                                "); 
	private JPanel button_holder = new JPanel();

	String currentInfix = "";
	String empty_string = "                                ";
	
	public GUI()
	{
		super("Project 2 - Sets and Set Operations"); // Changes the text in the title bar of the window
		setSize(new Dimension(750, 750)); // Sets the size of the window
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Instantiates all buttons
		ListSet = new JButton("List a set?");
		Cardinality = new JButton("Cardinality of a set?");
		Combination = new JButton("Combination of a set?");
		isSetEqual = new JButton("Are two sets Equal?");
		isSubset = new JButton("Is the set a subset?");
		Union = new JButton("List the Union of two sets.");
		Intersection = new JButton("List the Intersection of two sets.");
		Difference = new JButton("List the Difference of two sets.");
		CartesianProduct = new JButton("List the CartesianProduct of the set?");
		addSet = new JButton("Add a set.");
		Quit = new JButton("Quit");
		removeSet = new JButton("Remove a set.");
		back = new JButton("Back");
		modifyOneSet = new JButton("modifyOneSet");
		compareTwoSets = new JButton("compareTwoSets");
		
		// ActionListener definitions
		ListSet.addActionListener(this);
		Cardinality.addActionListener(this);
		Combination.addActionListener(this);
		isSetEqual.addActionListener(this);
		isSubset.addActionListener(this);
		Union.addActionListener(this);
		Intersection.addActionListener(this);
		Difference.addActionListener(this);
		CartesianProduct.addActionListener(this);
		addSet.addActionListener(this);
		Quit.addActionListener(this);
		removeSet.addActionListener(this);
		back.addActionListener(this);
		modifyOneSet.addActionListener(this);
		compareTwoSets.addActionListener(this);

		// Setting action commands
		ListSet.setActionCommand("0");
		Cardinality.setActionCommand("1");
		Combination.setActionCommand("2");
		isSetEqual.setActionCommand("3");
		isSubset.setActionCommand("4");
		Union.setActionCommand("5");
		Intersection.setActionCommand("6");
		Difference.setActionCommand("7");
		CartesianProduct.setActionCommand("8");
		addSet.setActionCommand("9");
		Quit.setActionCommand("10");
		removeSet.setActionCommand("11");
		back.setActionCommand("home page");
		modifyOneSet.setActionCommand("page 1");
		compareTwoSets.setActionCommand("page 2");

		display.setMinimumSize(new Dimension(180, 20));
		add(display, BorderLayout.NORTH);
		
		// Creates a 5-high, 4-wide grid for the buttons.
		button_holder.setLayout(new GridLayout(5, 5)); //5 rows 4 columns
		setVisible(false);
		
		button_holder.add(modifyOneSet);
		button_holder.add(compareTwoSets);
		button_holder.add(Quit);
		setVisible(true);
		
		// Adding our buttons into the JFrame
		/*
		button_holder.add(ListSet);
		button_holder.add(Cardinality);
		button_holder.add(Combination);
		button_holder.add(isSetEqual);
		button_holder.add(isSubset);
		button_holder.add(Union);
		button_holder.add(Intersection);
		button_holder.add(Difference);
		button_holder.add(CartesianProduct);
		button_holder.add(addSet);
		button_holder.add(Quit);
		button_holder.add(removeSet);
		button_holder.add(back);
		button_holder.add(modifyOneSet);
		button_holder.add(compareTwoSets);
		*/
		
		add(button_holder, BorderLayout.CENTER);

		//Add code here make the calculator visable // So that we can see the calculator
	} // end constructor
	
	public void pageSelect(String input) {
		
		button_holder.removeAll();
		setVisible(false);
		if (input == "10") { //if quit
			System.exit(0);
			
		} else if (input == "home page"){ //if back, go home page
			button_holder.add(modifyOneSet);
			button_holder.add(compareTwoSets);
			button_holder.add(Quit);
			
		} else if (input == "page 1") { //go to modify one set
			button_holder.add(ListSet);
			button_holder.add(Cardinality);
			button_holder.add(Combination);
			button_holder.add(addSet);
			button_holder.add(removeSet);
			button_holder.add(back);
			button_holder.add(Quit);
			
		} else if (input == "page 2") { //go to compare two sets
			button_holder.add(isSetEqual);
			button_holder.add(isSubset);
			button_holder.add(Union);
			button_holder.add(Intersection);
			button_holder.add(Difference);
			button_holder.add(CartesianProduct);
			button_holder.add(back);
			button_holder.add(Quit);
			
		}
		
		setVisible(true);
		
		return;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int numberOfSets = 0;
		String cmd = e.getActionCommand();
		
		switch(cmd)
		{
		case "10":
		case "home page":
		case "page 1":
		case "page 2":
		pageSelect(cmd);
		break;
		
		}
		
		
		/*
		classSets set1 = new classSets();
		classSets set2 = new classSets();
		
		//Set their names properly.
		set1.setName("A"); 
		set2.setName("B");	
		
		//Set their values properly.
		set1.addElement('1'); set1.addElement('2'); set1.addElement('3'); 
		set2.addElement('1'); set2.addElement('2'); 

		//Test printing out the sets using the classSets class.
		set1.printSet();
		set2.printSet();
		System.out.println();	
		
		//Test printing the Cardinality of the set using the classSets class.
		set1.printCardinality();
		set2.printCardinality();
		System.out.println();	
		
		//Test various methods and stuff.
		equals(set1, set2);
		isSubset(set1, set2);
		isSubset(set2, set1);
		System.out.println();	
		
		union(set1, set2);
		*/
		System.out.println();	
		
	} // end actionPerformed
	
	public static void equals(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to compare.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		
		//Check if the two vectors are equal, and print the result.
		if (firstOne.equals(secondOne)) {
			System.out.println(firstSet.getName() + " = " + secondSet.getName() + ": true");
		} else {
			System.out.println(firstSet.getName() + " = " + secondSet.getName() + ": false");
		}
	}
	
	public static void union(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to get values from, and make set the union to newVector.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		Vector<Character> newVector = new Vector<Character>();
		
		newVector.addAll(firstOne); 	//Add all of the first set into the new vector.
		secondOne.removeAll(firstOne);	//Remove all of the first elements from the second Set.
		newVector.addAll(secondOne);	//Add the remaining second Set into the new Vector.

		System.out.println("Union(" + firstSet.getName() + "," + secondSet.getName() + ") = " + newVector);
	}
	
	public static void isSubset(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to compare.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		
		//Check if the first vector is inside the second vector and print result.
		if (secondOne.containsAll(firstOne)) {
			System.out.println(firstSet.getName() + " is a subset of " + secondSet.getName() + ": true" );
		} else {
			System.out.println(firstSet.getName() + " is a subset of " + secondSet.getName() + ": false" );
		}
	}
	
	
	public static void main(String[] args) {
		GUI gui = new GUI();	
	}


	
}
