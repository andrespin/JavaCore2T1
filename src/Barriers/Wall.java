package Barriers;

import Interfaces.Barrier;

public class Wall  implements Barrier {

    private double height;

    public double getHeight() {
        return height;
    }

    public Wall(double height)
    {
        this.height = height;
    }

}
