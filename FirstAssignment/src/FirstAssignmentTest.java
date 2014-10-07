import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FirstAssignmentTest {

	@Test
	public void testFactor() {
		ArrayList<Integer> factorsExpected = new ArrayList<Integer>();
		ArrayList<Integer> factorsActual = new ArrayList<Integer>();
		factorsExpected.add(4);
		factorsExpected.add(5);
		factorsExpected.add(2);
		factorsExpected.add(10);
		factorsExpected.add(1);
		factorsExpected.add(20);
		factorsActual = Firstassignment.factor(20);
		Assert.assertEquals(factorsExpected, factorsActual);
	}

	@Test
	public void testuserInputToArray() {
		String[] testInputs = new String[2];
		String[] returnInput = new String[2];
		testInputs[0] = "24";
		testInputs[1] = "75";
		Assert.assertTrue(Arrays.equals(testInputs, Firstassignment.userInputToArray(returnInput, "24 75")));
	}
	@Test
	public void testParseInput() {
		Assert.assertEquals(0, Firstassignment.parseInput("Banana"));
		Assert.assertEquals(45, Firstassignment.parseInput("45"));
		Assert.assertEquals(0, Firstassignment.parseInput("105"));
	}
	@Test
	public void testgreaterCommonDenominator() {
		ArrayList<Integer> firstNumberFactors = new ArrayList<Integer>();
		ArrayList<Integer> secondNumberFactors = new ArrayList<Integer>();
		Assert.assertEquals(12, Firstassignment.greaterCommonDenominator(12, 24, firstNumberFactors, secondNumberFactors));
		Assert.assertEquals(1, Firstassignment.greaterCommonDenominator(100, 1, firstNumberFactors, secondNumberFactors));
	}
}