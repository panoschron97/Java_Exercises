
package entertainment.points;

import static java.lang.Math.sqrt; // δήλωση Math.sqrt για να βρούμε την τετραγωνική ρίζα του userlocation.
import java.util.Random; // δήλωση Random για να παράγουμε τυχαίες τιμές από x:[-90.0 , 90.0] και y:[-180.0 , 180.0].


public class Location { // κλάση Location.
    
   private int x=0;
   private int y=0;               //δήλωση x και y.
   Score score = new Score();
    
    public Location() // παραγωγή τυχαίων τιμών.
    {
        
         
            this.x=new Random().nextInt(180)-90;
        
  
            this.y=new Random().nextInt(360)-180;
    
    }
 
    @Override
    public String toString() // String toString που εκτυπώνει το x : και y: .
    {
        return " x : " + x + " y : " + y ; 
    }
    
    public int distance(Location b) // distance για την τοποθεσία του χρήστη.
    {
        double temp=(this.x-b.getx()^2 + (this.y-b.gety())^2);
        return (int) Math.sqrt(temp);
    }
    public int getx() // δημιουργία getx για το userlocation του χρήστη.
    {
        return this.x;
    }
    public int gety() // δημιουργία gety για το userlocation του χρήστη.
    {
        return this.y;
    }

   
  
    
}
