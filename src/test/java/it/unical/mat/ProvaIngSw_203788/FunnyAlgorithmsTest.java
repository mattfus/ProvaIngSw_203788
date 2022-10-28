package it.unical.mat.ProvaIngSw_203788;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FunnyAlgorithmsTest {
	
	private static FunnyAlgorithms fa;
	
	
	@Before
	public void before() {
		//inizializzo FunnyAlgorithms
		fa = new FunnyAlgorithms();
	}
	
	@BeforeClass
	public void beforeClass() {
		//take time with joda time
	}
	
			//TEST STRINGTOINTCONVERTER
	@Test
	public void stringToIntConverterWorksFine() {
		assertEquals(1, fa.stringToIntConverter("1"));
		assertEquals(10, fa.stringToIntConverter("10"));
		assertEquals(-55, fa.stringToIntConverter("-55"));
		assertEquals(-32768, fa.stringToIntConverter("-32768"));
		assertEquals(32767, fa.stringToIntConverter("32767"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterThrowsIllegalArgumentException() {
		fa.stringToIntConverter("banana33");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterRangeException() {
		fa.stringToIntConverter("-32769");
	}
	
			//TEST BINARY SEARCH
	@Test
	public void binarySearchWorksFine() {
		int[] array = {1,3,5,6};
		int target = 3;
		
		assertEquals(3, fa.binarySearch(array, target));
	}
	
	@Test
	public void binarySearchShouldFail() {
		int[] array = {1,3,5,6};
		int target = 9;
		
		assertEquals(-1, fa.binarySearch(array, target));
	}
	
	@Test(expected = NullPointerException.class)
	public void binarySearchThrowsException() {
		int target = 9;
		int[] array = null;
		fa.binarySearch(array, target);
	}
	
	//TEST SWAP
	@SuppressWarnings("static-access")
	@Test(expected = NullPointerException.class)
	public void swapDoesntWork() {
		fa.swap(null, 3, 4);
	}
	
	
	//TEST SELECTION SORT
	
	@AfterClass
	public void afterAllTests() {
		//stop time with joda time
		System.out.println("Test terminati");
	}
}
