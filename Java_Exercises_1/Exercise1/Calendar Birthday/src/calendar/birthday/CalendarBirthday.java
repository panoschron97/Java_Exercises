
package calendar.birthday;

import java.util.ArrayList;         // Δήλωση ArrayList επειδή θέλουμε λίστα στον κωδικά μας.
import java.util.Comparator;        // Δήλωση Comparator λόγω δεύτερου ερωτήματος που μας ζητάτε να εμφανίζουμε τα contacts με βάση τα surnames με αλφαβητική σειρά.
import java.util.Scanner;           // δήλωση Scanner επειδή ως χρήστες πρέπει να πληκτρολογήσουμε.

public class CalendarBirthday   //κλάση CalendarBirthday.
{
    
   
static ArrayList<Person> collection = new ArrayList<Person>(); // λίστα για τις επαφές.
static Scanner input = new Scanner(System.in);
static List Lib = new List(); // λίστα Lib.
   
    public static void main(String[] args)  // η main μας συνάρτηση όπου μέσα της βρίσκεται το menu με την μέθοδο switch case.
    {
        
    boolean running=true;
        
        while(running)
        {
     System.out.println("\n A Calendar Birthday Application. \n");
     System.out.println(" 1 - Insert a new contact from the user. ");
     System.out.println(" 2 - Deleting a contact based on the name the user will enter. ");
     System.out.println(" 3 - Show the entire contact list sorted by surname. ");
     System.out.println(" 4 - Search for all contacts that have a birthday at the current date. ");
     System.out.println(" 5 - Search for all contacts that have a birthday this month. ");
     System.out.println(" 6 - Search for all contacts that have a specific birthday user-defined (initial and final date). ");
     System.out.println(" 7 - Calendar Birthday exits. ");
     
     System.out.println("\n Please enter an option between 1 - 7 :  \n");
     
     int choice=input.nextInt();
    
     switch(choice)
     {
         case 1: 
                addPerson();
         break;
         case 2:
                System.out.println("\n Give the first name from the contact u want to delete : \n");
                String n=new Scanner(System.in).nextLine();
                System.out.println("\n Give the second name from the contact u want to delete :  \n");
                String o = new Scanner(System.in).nextLine();
                deletePerson(n,o);
         break;
         case 3: 
                displaybysurname();
         break;
         case 4:
                System.out.println(" Enter the date : ");
                String date = new Scanner(System.in).nextLine();
                birthday(date);
         break;
         case 5: 
                System.out.println(" Enter the month :  ");
                String month = new Scanner(System.in).nextLine();
                monthday(month);
         break;
         case 6:
                System.out.println(" User give date u want : ");
                String datee = new Scanner(System.in).nextLine();
                System.out.println(" User give month u want : ");
                String monthh = new Scanner(System.in).nextLine();
                System.out.println(" Enter the year u want : ");
                String year = new Scanner(System.in).nextLine();
                User(datee,monthh,year);
          break;
         case 7:              //end program.
                running=false; 
                break;
              
         default : System.out.println(" Invalid number , please try again \n");
         
    
    
}
     } System.exit(0);
    }  
    public static void addPerson() // συνάρτηση η οποία εκπληρώνει το πρώτο ερώτημα που μας ζητάτε , στην οποία συνάρτηση ο χρήστης χρησιμοποιώντας το πληκτρολόγιο κάνει add επαφές.
    {
        String name;
        String surname;
        String location;
        String month;
        String date;
        String year;
        
        System.out.println("\n Enter the name : " );
        name=input.next();
        
        System.out.println("\n Enter the surname : ");
        surname=input.next();
        
        System.out.println("\n Enter the location : ");
        location=input.next();
        
        System.out.println("\n Enter the month : ");
        month=input.next();
        
        System.out.println("\n Enter the date : ");
        date=input.next();
        
        System.out.println("\n Enter the year : " );
        year=input.next();
        
        System.out.println("\n New contact added. \n");
        
       Person person = new Person(name , surname , location , month , date , year );
       Lib.addPerson(person); //προσθήκη επαφής στην λίστα Lib.
        
    }
    
    public static void deletePerson(String name , String surname) // συνάρτηση η οποία εκπληρώνει το δεύτερο ερώτημα που μας ζητάτε και με βάση το όνομα της επαφής που θα δώσει ο χρήστης από το πληκτρολόγιο διαγράφει όλη την επαφή.
    {
       Lib.remove(Lib.GetPersonByName(name , surname));
    }
    
    public static void displaybysurname() // συνάρτηση η οποία εκπληρώνει το τρίτο ερώτημα που μας ζητάτε η οποία χρησιμοποιεί τον Comperator αρχικά έτσι ώστε να εμφανίζει τις επαφές αλφαβητικά , πάντα όμως με βάση τα surnames των επαφών.
    {
    
        {
         ArrayList<Person> collection =new ArrayList<Person>();
         Lib.collection.addAll(collection);
         Lib.collection.sort(new Comparator<Person>() 
         {
             @Override
             public int compare(Person o1, Person o2) 
             {
                return o1.Getsurname().compareTo(o2.Getsurname());
             }
         }
                            ); 
         
         for (Person Person : Lib.collection) 
         {
            System.out.println(Person.toString());   //εμφάνιση επαφών αφού έχει γίνει πρώτα το σορτάρισμα με βάση τα surnames.
         }
         
        }
    }

    public static void birthday(String date) // συνάρτηση η οποία εκπληρώνει το τεταρτο ερώτημα που ζητάτε όπου με βάση το date που θα δώσουμε ως χρήστες θα μας εμφανίσει τις επαφές με βάση το date που πληκτρολογήσαμε.
    {
        
     for(Person person : Lib.collection)
     {
         if(date.equals(person.GetDate()))
         {
             System.out.println(" The contact with the date u entered was/were : \n");
             System.out.println(person.toString()); //εμφάνιση επαφών με βάση το date που πληκτρολογήσαμε.
         }
        
     }
    }

    public static void monthday(String month) // συνάρτηση η οποία εκπληρώνει το πέμπτο ερώτημα που ζητάτε όπου με βάση το month που θα δώσουμε ως χρήστες θα μας εμφανίσει τις επαφές με βάση το month που πληκτρολογήσαμε.
    {
        
        for(Person person : Lib.collection)
        {
            if(month.equals(person.GetMonth()))
            {
                System.out.println(" The contact with the month u entered was/were : \n");
                System.out.println(person.toString()); //εμφάνιση επαφών με βάση το month που πληκτρολογήσαμε.
            }
           
         }
    }
    public static void User(String date , String month , String year) // συνάρτηση η οποία εκπληρώνει το έκτο και τελευταίο ερώτημα που ζητάτε όπου με βάση το date , το month και το year  που θα δώσουμε ως χρήστες θα μας εμφανίσει τις επαφές με βάση το date , το month και το year που πληκτρολογήσαμε.
    {
        for(Person person : Lib.collection)
        {
            if(month.equals(person.GetMonth()) && date.equals(person.GetDate()) && year.equals(person.GetYear()))
            {
                System.out.println(" The contact with the date and month and year u entered was/were : \n");
                System.out.println(person.toString()); //εμφάνιση επαφών με βάση το date , το month και το year που πληκτρολογήσαμε.
                
            }
            
       }
     }
    

} 

  
   
    


