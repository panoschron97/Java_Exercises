
// 321/2015222 , Χρονόπουλος Παναγιώτης , Άσκηση 1.

package rectangle2;

public class Point // Κλάση για ορισμό των συντεταγμένων ενός σημείου.

{
      
    private double x=0.0;   
    private double y=0.0;
    private double width=0.0;           //Ορισμός συντεταγμένων χ και ψ και πλάτος και ύψος ορθογωνίου.
    private double height=0.0;
    
    Point()
    
    {
        
    x=0.0;
    y=0.0;                    //Αρχικοποίηση με 0.
    width=0.0;
    height=0.0;

     }
    
    public Point(double x , double y , double width , double height)
    
    {
    
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
        
    } 
    
    public double GetX() // Επιστρέφει την τιμη της συντεταγμένης του χ.
            
    {
     
     return x;   
        
    }
    
    public double GetY() // Επιστρέφει την τιμη της συντεταγμένης του ψ.
    
    {
     
     return y;   
        
    }
    
    public double GetWidth() // Επιστρέφει την τιμη του πλάτους.
            
    {
        
    return width;    
        
    }
    
    public double GetHeight() // Επιστρέφει την τιμή του ύψους.
    
    {
    
    return height;    
        
    }
    
    public double Perimeter() // Μέθοδος που  υπολογίζει και επιστρέφει την περίμετρο του ορθογωνίου. 
    
    {
           
    return (width*2) + (height*2);  
        
    }
    
    public double Area() // Μέθοδος που επιστρέφει το εμβαδόν του ορθογωνίου. 
    
    {
     
     return width*height;   
        
    }
    
    public boolean P() // Μέθοδος που ελέγχει αν ένα σημείο p τύπου Point εμπεριέχεται στο ορθογώνιο και επιστρέφει την τιμή με boolean true ή false.
    
    {
  
    float xx = (float) (0 + Math.random() * (20 - 0));        // Random συντεταγμένες για το ορθογώνιο.
  
    float yy = (float) (0 + Math.random() * (16 - 0));
    
    System.out.print("\n Random(x,y) -> for compares : " + xx + " , " + yy + "\n");
        
       if(x>xx && y>yy) // Εν ισχύει true αλλιώς false.
       
       {
       
       return true;
       
       }
       
       else
       
       {
           
        return false;
        
       }
         
    }
    
    public boolean Rect() // Μέθοδο που ελέγχει αν ορθογώνιο (rect) που δέχεται ως παράμετρο εμπεριέχεται στο ορθογώνιο πάλι με boolean true ή false.
    
    {
       
    float widthh = (float) (6 + Math.random() * (13 - 6));
  
    float heightt = (float) (3 + Math.random() * (10 - 3));
    
    System.out.print("\n Random(width,height) -> for compares with other rectangle : " + widthh + " , " + heightt + "\n");
        
    if(widthh<width && heightt<height)
        
    {
      
     return true;   
        
    }
        
    else
        
    {
    
    return false;    
        
    }
        
    }
    
    @Override
    public String toString() // Εκτύπωση όλων των παραπάνω με το toString() άφου έχουμε δημιουργήσει στην main αντικείμενα.
            
    {
        
        return "\n (1)The x position is : " + GetX() +  
                " \n " + "(2)The y position is : " + GetY() + 
                " \n " + "(3)The width is : " + GetWidth() + 
                " \n " + "(4)The height is : " + GetHeight() + 
                " \n " + "(5)The Perimeter is : " + Perimeter() + 
                " \n " + "(6)The Area is :  " + Area() +
                " \n " + "(7)The Point is : " + P() +
                " \n " + "(8)The Compare with other rectangle is : " + Rect() +
                " \n ";
        
    }

}
