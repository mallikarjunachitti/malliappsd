import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestA {
	@Test
	public void Testmet()
	{
		assertEquals(33,Calculations.findMax (new int[]{1,3,4,33}));
		assertEquals(-1,Calculations.findMax(new int[]{-1,-3,-4,-2}));
		System.out.println("Calculations 1");
	}
	@Test(timeout=1000)
	public void Tessss()
	{
		assertEquals(27,Calculations.cube(3));
		System.out.println("Calculations 2");
	}
	@BeforeClass
	public static void befor()
	{
		System.out.println("fuck ass beforeClass");
		
	}
	@Before
	public  void befor1()
	{
		System.out.println("fuck ass before");
		
	}

}
