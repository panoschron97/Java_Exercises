
package calendar.birthday;


public class Person //κλάση Person
{
    
    private String name;
    private String surname;
    private String location;        //δήλωση στοιχείων του Person.
    private String month;
    private String date;
    private String year;
    
    public Person()
    {
        name=null;
        surname=null;
        location=null;          //αρχικοποίση των Strings με null.
        month=null;
        date=null;
        year=null;
    }
    public Person(String name, String surname, String location, String month , String date , String year )
    {
        this.name=name;
        this.surname=surname;
        this.location=location;
        this.month=month;
        this.date=date;
        this.year=year;
        
    }
    public String GetName() //Getname όπου την χρησιμοποίησα για να μπορώ με βάση το όνομα να διαγράφω επαφές.
    {
        return name;
    }
    
    public String Getsurname() //Getsurname όπου την χρησιμοποίησα για να μπορώ να κάνω το σορτάρισμα για το 3 ερώτημα της άσκησης.
    {
        return surname;
    }
    
    @Override
    public String toString() // String toString όπου την χρησιμοποίησα για να μπορώ να εκτυπώνω όλες τις επαφές με βάση κάθε ερώτημα.
    {
        
   return  "\n surname : " +surname + "\n name :  " +name + "\n location : " +location + "\n month : " +month + "\n date : "  + date + "\n year : " +year + "\n" ;
    }

    Object GetMonth() // Getmonth όπου την χρησιμοποίησα για να συγκρίνω τα months του ερωτήματος 5 και 6
    {
        return month;
    }
    Object GetDate() // GetDate όπου την χρησιμοποίησα για να συγκρίνω τα dates του ερωτήματος 4 και 6
    {
        return date;
    }
    Object GetYear() // GetYear όπου την χρησιμοποίησα για να συγκρίνω τα years του ερωτήματος 6
    {
        return year;
    }
}
