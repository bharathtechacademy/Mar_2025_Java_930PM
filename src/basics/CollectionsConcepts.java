package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		
		// Hash ==> Random
		
		
		/************************  ArrayList  *************************/
		
		/*********** Wrapper Classes ************/
		//byte --> Byte
		//short --> Short
		//int --> Integer
		//long --> Long
		//float --> Float
		//double --> Double
		//boolean --> Boolean
		//char --> Character
		
		List<Integer> empIds = new ArrayList<Integer>();
		empIds.add(123);
		empIds.add(124);
		empIds.add(125);
		
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
		
		// LinkedList will not store values in contiguous memory locations, instead it store in random locations and later it will link each value 
		
		// Order of Storing : Insertion Order
		// Storing Nulls :Allowed
		
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
		
		/************************  HashSet  *************************/
		
		System.out.println("************************  HashSet  *************************");		
		
		// Syntax to Initialize: Set<DataType> variable = new HashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// HashSet will store values in contiguous memory locations like array
		
		// Order of Storing : Random Order
		// Storing Nulls :Allowed
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Aishwarya");
		empNamesHashSet.add("Asokan");
		empNamesHashSet.add("Anu");
		empNamesHashSet.add("Ashwini");
		empNamesHashSet.add("Bala");
		empNamesHashSet.add("ABC");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("ABC");
		System.out.println("Size of the HashSet is :"+empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/************************  LinkedHashSet  *************************/
		
		System.out.println("************************  LinkedHashSet  *************************");		
		
		// Syntax to Initialize: Set<DataType> variable = new LinkedHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// LinkedHashSet will store values in contiguous memory locations like array
		
		// Order of Storing : Insertion Order
		// Storing Nulls :Allowed
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Aishwarya");
		empNamesLinkedHashSet.add("Asokan");
		empNamesLinkedHashSet.add("Anu");
		empNamesLinkedHashSet.add("Ashwini");
		empNamesLinkedHashSet.add("Bala");
		empNamesLinkedHashSet.add("ABC");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("ABC");
		System.out.println("Size of the LinkedHashSet is :"+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		System.out.println("************************  TreeSet  *************************");		
		
		// Syntax to Initialize: Set<DataType> variable = new TreeSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// TreeSet will store values in contiguous memory locations like array
		
		// Order of Storing : Ascending Order
		// Storing Nulls :Not Allowed
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Aishwarya");
		empNamesTreeSet.add("Asokan");
		empNamesTreeSet.add("Anu");
		empNamesTreeSet.add("Ashwini");
		empNamesTreeSet.add("Bala");
		empNamesTreeSet.add("ABC");
		empNamesTreeSet.add("Bharath");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("ABC");
		System.out.println("Size of the TreeSet is :"+empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);

		/************************  HashMap  *************************/
		
		System.out.println("************************  HashMap  *************************");		
		
		// Syntax to Initialize: Map<DataType> variable = new HashMap<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// HashMap will store values in contiguous memory locations like array
		
		// Order of Storing : Random Order of Keys
		// Storing Nulls :Null Values Allowed ,Null Keys Allowed
		
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath",123);
		empNamesHashMap.put("Aishwarya",124);
		empNamesHashMap.put("Asokan",124);
		empNamesHashMap.put("Anu",125);
		empNamesHashMap.put("Ashwini",126);
		empNamesHashMap.put("Bala",127);
		empNamesHashMap.put("ABC",128);
		empNamesHashMap.put("Bharath",129);
		empNamesHashMap.put("Bhanu",null);
		empNamesHashMap.put(null,131);
		empNamesHashMap.remove("ABC");
		System.out.println("Size of the HashMap is :"+empNamesHashMap.size());
		System.out.println(empNamesHashMap);
		
		/************************  LinkedHashMap  *************************/
		
		System.out.println("************************  LinkedHashMap  *************************");		
		
		// Syntax to Initialize: Map<DataType> variable = new LinkedHashMap<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// LinkedHashMap will store values in contiguous memory locations like array
		
		// Order of Storing : Insertion Order of Keys
		// Storing Nulls :Null Values Allowed ,Null Keys Allowed
		
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath",123);
		empNamesLinkedHashMap.put("Aishwarya",124);
		empNamesLinkedHashMap.put("Asokan",124);
		empNamesLinkedHashMap.put("Anu",125);
		empNamesLinkedHashMap.put("Ashwini",126);
		empNamesLinkedHashMap.put("Bala",127);
		empNamesLinkedHashMap.put("ABC",128);
		empNamesLinkedHashMap.put("Bharath",129);
		empNamesLinkedHashMap.put("Bhanu",null);
		empNamesLinkedHashMap.put(null,131);
		empNamesLinkedHashMap.remove("ABC");
		System.out.println("Size of the LinkedHashMap is :"+empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap);
		
		/************************  TreeMap  *************************/
		
		System.out.println("************************  TreeMap  *************************");		
		
		// Syntax to Initialize: Map<DataType> variable = new TreeMap<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// TreeMap will store values in contiguous memory locations like array
		
		// Order of Storing : Ascending Order of Keys
		// Storing Nulls :Null Values Allowed ,Null Keys Not Allowed
		
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath",123);
		empNamesTreeMap.put("Aishwarya",124);
		empNamesTreeMap.put("Asokan",124);
		empNamesTreeMap.put("Anu",125);
		empNamesTreeMap.put("Ashwini",126);
		empNamesTreeMap.put("Bala",127);
		empNamesTreeMap.put("ABC",128);
		empNamesTreeMap.put("Bharath",129);
		empNamesTreeMap.put("Bhanu",null);
//		empNamesTreeMap.put(null,131);
		empNamesTreeMap.remove("ABC");
		System.out.println("Size of the TreeMap is :"+empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);
		
		/************************  Hashtable  *************************/
		
		System.out.println("************************  Hashtable  *************************");		
		
		// Syntax to Initialize: Map<DataType> variable = new Hashtable<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the total value : variable.size();
		// Syntax to get the specific value : variable.get(index);
		
		// Hashtable will store values in contiguous memory locations like array
		
		// Order of Storing : Random Order of Keys
		// Storing Nulls :Null Values Not Allowed ,Null Keys Not Allowed
		
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath",123);
		empNamesHashtable.put("Aishwarya",124);
		empNamesHashtable.put("Asokan",124);
		empNamesHashtable.put("Anu",125);
		empNamesHashtable.put("Ashwini",126);
		empNamesHashtable.put("Bala",127);
		empNamesHashtable.put("ABC",128);
		empNamesHashtable.put("Bharath",129);
//		empNamesHashtable.put("Bhanu",null);
//		empNamesHashtable.put(null,131);
		empNamesHashtable.remove("ABC");
		System.out.println("Size of the Hashtable is :"+empNamesHashtable.size());
		System.out.println(empNamesHashtable);
		System.out.println(empNamesHashtable.get("Bharath"));
		
		
//		List<String> List1 = new ArrayList<String>();
//		List1.add("Bharath");
//		List1.add("Aishwarya");
//		List1.add("Asokan");
//		List1.add("Anu");
//		
//		List<String> List2 = new ArrayList<String>();
//		List2.add("Bhanu");
//		List2.add("Ashwini");
//		List2.add("Rudra");
//		List2.add("Shekar");
//		
//		Map<Integer, List<String>> empGroups = new HashMap<Integer, List<String>>();
//		empGroups.put(1, List1);
//		empGroups.put(2, List2);
//		
//		
//		System.out.println(empGroups.get(1).get(1));
//		System.out.println(empGroups.get(2).get(2));
//		
//		
//		Map<String,String> productRow1 = new HashMap<String,String>();
//		productRow1.put("Product ID", "P001");
//		productRow1.put("Name", "Laptop");
//		productRow1.put("Product ID", "P001");
//		productRow1.put("Product ID", "P001");
//		
//		Map<String,String> productRow2 = new HashMap<String,String>();
//		productRow2.put("Product ID", "P002");
//		productRow2.put("Name", "Desk Chair");
//		productRow2.put("Product ID", "P001");
//		productRow2.put("Product ID", "P001");
//		
//		Map<String,String> productRow3 = new HashMap<String,String>();
//		productRow3.put("Product ID", "P003");
//		productRow3.put("Name", "Coffe Maker");
//		productRow3.put("Product ID", "P001");
//		productRow3.put("Product ID", "P001");
//		
//		List<Map<String,String>> productsList = new ArrayList<Map<String,String>>();
//		productsList.add(productRow1);
//		productsList.add(productRow2);
//		productsList.add(productRow3);
//		
//		List<Map<String,String>> studentList = new ArrayList<Map<String,String>>();
//		List<Map<String,String>> empList = new ArrayList<Map<String,String>>();
//		
//		Map<String, List<Map<String,String>>> list = new HashMap<String, List<Map<String,String>>>();
//		list.put("products", productsList);
	}
	

}
