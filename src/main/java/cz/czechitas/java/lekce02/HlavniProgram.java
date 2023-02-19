package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class
HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();


        for (int x = 0; x < 3; x++) {

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
        }

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

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
