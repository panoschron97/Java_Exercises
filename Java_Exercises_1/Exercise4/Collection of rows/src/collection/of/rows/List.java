
package collection.of.rows;

import java.util.ArrayList;
import java.util.Iterator;

public class List //κλάση List
{
    public ArrayList<Channel> howmany; // η λίστα των καναλιών.
    public ArrayList<Rows> many; // η λίστα των σειρών.
    public List()
    {
        howmany = new ArrayList<Channel>();
        many = new ArrayList<Rows>();
    }
    public void addchannel(Channel Channel) // προσθήκη νέου καναλιού.
    {
        howmany.add(Channel);
    }
    public void addRow( Rows Rows) // προσθήκη νέας σειράς.
    {
       many.add(Rows);
    }
   

   

    

    

    

  

   
}
