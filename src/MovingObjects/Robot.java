package MovingObjects;

import Barriers.Treadmill;
import Barriers.Wall;
import Interfaces.MovingObject;

public class Robot implements MovingObject {

    private int maxLength;
    private double maxHeight;
    private String name;

    private boolean hasObjectDoneThat = true;

    public Robot(int maxLength, double maxHeight, String name)
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
        System.out.println(getClass().getName() + " прыгает" );
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxHeight)
        {
            System.out.println("Робот " + name + " перепрыгнул " + wall.getHeight() + " метров");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Робот " + name + " столько не прыгнет");
            hasObjectDoneThat = false;
        }
    }

    @Override
    public void run() {
        System.out.println(getClass().getName() + " бегает" );
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength)
        {
            System.out.println("Робот " + name + " пробежал " + treadmill.getLength() + " метров");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Робот " + name + " столько не пробежит");
            hasObjectDoneThat = false;
        }
    }
}
