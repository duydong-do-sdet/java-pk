package java19;

import java.util.ArrayList;
import java.util.Iterator;

public class J_01_ArrayList {

	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<Object> aL = new ArrayList<Object>();

		// Add elements to the ArrayList
		aL.add(1310);
		aL.add(23.2);
		aL.add(true);
		aL.add('J');
		aL.add(null);
		aL.add("SDET");

		System.out.println("Initial list: " + aL);

		// Add an element at a specific index
		aL.add(1, null);
		System.out.println("After adding: " + aL);

		// Get an element by index
		System.out.println("Element at index [1]: " + aL.get(1));

		// Update an element
		aL.set(1, "Java");
		System.out.println("After updating index [1]: " + aL);

		// Remove an element
		aL.remove(23.2);
		System.out.println("After removing '23.2': " + aL);

		// Get the size of the list
		System.out.println("Size of list: " + aL.size());

		// Iterate using for-each loop
		System.out.print("Iterate using for-each loop: ");
		for (Object e : aL) {
			System.out.print(e + " ");
		}
		System.out.println();

		// Iterate using Iterator
		System.out.print("Iterate using Iterator: ");
		Iterator<Object> iterator = aL.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Check if an element exists
		System.out.println("Contains 'SDET'? " + aL.contains("SDET"));

		// Clear the list
		aL.clear();
		System.out.println("After clearing: " + aL);
		System.out.println("Is list empty?: " + aL.isEmpty());
	}

}
