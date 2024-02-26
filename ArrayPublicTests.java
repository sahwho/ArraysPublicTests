import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/*
 * @Author Vikash Sahu
 * This code contains public tests cases (JUnit 4)
 * for the Arrays Methods Lab.
 */

public class ArrayPublicTests {

	@Test
	public void testContainsTrue() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3};
		assertTrue(Main.containsElement(3, arr));
	}
	
	@Test
	public void testMinElement() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3};
		assertEquals(-1, Main.minElement(arr));
	}
	
	@Test
	public void testIsSorted() {
		int[] arr = {1, 2, 3, 4, 5};
		assertTrue(Main.isSorted(arr));
	}
	
	@Test
	public void testModeCount1() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3, 3, 3};
		assertEquals(4, Main.modeCount(arr));
	}
	
	@Test
	public void testReverseArray1() {
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = {5, 4, 3, 2, 1};
		assertTrue(Arrays.equals(reversed, Main.reverseArray(arr)));
	}
	
	@Test
	public void testReverseArrayInPlace1() {
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = {5, 4, 3, 2, 1};
		Main.reverseArrayInPlace(arr);
		assertTrue(Arrays.equals(reversed, arr));
	}
	
	@Test
	public void testValuesAreUnique() {
		int[] arr = {7, -1, 2, 90, 3, 10, 73, 92};
		assertTrue(Main.valuesAreUnique(arr));
	}
	
	@Test
	public void testCountInRange1() {
		int[] arr = {7, 1, 4, 2, 3};
		assertEquals(2, Main.countInRange(arr, 2, 3));
	}
}
