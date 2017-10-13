package deaultTest;

public class MainTest {

	public static void main(String [] args){
		
		AbstractTest test1 = new ExtendTest();
		System.out.println(test1.age);
		System.out.println(test1.tt);
		test1.del();
		System.out.println(test1.sex);
		System.out.println(test1 instanceof AbstractTest);
		System.out.println("================================");
		
		InterfaceTest test2 = new ImplementTest();
		InterfaceTest2 test3 = new ImplementTest();
		System.out.println(test2.AGE);
		System.out.println(test2.name);
		System.out.println(test2.sex);
		test2.add();
		test3.del();
		System.out.println(test2 instanceof InterfaceTest);
	}
}
