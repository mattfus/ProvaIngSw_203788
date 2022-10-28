package it.unical.mat.ProvaIngSw_203788;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FunnyAlgorithmsTest {
	
	private static FunnyAlgorithms fa;
	
	
	@Before
	public void before() {
		fa = new FunnyAlgorithms();
	}
	
	@BeforeClass
	public void beforeClass() {
		//take time with joda time
	}
	
	@Test
	public void stringToIntConverterWorksFine() {
		assertEquals(1, fa.stringToIntConverter("1"));
		assertEquals(10, fa.stringToIntConverter("10"));
		assertEquals(-55, fa.stringToIntConverter("-55"));
		assertEquals(-32768, fa.stringToIntConverter("-32768"));
		assertEquals(32767, fa.stringToIntConverter("32767"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterThrowsException() {
		fa.stringToIntConverter("banana33");
	}
	
}
