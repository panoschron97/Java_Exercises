
//Χρονόπουλος Παναγιώτης 3212015222

package vehicle;

public class Vehicle {

   
    
    
    public static void main(String[] args) { // η main μας στην οποία καλούμε αντικείμενα με βάση την άσκηση.
        
        System.out.print("\n\n Vehicle Application. \n");
       
        System.out.print("\n Audi A4. \n");
        
        Odometer object1 = new Odometer(0 , 0 , 0 , 0);
        
        System.out.println(object1.toString());
        
        System.out.print("\n Honda Civic. \n");
        
       Odometer object2 = new Odometer(0 , 0 , 0 , 0);
        
        System.out.println(object2.toString());
        
         System.out.print("\n Opel cabrio. \n");
        
       Odometer object3 = new Odometer(0 , 0 , 0 , 0);
        
        System.out.println(object3.toString());
        
     
    }

   

   

  

   
    
}
