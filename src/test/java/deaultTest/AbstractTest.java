package deaultTest;

public abstract class AbstractTest {

	private String name;
	
	public String age;
	
	public static String sex = "0";
	
	int tt = 0;
	
	void del() {
		System.out.println("继承");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
