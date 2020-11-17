
/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий.
4. * У препятствий есть длина (для дорожки) или высота (для стены), а у частников ограничения
на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
препятствий не идет.
 */

import Barriers.Treadmill;
import Barriers.Wall;
import Interfaces.Barrier;
import Interfaces.MovingObject;
import MovingObjects.Cat;
import MovingObjects.Human;
import MovingObjects.Robot;

public class Main{

    public static void main(String[] args) {

        MovingObject [] participants  = new MovingObject[6];

        participants[0] = new Cat(100, 2,"Barsik" );
        participants[1] = new Cat(200, 1.5,"Kotka" );

        participants[2] = new Human(1000, 3,"Evgenii");
        participants[3] = new Human(700, 2.5,"Sergei");

        participants[4] = new Robot(10000, 5,"Shwarz");
        participants[5] = new Robot(7000, 2,"Gerbel");


        Barrier [] barriers = new Barrier[2];

        barriers[0] = new Treadmill(800);
        barriers[1] = new Wall(1.6);

        participants[0].jump((Wall) barriers[1]);

        passBarriers(participants, barriers);

        Wall w = new Wall(20);

    }

    private static void passBarriers(MovingObject [] participants, Barrier [] barriers)
    {

        for (int i = 0; i < participants.length; i++)
        {
            for(int j = 0; j < barriers.length; j++)
            {

                if (barriers[j] instanceof Wall)
                {
                    if (participants[i].isHasObjectDoneThat())
                    {
                        participants[i].jump((Wall)barriers[j]);
                    }
                    else
                        {
                            System.out.println("Данный участник согласно условию дальше по списку препятствий не идёт");
                        }
                }
                else if (barriers[j] instanceof Treadmill)
                {
                    if (participants[i].isHasObjectDoneThat())
                    {
                        participants[i].run((Treadmill) barriers[j]);
                    }
                    else
                    {
                        System.out.println("Данный участник согласно условию дальше по списку препятствий не идёт");
                    }
                }
                else
                    {
                        System.out.println("Ошибка");
                    }
            }
        }
    }
}
