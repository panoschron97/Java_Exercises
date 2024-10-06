
// 321/2015222 , Χρονόπουλος Παναγιώτης , Άσκηση 1.

package rectangle2;

public class Rectangle2 

{

    
    public static void main(String[] args) // Κλάση main.
    
    {   
        
        System.out.println(); 
            
        System.out.print(" Rectangle 1 " + "\n");

        Point Object1 = new Point(10.0 , 6.0 , 6.0 , 3.0); // Δημιουργία αντικειμένου Object1.
        
        System.out.println(Object1.toString()); // Εκτύπωση όλων των μεθόδων που βρίσκονται στην κλάση Point με το toString().
        
        RectTopping(10.0 , 6.0 , 6.0 , 3.0 ); // Μέθοδος που δέχεται ως παράμετρο ένα ορθογώνιο (rect) και ελέγχει για επικάλυψη μεταξύ των ορθογωνίων.
        
        System.out.println();
         
        Equals(Object1); // Μέθοδος equals (override της equals της κλάσης Object) που θα ελέγχει αν το αντικείμενο που δέχεται ως παραμέτρου είναι ίδιο με το αντικείμενο Rectangle για το οποίο καλέσαμε την μέθοδο.
         
        System.out.println();
   
        System.out.print(" Rectangle 2 " + "\n");

        Point Object2 = new Point(15.0 , 11.0 , 9.0 , 7.0); // Δημιουργία αντικειμένου Object2.
        
        System.out.println(Object2.toString()); // εκτύπωση όλων των μεθόδων που βρίσκονται στην κλάση Point με το toString().
        
        RectTopping(15.0 , 11.0 , 9.0 , 7.0 ); // Μέθοδος που δέχεται ως παράμετρο ένα ορθογώνιο (rect) και ελέγχει για επικάλυψη μεταξύ των ορθογωνίων.
        
        System.out.println();
         
        Equals(Object2); // Μέθοδος equals (override της equals της κλάσης Object) που θα ελέγχει αν το αντικείμενο που δέχεται ως παραμέτρου είναι ίδιο με το αντικείμενο Rectangle για το οποίο καλέσαμε την μέθοδο.
         
        System.out.println();
        
        System.out.print(" Rectangle 3 " + "\n");

        Point Object3 = new Point(12.0 , 8.0 , 8.0 , 6.0);  // Δημιουργία αντικειμένου Object3.
        
        System.out.println(Object3.toString()); // Εκτύπωση όλων των μεθόδων που βρίσκονται στην κλάση Point με το toString().
        
        RectTopping(12.0 , 8.0 , 8.0 , 6.0 ); // Μέθοδος που δέχεται ως παράμετρο ένα ορθογώνιο (rect) και ελέγχει για επικάλυψη μεταξύ των ορθογωνίων.
        
        System.out.println();
        
        Equals(Object3); // Μέθοδος equals (override της equals της κλάσης Object) που θα ελέγχει αν το αντικείμενο που δέχεται ως παραμέτρου είναι ίδιο με το αντικείμενο Rectangle για το οποίο καλέσαμε την μέθοδο.
         
        System.out.println();
      
    }
    
     public static void RectTopping(double x , double y , double width , double height ) // Μέθοδος που δέχεται ως παράμετρο ένα ορθογώνιο (rect) και ελέγχει για επικάλυψη μεταξύ των ορθογωνίων.
    
    {
    
    float xx = (float) (0 + Math.random() * (20 - 0));
  
    float yy = (float) (0 + Math.random() * (16 - 0));      // Random διαστάσεις ορθογωνίου με τις οποίες κάνουμε σύγγκριση με τις διαστάσεις του ορθογωνίου της main.
       
    float widthh = (float) (6 + Math.random() * (13 - 6));
  
    float heightt = (float) (3 + Math.random() * (10 - 3));
    
    System.out.print(" Random(x,y) -> for compares with other rectangle for topping : " + xx + " , " + yy + "\n");
    
    System.out.print("\n Random(width,height) -> for compares with other rectangle for topping : " + widthh + " , " + heightt + "\n");
        
    if(x>=xx && y>=yy && widthh>=width && heightt>=height) // Αν όντως ισχύει εκτύπωσε true αλλιώς false.
        
    {
      
     System.out.print("\n (9)The Rectangle for topping is true\n");
        
    }
        
    else
        
    {
    
    System.out.print("\n (9)The Rectangle for topping is false\n"); 
        
    }
        
    }
     
     public static void Equals(Point EqualObject) // Μέθοδος equals (override της equals της κλάσης Object) που θα ελέγχει αν το αντικείμενο που δέχεται ως παραμέτρου είναι ίδιο με το αντικείμενο Rectangle για το οποίο καλέσαμε την μέθοδο.
            
    {
        
    float xx = (float) (0 + Math.random() * (20 - 0));
  
    float yy = (float) (0 + Math.random() * (16 - 0));
    
    float widthh = (float) (6 + Math.random() * (13 - 6));  // Random διαστάσεις ορθογωνίου με τις οποίες κάνουμε σύγγκριση με τις διαστάσεις του ορθογωνίου της main.
  
    float heightt = (float) (3 + Math.random() * (10 - 3));
       
    Point ObjectCompare = new Point(xx , yy , widthh , heightt);
 
    if(EqualObject.equals(ObjectCompare)) // Αν όντως ισχύει εκτύπωσε true αλλιώς false.
    
    {
        
    System.out.print(" (10)The Equal is true\n");
        
    }
    
    else
        
    {
        
    System.out.print(" (10)The Equal is false\n");
        
    }

    }
    
}
