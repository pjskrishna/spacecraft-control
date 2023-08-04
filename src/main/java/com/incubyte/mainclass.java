package com.incubyte;

import java.util.ArrayList;
import java.util.List;

public class mainclass {

	public static void main(String[] args) {
        int intial_x = 0, intial_y = 0, intial_z = 0;
        Direction initial_direction = Direction.N;
        List<Object> commands = new ArrayList<Object>();
        commands.add('f');
        commands.add('r');
        commands.add('u');
        commands.add('b');
        commands.add('l');


        Spacecraft chandrayaan_3 = new Spacecraft(intial_x, intial_y, intial_z, initial_direction);
        Spacecraft.processCommands(chandrayaan_3, commands);

        System.out.println("Final Position: (" + chandrayaan_3.x + ", "
                + chandrayaan_3.y + ", " + chandrayaan_3.z + ")");
        System.out.println("Final Direction: " + chandrayaan_3.direction);
    }

}
