
package collection.of.rows;

import static collection.of.rows.CollectionOfRows.g;

public class Rows // κλάση Rows
{
   private String rows;  // δήλωση μεταβλητών.
    public Rows()
    {
        rows=null; //αρχικοποίηση με null.
    }
    public Rows(String rows)
    {
        this.rows=rows;
    }

    @Override 
    public String toString() // String toString η οποία εκτυπώνει τις σειρές για το ερώτημα 3 της άσκησης.
    {
        return  "Row : " +rows  ;
    }
    public String getRow() // getRow την χρησιμοποίησα για να κάνω sort τις σειρές.
    {
        return rows;
    }
    public void Rows() //Rows η οποία εκτυπώνει τις σειρές του 2 ερωτήματος της άσκησης.
    {
        System.out.println("Rows : "+ g.many.toString());
    }
}
