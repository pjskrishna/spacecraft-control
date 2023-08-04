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
	
	//Different possibilities provided for all types of commands here 
	@Parameterized.Parameters
    public static Collection<Object[]> dataForMoveForward() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0, Direction.N, "f", "(0, 1, 0)", Direction.N},
                {1, 0, 1, Direction.E, "f", "(2, 0, 1)", Direction.E},
                {0, 0, 0, Direction.W, "f", "(-1, 0, 0)", Direction.W},
                {0, 0, 0, Direction.N, "f", "(0, 1, 0)", Direction.S},
                {-1, -1, -1, Direction.S, "f", "(-1, -1, -2)", Direction.S},
                {2, -3, 4, Direction.W, "f", "(2, -3, 5)", Direction.W},
                {0, 0, 0, Direction.E, "f", "(1, 0, 0)", Direction.E},
                {3, 5, 1, Direction.S, "f", "(3, 5, 0)", Direction.S},
                
                {0, 0, 0, Direction.N, "b", "(0, -1, 0)", Direction.N},
                {1, 0, 1, Direction.E, "b", "(0, 0, 1)", Direction.E},
                {0, 0, 0, Direction.W, "b", "(1, 0, 0)", Direction.W},
                {0, 0, 0, Direction.N, "b", "(0, -1, 0)", Direction.S},

                {-1, -1, -1, Direction.S, "b", "(-1, -1, -2)", Direction.S},
                {2, -3, 4, Direction.W, "b", "(2, -3, 3)", Direction.W},
                {0, 0, 0, Direction.E, "b", "(-1, 0, 0)", Direction.E},
                {3, 5, 1, Direction.S, "b", "(3, 5, 2)", Direction.S},

                {0, 0, 0, Direction.N, "l", "(0, 0, 0)", Direction.W},
                {1, 0, 1, Direction.E, "l", "(1, 0, 1)", Direction.N},
                {0, 0, 0, Direction.W, "l", "(0, 0, 0)", Direction.S},
                {0, 0, 0, Direction.N, "l", "(0, 0, 0)", Direction.E},

                {-1, -1, -1, Direction.S, "l", "(-1, -1, -1)", Direction.E},
                {2, -3, 4, Direction.W, "l", "(2, -3, 4)", Direction.S},
                {0, 0, 0, Direction.E, "l", "(0, 0, 0)", Direction.N},
                {3, 5, 1, Direction.S, "l", "(3, 5, 1)", Direction.W},

                {0, 0, 0, Direction.N, "r", "(0, 0, 0)", Direction.E},
                {1, 0, 1, Direction.E, "r", "(1, 0, 1)", Direction.S},
                {0, 0, 0, Direction.W, "r", "(0, 0, 0)", Direction.N},
                {0, 0, 0, Direction.N, "r", "(0, 0, 0)", Direction.W},

                {-1, -1, -1, Direction.S, "r", "(-1, -1, -1)", Direction.W},
                {2, -3, 4, Direction.W, "r", "(2, -3, 4)", Direction.N},
                {0, 0, 0, Direction.E, "r", "(0, 0, 0)", Direction.S},
                {3, 5, 1, Direction.S, "r", "(3, 5, 1)", Direction.E},

                {0, 0, 0, Direction.N, "u", "(0, 0, 0)", Direction.U},
                {1, 0, 1, Direction.E, "u", "(1, 0, 1)", Direction.U},
                {0, 0, 0, Direction.W, "u", "(0, 0, 0)", Direction.U},
                {0, 0, 0, Direction.N, "u", "(0, 0, 0)", Direction.U},

                {-1, -1, -1, Direction.S, "u", "(-1, -1, -1)", Direction.U},
                {2, -3, 4, Direction.W, "u", "(2, -3, 4)", Direction.U},
                {0, 0, 0, Direction.E, "u", "(0, 0, 0)", Direction.U},
                {3, 5, 1, Direction.S, "u", "(3, 5, 1)", Direction.U},

                {0, 0, 0, Direction.N, "d", "(0, 0, 0)", Direction.D},
                {1, 0, 1, Direction.E, "d", "(1, 0, 1)", Direction.D},
                {0, 0, 0, Direction.W, "d", "(0, 0, 0)", Direction.D},
                {0, 0, 0, Direction.N, "d", "(0, 0, 0)", Direction.D},

                {-1, -1, -1, Direction.S, "d", "(-1, -1, -1)", Direction.D},
                {2, -3, 4, Direction.W, "d", "(2, -3, 4)", Direction.D},
                {0, 0, 0, Direction.E, "d", "(0, 0, 0)", Direction.D},
                {3, 5, 1, Direction.S, "d", "(3, 5, 1)", Direction.D}
        });
    }
	
    //Define all necessary data to test
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
    public void testSpacecraft() {
        for (Object[] testData : dataForMoveForward()) {
            int startX = (Integer) testData[0];
            int startY = (Integer) testData[1];
            int startZ = (Integer) testData[2];
            Direction startDirection = (Direction) testData[3];
            String command = (String) testData[4];
            String expectedPosition = (String) testData[5];
            Direction expectedDirection = (Direction) testData[6];

            Spacecraft spacecraft = new Spacecraft(startX, startY, startZ, startDirection);
            
            if(command.equals("f")) {spacecraft.moveForward();}
            else if(command.equals("b")) {spacecraft.moveBackward();}
            else if(command.equals("l")) {spacecraft.turnLeft();}
            else if(command.equals("r")) {spacecraft.turnRight();}
            else if(command.equals("u")) {spacecraft.turnUp();}
            else if(command.equals("d")) {spacecraft.turnDown();}
            assertEquals(expectedPosition, spacecraft.getPosition());
            assertEquals(expectedDirection, spacecraft.getDirection());

            
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
