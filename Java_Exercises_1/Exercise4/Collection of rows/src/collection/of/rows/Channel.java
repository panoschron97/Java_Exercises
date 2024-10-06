
package collection.of.rows;

public class Channel //κλάση Channel
{
    private String channel;      //αρχικοποίηση μεταβλητών.
   Rows rows = new Rows();
    
    public Channel()
    {
        channel=null;  //αρχικοποίηση καναλιού με null.
     
    }
    public Channel(String channel )
    {
        this.channel=channel;
       
    }

    public void setRows(Rows rows) // προσθέτει μία σειρά σε κάθε κανάλι.
    {
        this.rows = rows;
       
    }
    
    @Override
    public String toString() // String toString που την χρησιμοποίησα για το 3 ερώτημα όπου θα εμφανίζω όλα τα κανάλια με αλφαβητική σειρά.
    {
        return " Channel : " +channel ; //
    }
    
    public String getChannel() // GetChannel την οποία την χρισιμοποίησα για το 2 ερώτημα , όπου θα δίνω το όνομα του καναλιού και θα μου εμφανίζει τις σειρές.
    {
        return channel;
    }
  
}
