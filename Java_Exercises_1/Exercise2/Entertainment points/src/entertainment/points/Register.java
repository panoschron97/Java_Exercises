
package entertainment.points;


public class Register { // κλάση Register.
        
private String kind;
private String describe;                //δήλωση μεταβλητών για τα σημεία ψυχαγωγίας.
Score score = new Score();
private String town;
Location location = new Location();
   
   
    public Register()
    {
        kind=null;
        describe=null;              //αρχικοποίηση με null.
        town=null;
       
        
    }
    public Register(String kind , String describe  ,int score ,String town , int location )
    {
        
        this.kind=kind;
        this.describe=describe;
        this.town=town;
        
        
    }

    @Override
    public String toString() // String toString που εκτυπώνει τα σημεία ψυχαγωγίας.
    {
        return "\n kind : " + kind + "\n describe : " + describe  + "\n" + score + "\n town : " + town + "\n location = " + location;
    }
    
  public String kind() //kind όπου την χρησιμοποίησα για το σορτάρισμα που ήθελε στα ερωτήματα 2 και 3.
  {
      return kind;
  }
   
  
    
}
