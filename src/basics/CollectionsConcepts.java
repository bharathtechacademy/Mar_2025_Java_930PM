package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsConcepts {

	public static void main(String[] args) {
		
		/***** Array  *****/
		
		// Array can store multiple values with similar data type together at one place

		/**** Challenges with Arrays ****/

		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "Meghana";
		empNames[2] = "Deepika";
		
		System.out.println(empNames.length);	

		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed

		/******* Collections Framework *******/

		// Advantages

		// 1. Collections are dynamic in size. that means , no need to declare the size at the beginning
		// 2. Memory will be allocated dynamically based on the data that we are going to add/store
		// 3. Collections allows different data types in same data structure
		// 4. Modifications are allowed
		
		// Major Collection Categories ==> List , Set , Map 
		
		// List ==> ArrayList , LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		
		// Set ==> HashSet, LinkedHashSet, TreeSet
		
		// 1. Set can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. Set can follow dynamic memory allocation
		// 3. Set allows modifications
		// 4. Set won't allow duplicate values
		
		// Map ==> HashMap, LinkedHashMap, TreeMap and Hashtable
		
		// 1. Map can store multiple values with different data type together in the form of Key and Value at one place by allocating the memory dynamically
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map won't allow duplicate Keys , But we can store duplicate values
		
		
		/************************  ArrayList  *************************/
		
		System.out.println("************************  ArrayList  *************************");		
		
		// Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// ArrayList will store values in contiguous memory locations like array
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Aishwarya");
		empNamesArrayList.add("Asokan");
		empNamesArrayList.add("Anu");
		empNamesArrayList.add("Ashwini");
		empNamesArrayList.add("Bala");
		empNamesArrayList.add("ABC");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("ABC");
		System.out.println("Size of the ArrayList is :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		System.out.println(empNamesArrayList.get(2));
		
		/************************  LinkedList  *************************/
		
		System.out.println("************************  LinkedList  *************************");		
		
		// Syntax to Initialize: List<DataType> variable = new LinkedList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);	
		
		// ArrayList will not store values in contiguous memory locations, instead it store in random locations and later it will link each value 
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Aishwarya");
		empNamesLinkedList.add("Asokan");
		empNamesLinkedList.add("Anu");
		empNamesLinkedList.add("Ashwini");
		empNamesLinkedList.add("Bala");
		empNamesLinkedList.add("ABC");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("ABC");
		System.out.println("Size of the LinkedList is :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		System.out.println(empNamesLinkedList.get(2));


	}

}
