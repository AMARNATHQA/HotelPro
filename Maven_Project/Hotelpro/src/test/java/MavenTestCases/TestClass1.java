package MavenTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
   
	
	@Test()
	public static void Test1(){
		
		System.out.println("This is Test1");
		Assert.assertEquals(15, 20);
	}
	@Test()
	public static void Test2(){
		
		System.out.println("This is Test2");
		Assert.assertEquals(20, 20);
	}
	@Test()
	public static void Test3(){
		
		System.out.println("This is Test3");
		Assert.assertEquals(20, 20);
	}
	@Test()
	public static void Test4(){
		
		System.out.println("This is Test4");
		Assert.assertEquals(15, 20);
	}
	@Test()
	public static void Test5(){
		
		System.out.println("This is Test5");
		Assert.assertEquals(15, 20);
	}
}
