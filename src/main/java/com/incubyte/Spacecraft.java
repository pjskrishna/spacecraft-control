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
    	switch (direction) {
        case N:
            direction = Direction.W;
            break;
        case S:
            direction = Direction.E;
            break;
        case E:
            direction = Direction.N;
            break;
        case W:
            direction = Direction.S;
            break;
        case U:
        	direction = Direction.W;
        case D:
        	direction = Direction.E;
    	}
    }
    
    public void turnRight()
    {
    	 switch (direction) {
         case N:
             direction = Direction.E;
             break;
         case S:
             direction = Direction.W;
             break;
         case E:
             direction = Direction.S;
             break;
         case W:
             direction = Direction.N;
             break;
         case U:
        	 direction = Direction.E;
         case D:
        	 direction = Direction.W;
        	 
     }
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
