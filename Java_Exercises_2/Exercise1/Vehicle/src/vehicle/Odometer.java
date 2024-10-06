
package vehicle;

import java.util.Random;


public class Odometer {   // Η κλάση μας Odometer η οποία περιέχει τα στοιχεία που ζητάει η άσκηση. 
    
    private float kilometers;
    private float fuel;
    private float fuelconsumption;
    private float hours;
    
    
    Odometer(float kilometers , float fuel , float fuelconsumption , float hours){ // random τιμές έτσι ώστε τρέχουμε το πρόγραμμα να βγάζει διαφορετικές τιμές.
        
        this.kilometers=new Random().nextInt(2000);
        this.fuel=new Random().nextInt(1000);
        this.fuelconsumption=fuelconsumption;
        this.hours=new Random().nextInt(300);
    }
    
    @Override
    public String toString(){ // η εκτύπωση των αποτελεσμάτων με μία toString.
        
        return "\n kilometers : " +kilometers  + "\n\n fuel : " + fuel + "\n\n hours : " + hours + "\n\n fuelconsumption : " +fuelconsumption() +"\n";
        
        
    }
    
    public float fuelconsumption(){ // γυρνάει πίσω την κατανάλωση των καυσίμων ανά πόσες ώρες (δεν ξέρω αν ο τύπος είναι σωστός πάντως.)
        
        return (fuel/kilometers)*hours;
        
        
    }
    
}
