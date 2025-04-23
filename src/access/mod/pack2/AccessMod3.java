package access.mod.pack2;

import access.mod.pack1.AccessMod1;

public class AccessMod3 extends AccessMod1{

	public static void main(String[] args) {
		
		AccessMod1 obj = new AccessMod1();
//		System.out.println(obj.name);
//		System.out.println(obj.empId());
		System.out.println(obj.getName());
		obj.setName("Bharath Reddy");
	}

}
