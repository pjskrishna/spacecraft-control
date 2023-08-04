package com.incubyte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpacecraftTest {
	@Test
	//methods should be public
	//sample test case for initial testing
	public void demoTestMethod()
	{
		assertTrue(true);
	}
	
	
	//Initially failed: Expected (0,1,0) Actual (0,0,0)
	@Test
	public void testMoveForward()
	{
		Spacecraft spacecraft = new Spacecraft(0,0,0,Direction.N);
		
		spacecraft.moveForward();
		assertEquals("(0,1,0)",spacecraft.currentPosition());
	}
}
