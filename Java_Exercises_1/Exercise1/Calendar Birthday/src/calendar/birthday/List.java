
package calendar.birthday;

import java.util.ArrayList;
import java.util.Iterator;


public class List  // κλάση List.
{
    public ArrayList<Person> collection;
    public List() // η λίστα με τις επαφές που υπάρχουν.
    {
        collection = new ArrayList<Person>();
        
    }
    public void addPerson(Person person) // συνάρτηση έτσι ώστε να μπορώ να κάνω add περισσότερες από μία επαφές.
    {
        collection.add(person);
    }
    public void remove(Person person) // συνάρτηση η οποία την χρησιμοποίησα για να μπορώ να διαγράφω επαφές.
    {
    collection.remove(person);
    }
    public Person GetPersonByName(String name,String surname) // συνάρτηση την οποία την χρησιμοποίησα έτσι ώστε να μπορώ να διαγράφω τις επαφές με βάση το όνομα που θα πληκτρολογήσω σας χρήστης.
    {
        Person v =null;
        Iterator<Person> i = collection.iterator();
        while(i.hasNext())
        {
            v=i.next();
            if(v.GetName().toLowerCase().contentEquals(name.toLowerCase()) && v.Getsurname().toLowerCase().contentEquals(surname.toLowerCase()))
            {
                return v;
            }
        }
   return null; }
 
}
