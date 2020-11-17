package MovingObjects;

import Barriers.Treadmill;
import Barriers.Wall;
import Interfaces.MovingObject;

public class Human implements MovingObject {

    private int maxLength;
    private double maxHeight;
    private String name;

    private boolean hasObjectDoneThat = true;

    public Human(int maxLength, double maxHeight, String name)
    {
        this.maxHeight =  maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    public boolean isHasObjectDoneThat() {
        return hasObjectDoneThat;
    }


    @Override
    public void jump() {
        System.out.println("Человек "+ name + " прыгает" );
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxHeight)
        {
            System.out.println("Человек " + name + " перепрыгнул " + wall.getHeight() + " метров");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Человек " + name + " столько не прыгнет");
            hasObjectDoneThat = false;
        }
    }

    @Override
    public void run() {
        System.out.println("Человек "+ name + " бегает" );
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength)
        {
            System.out.println("Человек " + name + " пробежал " + treadmill.getLength() + " метров");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Человек " + name + " столько не пробежит");
            hasObjectDoneThat = false;
        }

    }
}
