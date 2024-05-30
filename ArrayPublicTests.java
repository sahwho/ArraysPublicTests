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
		assertTrue(ArrayOfSunshine.containsElement(arr, 3));
	}

	@Test
	public void testIndexOfPublic() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3};
		assertEquals(2, ArrayOfSunshine.indexOf(arr, 2));
	}

	@Test
	public void testMinElement() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3};
		assertEquals(-1, ArrayOfSunshine.minElement(arr));
	}

	@Test
	public void testIsSorted() {
		int[] arr = {1, 2, 3, 4, 5};
		assertTrue(ArrayOfSunshine.isSorted(arr));
	}

	@Test
	public void testModeCount1() {
		int[] arr = {7, -1, 2, 90, 2, 3, 10, 73, 92, 3, 3, 3};
		assertEquals(4, ArrayOfSunshine.modeCount(arr));
	}

	@Test
	public void testReverseArray1() {
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = {5, 4, 3, 2, 1};
		assertTrue(Arrays.equals(reversed, ArrayOfSunshine.reverseArray(arr)));
	}

	@Test
	public void testReverseArrayInPlace1() {
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = {5, 4, 3, 2, 1};
		ArrayOfSunshine.reverseArrayInPlace(arr);
		assertTrue(Arrays.equals(reversed, arr));
	}

	@Test
	public void testValuesAreUnique() {
		int[] arr = {7, -1, 2, 90, 3, 10, 73, 92};
		assertTrue(ArrayOfSunshine.valuesAreUnique(arr));
	}

	@Test
	public void testCountInRange1() {
		int[] arr = {7, 1, 4, 2, 3};
		assertEquals(2, ArrayOfSunshine.countInRange(arr, 2, 3));
	}

	@Test
	public void testPrettify1() {
		int[] arr = {7, -1, 2, 90, 3, 10, 73, 92};
		assertEquals("[7, -1, 2, 90, 3, 10, 73, 92]", ArrayOfSunshine.prettify(arr));
	}
}
