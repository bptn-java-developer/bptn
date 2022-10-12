package com.bptn.course.week4.wednesday;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTest {

	@BeforeClass
	public static void onceExecutedBeforeAll() {

		/*
		 * For example, in this method we can create the connection to the database.
		 */
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
	}

	@Before
	public void executedBeforeEach() {
		System.out.println("@Before: executedBeforeEach");
	}

	@After
	public void executedAfterEach() {
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void testFindMax() {

		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

	@Test(timeout = 5000)
	public void testFindMax2() {

		assertEquals(1000, Calculation.longProcess());
	}

	@Test
	public void testFindMax3() {

		assertTrue(Calculation.compare(4,4));
		assertFalse(Calculation.compare(5,4));
		assertNull(Calculation.getObject(null));
		assertNotNull(Calculation.getObject(new Object()));
	}

	@Test
	public void testFindMax4() {
		
		boolean result = Calculation.compare(4,4);
		
		if (result) {
			fail("The test was unsuccessful");
		}
	}

	@AfterClass
	public static void onceExecutedAfterAll() {

		/*
		 * For example, in this method we can close the connection to the database.
		 */
		System.out.println("@AfterClass: onceExecutedAfterAll");
	}
}
