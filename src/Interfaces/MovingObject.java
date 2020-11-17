package Interfaces;

import Barriers.Treadmill;
import Barriers.Wall;

public interface MovingObject {

    public void jump();

    public void jump(Wall wall);

    public void run();

    public void run(Treadmill treadmill);

    boolean isHasObjectDoneThat();
}
