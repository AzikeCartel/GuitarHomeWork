package ITscoolMegacom;

import ITscoolMegacom.models.Guitar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            Guitar guitar = new Guitar();
            guitar.tune();
            for (int item : guitar.getTensions()
            ) {
                System.out.println(item);
            }
            guitar.play();
            for (int item : guitar.getTensions()
            ) {
                System.out.println(item);
            }
            while (true){
                System.out.println("1 - repeat ");
                System.out.println("0 - exit: ");
                String answer = scan.next();
                if (answer.equals("1")) {
                    break;
                } else if (answer.equals("0")) {
                    System.exit(0);
                }
            }

        }
    }
}
