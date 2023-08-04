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
    	switch (direction) {
        case N:
            y += 1;
            break;
        case S:
            y -= 1;
            break;
        case E:
            x += 1;
            break;
        case W:
            x -= 1;
            break;
        case U:
            z += 1;
            break;
        case D:
            z -= 1;
            break;
        default:
            break;
    }
    }
    
    public void moveBackward()
    {
    	switch (direction) {
        case N:
            y--;
            break;
        case S:
            y++;
            break;
        case E:
            x--;
            break;
        case W:
            x++;
            break;
        case U:
            z--;
            break;
        case D:
            z++;
            break;
    }
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
    
    public String getPosition()
    {
    	return "(" + x + ", " + y + ", " + z + ")";
    }
    
    public void setPosition(int x, int y,int z)
    {
    	this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setDirection(Direction d)
    {
    	this.direction = d;
    }

	public Direction getDirection() {
		return this.direction;
	}
}
