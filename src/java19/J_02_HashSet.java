package java19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class J_02_HashSet {

	public static void main(String[] args) {
		// Create a HashSet
		HashSet<Object> hS = new HashSet<>();

		// Add elements to HashSet
		hS.add(1310);
		hS.add(23.2);
		hS.add(true);
		hS.add('J');
		hS.add(null); // HashSet allows only one null value
		hS.add("SDET");
		hS.add(null); // Duplicate null will not be added

		System.out.println("Initial set: " + hS);

		// Convert a HashSet to an ArrayList (Order is not guaranteed) - Get an element by index
		ArrayList<Object> aL = new ArrayList<Object>(hS);
		System.out.println("Convert to list: " + aL);
		System.out.println("Element of list at index [2]: " + aL.get(2));

		// Remove an element
		hS.remove(23.2);
		System.out.println("After removing '23.2': " + hS);

		// Get the size of the set
		System.out.println("Size of set: " + hS.size());

		// Iterate using for-each loop
		System.out.print("Iterate using for-each loop: ");
		for (Object e : hS) {
			System.out.print(e + " ");
		}
		System.out.println();

		// Iterate using Iterator
		System.out.print("Iterate using Iterator: ");
		Iterator<Object> iterator = hS.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Check if an element exists
		System.out.println("Contains 'SDET'? " + hS.contains("SDET"));

		// Clear the HashSet
		hS.clear();
		System.out.println("After clearing: " + hS);
		System.out.println("Is set empty?: " + hS.isEmpty());
	}

}
