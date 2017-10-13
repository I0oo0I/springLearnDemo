package deaultTest;

import org.springframework.beans.factory.annotation.Autowired;

public class Test3 {

	private Test3_2 test3_2 = new Test3_2();
	
	@Autowired
	private Test3_2 test3_1;
	
	public void test3_2(){
		test3_2.add();
		test3_1.add();
	}
}
