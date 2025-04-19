package loopStatements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachLoop {

	// When we want to repeat the execution based on pre-defined list of values

	public static void main(String[] args) {

		String[] empNames = new String[3]; // This can hold 3 employee names
		empNames[0] = "Bharath";
		empNames[1] = "Meghana";
		empNames[2] = "Deepika";
		
//		System.out.println(empNames[0]);
//		System.out.println(empNames[1]);
//		System.out.println(empNames[2]);
		
//		for(int i=0;i<empNames.length;i++) {
//			System.out.println(empNames[i]);
//		}
		
		
		for(String emp:empNames) {
			System.out.println(emp);
		}
		
		
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
		
		for(String hash:empNamesHashSet) {
			System.out.println(hash);
		}
		
		
		/*************/
		
		// Below Product1Map details are stored using Map(HashMap)

				Map<String, String> Product1Map = new HashMap<String, String>();
				Product1Map.put("Product ID", "P001");
				Product1Map.put("Name", "Laptop");
				Product1Map.put("Category", "Electronics");
				Product1Map.put("Price", "$1,200");
				Product1Map.put("Stock Quantity", "50");
				Product1Map.put("Supplier", "Tech Supplies");
				Product1Map.put("Warranty", "2 years");
				Product1Map.put("Rating", "4.5");
				Product1Map.put("Manufacturing Date", "15-01-2023");
				Product1Map.put("Expiry Date", "15-01-2025");
				System.out.println("Product 1 details :" + Product1Map);

				// Below Product2Map details are stored using Map(HashMap)

				Map<String, String> Product2Map = new HashMap<String, String>();
				Product2Map.put("Product ID", "P002");
				Product2Map.put("Name", "Desk Chair");
				Product2Map.put("Category", "Furniture");
				Product2Map.put("Price", "$150");
				Product2Map.put("Stock Quantity", "200");
				Product2Map.put("Supplier", "Office Depot");
				Product2Map.put("Warranty", "1 year");
				Product2Map.put("Rating", "4");
				Product2Map.put("Manufacturing Date", "10-02-2023");
				Product2Map.put("Expiry Date", "N/A");
				System.out.println("Product 2 details :" + Product2Map);

				// Below Product3Map details are stored using Map(HashMap)

				Map<String, String> Product3Map = new HashMap<String, String>();
				Product3Map.put("Product ID", "P003");
				Product3Map.put("Name", "Coffee Maker");
				Product3Map.put("Category", "Kitchen");
				Product3Map.put("Price", "$75");
				Product3Map.put("Stock Quantity", "100");
				Product3Map.put("Supplier", "KitchenWorld");
				Product3Map.put("Warranty", "6 months");
				Product3Map.put("Rating", "4.2");
				Product3Map.put("Manufacturing Date", "20-03-2023");
				Product3Map.put("Expiry Date", "20-03-2024");
				System.out.println("Product 3 details :" + Product3Map);

				// Product1Map,Product1Map,Product1Map details are added under List (productList)

				List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
				productList.add(Product1Map);
				productList.add(Product2Map);
				productList.add(Product3Map);
				
				for(Map<String, String> product:productList) {
					System.out.println(product);
				}

	}

}
