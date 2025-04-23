package access.mod.pack1;

public class AccessMod1 {

	private String name ;

	private int empId() {
		return 1234;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		System.out.println(obj.empId());
	}

}
