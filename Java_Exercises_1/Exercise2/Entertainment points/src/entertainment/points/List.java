
package entertainment.points;

import java.util.ArrayList;
import java.util.Iterator;


public class List // κλάση List.
{
    public ArrayList<Register> loc ;
    public List() // η λίστα με τα σημεία ψυχαγωγίας  που υπάρχουν.
    { 
        loc = new ArrayList<Register>();
    }

public void add(Register Register) // συνάρτηση έτσι ώστε να μπορώ να κάνω add περισσότερα από ένα σημεία ψυχαγωγίας .
{
  loc.add(Register);
}


 
}