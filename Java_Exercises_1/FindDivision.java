package excercise.pkg1;

import java.util.Vector;

public class FindDivision extends Thread {

    private Vector<Integer> protoi;

    private int pxp, p1, p2;
    private double time;

    public FindDivision(int pxp) {
        super();
        this.pxp = pxp;
        protoi = new Vector();

    }

    public void run() {
        time=System.currentTimeMillis();
        System.out.println("Loading.");
        fillVector();
        System.out.println("Loading..");
        BresPoioiEinai();
        System.out.println("Finished");
        System.out.println(this.getResult());
        time=System.currentTimeMillis()-time;
        System.out.println("Time "+ time);
    }

    private void fillVector() {
        protoi.add(2);
        for (int i = 2; i <= pxp; i++) {
            if (this.einai_protos(i)) {
                protoi.addElement(i);
            }
        }
    }

    private void BresPoioiEinai() {
        for (Integer x : protoi) {
            if (pxp % x  == 0 && einai_protos(pxp/x)) {
                p1 = x;
                p2 = pxp / p1;
            }
        }
    }


    private boolean einai_protos(int number) {
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getResult() {
        return p1+" kai "+p2;
    }

}
