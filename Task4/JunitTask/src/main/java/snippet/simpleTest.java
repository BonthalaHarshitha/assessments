package snippet;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class simpleTest {
	@BeforeClass
	public static void setUpClass(){
		
	}
	@Before 
	public void setUp() {
		
	}
	@Test
	public void test() {
		Snippet snippet=new Snippet();
		int number1=100;
		int number2=5;
		int actualValue=snippet.product(number1,number2);
		int expectedValue=500;
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void division() {
		
	}
	@After
	public void tearDown() {
		
	}
	@AfterClass
	public static void tearDownClass() {
		
	}
}
