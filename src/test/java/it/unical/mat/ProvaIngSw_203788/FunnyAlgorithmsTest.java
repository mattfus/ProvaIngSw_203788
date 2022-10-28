package it.unical.mat.ProvaIngSw_203788;

import static org.junit.Assert.assertEquals;

import org.joda.time.JodaTimePermission;
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
	public static void beforeClass() {
		System.out.println();
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
		
		assertEquals(1, fa.binarySearch(array, target));
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
	public void swapThrowsNullPointer() {
		fa.swap(null, 3, 4);
	}
	
	@SuppressWarnings("static-access")
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void swapThrowsArrayIndexOut() {
		int[] array = {1,3,4,5};
		fa.swap(array, 0, 10);
	}
	
	//TEST SELECTION SORT
	@Test
	public void selectionSortCrescenteWorksFine() {
		int[] array = {5,2,3,9,6};
		int order = 1;
		
		int[] expected = {2,3,5,6,9};
		
		assertEquals(expected, fa.selectionSort(array, 0));
	}
	
	@Test
	public void selectionSortDecrescenteWorksFine() {
		int[] array = {5,2,3,9,6};
		int order = 0;
		
		int[] expected = {9,6,5,3,2};
		
		assertEquals(expected, fa.selectionSort(array, order));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void selectionSortThrowsIllegalArgument() {
		int[] array = {1,5,3,8};
		int order = 2;
		fa.selectionSort(array, order);
	}
	
	@Test(expected = NullPointerException.class)
	public void selectionSortThrowsNullPointer() {
		int[] array = null;
		int order = 1;
		fa.selectionSort(array, order);
	}
	
	
	@AfterClass
	public static void afterAllTests() {
		//stop time with joda time
		System.out.println("Test terminati");
	}
}
