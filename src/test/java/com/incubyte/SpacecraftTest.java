package com.incubyte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SpacecraftTest {
	@Test
	//methods should be public
	//sample test case for initial testing that worked
	public void demoTestMethod()
	{
		assertTrue(true);
	}
	
	//Different possiblities provided
	@Parameterized.Parameters
    public static Collection<Object[]> dataForMoveForward() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0, Direction.N, "f", "(0, 1, 0)", Direction.N},
                {1, 0, 1, Direction.E, "f", "(2, 0, 1)", Direction.E},
                {0, 0, 0, Direction.W, "f", "(-1, 0, 0)", Direction.W}
        });
    }
	
	private int startX;
	private int startY;
	private int startZ;
	private Direction startDirection;
	private String command;
	private String expectedPosition;
    private Direction expectedDirection;
    
    public SpacecraftTest(int startX, int startY, int startZ, Direction startDirection,
            String command, String expectedPosition, Direction expectedDirection) {
			this.startX = startX;
			this.startY = startY;
			this.startZ = startZ;
			this.startDirection = startDirection;
			this.command = command;
			this.expectedPosition = expectedPosition;
			this.expectedDirection = expectedDirection;
    }
    
    @Test
    public void testMoveForward() {
        for (Object[] testData : dataForMoveForward()) {
            int startX = (Integer) testData[0];
            int startY = (Integer) testData[1];
            int startZ = (Integer) testData[2];
            Direction startDirection = (Direction) testData[3];
            String command = (String) testData[4];
            String expectedPosition = (String) testData[5];
            Direction expectedDirection = (Direction) testData[6];

            Spacecraft spacecraft = new Spacecraft(startX, startY, startZ, startDirection);
            
            if(command == "f") {
            	
            	spacecraft.moveForward();
            	assertEquals(expectedPosition, spacecraft.getPosition());
                assertEquals(expectedDirection, spacecraft.getDirection());
            }

            
        }
    }
	
	//Initially all failed
	
	//Initially failed: Expected (0,1,0) Actual (0,0,0)
	/*@Test
	public void testMoveForward()
	{
   
	    // Test case 1
	    spacecraft.moveForward();
	    assertEquals("(0, 1, 0)", spacecraft.getPosition());
	    assertEquals(Direction.N, spacecraft.getDirection());

	    // Test case 2
	    spacecraft.setPosition(1, 0, 1);
	    spacecraft.setDirection(Direction.E);
	    spacecraft.moveForward();
	    assertEquals("(2, 0, 1)", spacecraft.getPosition());
	    assertEquals(Direction.E, spacecraft.getDirection());

	    // Test case 3
	    spacecraft.setPosition(0, 0, 0);
	    spacecraft.setDirection(Direction.W);
	    spacecraft.moveForward();
	    assertEquals("(-1, 0, 0)", spacecraft.getPosition());
	    assertEquals(Direction.W, spacecraft.getDirection());
	}*/
	
}
