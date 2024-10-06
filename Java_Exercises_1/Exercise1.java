package excercise.pkg1;

import java.util.Scanner;

public class Exercise1 {

    FindDivision a;

    public Exercise1(int i) throws InterruptedException {
        a = new FindDivision(i);
        a.start();
        a.join();
    }

    public static void main(String[] args) throws InterruptedException {
        int x;
        do {
        System.out.println("Pliktrologiste to ginomeno prwtwn poy thelete na elenksete h' -1 gia eksodo");
        x=new Scanner(System.in).nextInt();
        new Exercise1(x);
        } while (x != -1);
    }

}
