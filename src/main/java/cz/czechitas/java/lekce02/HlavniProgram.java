package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class
HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //presun na na zaciatok, dolava
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(350);
        zofka.turnRight(90);
        zofka.penDown();

        //prasiatko

        nakresliPrasiatko(zofka);

        //presun doprava

        zofka.turnRight(60);
        zofka.penUp();
        zofka.move(140);

        //8uholnik
        zofka.turnLeft(90);
        zofka.move(100);

        nakresli8uholnik(zofka);

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(150);

        //kruh
        nakresliKruh(zofka);

        zofka.turnLeft(144);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(150);
        zofka.move(100);

        //presun dolava
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();

        for (int s = 0; s < 30; s++) {
            zofka.move(300);
            zofka.turnLeft(167);
        }

        //slniecko




       /* for (int x = 0; x < 3; x++) {

            for (int i = 0; i < 4; i++) {
                zofka.move(100);
                zofka.turnRight(90);
            }

            zofka.penUp();
            zofka.move(100);

            zofka.turnRight(30);
            zofka.penDown();
            zofka.move(100);
            zofka.turnRight(120);
            zofka.move(100);

            zofka.turnRight(30);
            zofka.penUp();
            zofka.move(100);

            zofka.turnLeft(90);
            zofka.penUp();
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.penDown();
        }*/

     /*  zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(50);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);

        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(50);*/


        //TODO tady bude kód
    }



    private static void nakresliKruh(Turtle zofka) {
        for (int z = 0; z <12; z++) {
            zofka.turnLeft(36);
            zofka.move(30);
            zofka.penDown();
        }
    }

    private static void nakresli8uholnik(Turtle zofka) {
        for (int x = 0; x <8; x++) {

            zofka.turnRight(45);
            zofka.penDown();
            zofka.move(80);
        }
    }

    private static void nakresliPrasiatko(Turtle zofka) {

        for (int i = 0; i <4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }


        zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(50);

        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);

        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(50);
    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
