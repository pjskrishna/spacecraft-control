package com.incubyte;

public class Spacecraft {
	private int x;
    private int y;
    private int z;
    private Direction direction;

    public Spacecraft(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }
    
    public void moveForward()
    {
    	
    }
    
    public void moveBackward()
    {
    	
    }
    
    public void turnLeft()
    {
    	
    }
    
    public void turnRight()
    {
    	
    }
    
    public void turnUp()
    {
    	
    }
    
    public void turnDown()
    {
    	
    }
    
    public String currentPosition()
    {
    	return "(" + x + ", " + y + ", " + z + ")";
    }
}
