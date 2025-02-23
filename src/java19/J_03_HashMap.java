package java19;

import java.util.HashMap;
import java.util.Map;

public class J_03_HashMap {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<Integer, String> employeeMap = new HashMap<>();

		// Add key-value pairs
		employeeMap.put(101, "Dong");
		employeeMap.put(102, "Henry");
		employeeMap.put(103, "YuDo");
		employeeMap.put(104, "John");
		employeeMap.put(102, "Joey"); // Overwrites Henry with Joey

		System.out.println("Employee Map: " + employeeMap);

		// Get a value by key
		System.out.println("Employee with ID 104: " + employeeMap.get(104));

		// Check if a key or value exists
		System.out.println("Contains key 105? " + employeeMap.containsKey(105));
		System.out.println("Contains value 'Henry'? " + employeeMap.containsValue("Henry"));

		// Remove an entry by key
		employeeMap.remove(104);
		System.out.println("After removing ID 104: " + employeeMap);

		// Iterate over keys
		System.out.print("Keys: ");
		for (Integer key : employeeMap.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();

		// Iterate over values
		System.out.print("Values: ");
		for (String value : employeeMap.values()) {
			System.out.print(value + " ");
		}
		System.out.println();

		// Iterate over key-value pairs
		System.out.println("Entries:");
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		// Get the size of the HashMap
		System.out.println("Size of HashMap: " + employeeMap.size());

		// Clear all entries
		employeeMap.clear();
		System.out.println("After clearing: " + employeeMap);
		System.out.println("Is HashMap empty?: " + employeeMap.isEmpty());
	}

}
