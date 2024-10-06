
// 321/2015222 , Χρονόπουλος Παναγιώτης , Άσκηση 3.

package usernamepassword;

import java.util.Random;
import javax.swing.JOptionPane;

public class Usernamepassword // Κλάση usernamepassword.

       {

    public static void main(String[] args) // Κλάση main.
    
       {
        
       String firstname = JOptionPane.showInputDialog("Please enter your first name : ");
       String lastname = JOptionPane.showInputDialog("Please enter your last name : ");   // Δίνουμε τα στοιχεία που μας ζητώνται για την δημιουργία username και των δύο passwords.
       String petsname = JOptionPane.showInputDialog("Please enter your pet's name : ");
       System.out.println("\nCreation of Username with combination.");
       ValidateName(firstname.toLowerCase(),lastname.toLowerCase()); // Συνάρτηση που παίρνει το όνομα και το επώνυμο με μικρά γράμματα για την δημιουργία username.
       System.out.println("\nCreation of the first password with combination.");
       ValidatePassword1(firstname.toLowerCase(),lastname.toLowerCase(),petsname.toLowerCase()); // Συνάρτηση που παίρνει το όνομα και το επώνυμο και το όνομα κατοικιδίου με μικρά γράμματα για την δημιουργία του πρώτου password.
       System.out.println("\nCreation of the second password with combination.\n");
       ValidatePassword2(firstname.toLowerCase(),lastname.toLowerCase()); // Συνάρτηση που παίρνει το όνομα και το επώνυμο με μικρά γράμματα για την δημιουργία του δεύτερου password.
    
       }

    public static void ValidateName(String firstname,String lastname) // Δημιουργία username.
    
       {
           
        Random randnumbers = new Random(); // Random για την αναπαραγωγή των τυχαίων αριθμών.
       
       if (firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+")) // Μία if όπου πρέπει το όνομα και το επώνυμο να είναι μόνο χαρακτήρες.
       
       {
           
       String firstnamecharacter = firstname.substring(0 , 1); // Παίρνουμε το πρώτο γράμμα από το όνομα.
 
       if(lastname.length()>=8) // Αν το μέγεθος του επωνύμου που δώσαμε είναι μεγαλύτερο ή ίσο του 8 μπαίνει στην if και εκτυπώνει το username με το πρώτο γραάμμα του ονόματος , τα 8 τελευταία γράμματα του επωνύμου , την κάτω παύλα και έναν τυχαίο αριθμό από το 0 μέχρι το 9.
           
       {
           
         int numbers = randnumbers.nextInt(10);   
        
      JOptionPane.showMessageDialog(null , "The username combination is -> " + firstnamecharacter + lastname.substring(lastname.length()-8, lastname.length()) + "_" + numbers);
         
       }
       
       if(lastname.length()<8) // Αν το μέγεθος του επωνύμου που δώσαμε είναι μικρότερο του 8 μπαίνει στην if και εκτυπώνει το username με το πρώτο γραάμμα του ονόματος , τα γράμματα του επωνύμου με μικρότερο από το μέγεθος 8 , την κάτω παύλα και αριθμούς από το 0 μέχρι το 9 με βάση πόσο μέγεθος έχει το username φτάνοντας το μέγεθος 11. 
       
       {
     
       String numberss = "0123456789";
 
       StringBuilder buildnumbers = new StringBuilder();

       Random random = new Random();
 
       for(int i = 0; i < 9-lastname.length(); i++) // Μία for που αναπαράγει τυχαίους αριθμούς από το 0 μέχρι το 9 με βάση το μέγεθος του επωνύμου που έδωσε ο χρήστης. Πχ αν ο χρήστης έδωσε επώνυμο με 5 μέγεθος τότε θα πρέπει να αναπαραχθούν 4 τυχαίοι αριθμοί από το 0 μέχρι το 9 για να φτάσουμε στο 11 μέγεθος που πρέπει να είναι το username.
    
       {
 
       int index = random.nextInt(numberss.length());     

       char num = numberss.charAt(index);

       buildnumbers.append(num);
      
       }

       String randomnumberss = buildnumbers.toString();
 
       JOptionPane.showMessageDialog(null , "The username combination is -> " + firstnamecharacter + lastname + "_" + randomnumberss);
          
       }

       }
         
       if (!firstname.matches("[a-zA-Z]+") || !lastname.matches("[a-zA-Z]+")) // Μία if όπου όταν το όνομα και το επώνυμο δεν είναι χαρακτήρες τότε ξανατρέχει την main μέχρι ο χρήστης να δώσει μόνο χαρακτήρες.
               
       {
               
       JOptionPane.showMessageDialog(null , "The first name and last name strings must be all characters , Try again ");
       main(null);
               
       }
       
       }

    public static void ValidatePassword1(String firstname, String lastname, String petsname)  // Δημιουργία πρώτου password.
    
       {
        
    if (firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+") && petsname.matches("[a-zA-Z]+")) // Μία if όπου πρέπει το όνομα και το επώνυμο και το όνομα κατοικιδίου να είναι μόνο χαρακτήρες.
       
       {
           
        Random random = new Random();
 
        int numbers = 2 + random.nextInt(4);  
        
        String first = firstname.substring(0, 1).toUpperCase();
        
        String firstnamee = firstname.substring(1 , numbers);                                   // Γενικά παίρνω σίγουρα το πρώτο και το τελευταίο γράμμα με κεφαλαία πάντα και με βάση την random αναπαράγωνται τυχαία κομμάτια από τις λέξεις του ονόματος , του επωνύμου και του κατοικιδίου.
  
        String lastnamee = lastname.substring(numbers, lastname.length()-1);
       
        String petsnamee = petsname.substring(numbers , petsname.length()-1);
        
        String last = petsname.substring(petsname.length()-1,petsname.length()).toUpperCase();
        
        JOptionPane.showMessageDialog(null , "The first password combination is -> " + first + firstnamee + lastnamee + petsnamee + last);
             
       }
    
     if (!firstname.matches("[a-zA-Z]+") || !lastname.matches("[a-zA-Z]+") || !petsname.matches("[a-zA-Z]+")) // Μία if όπου όταν το όνομα και το επώνυμο και το όνομα του κατοικιδίου δεν είναι χαρακτήρες τότε ξανατρέχει την main μέχρι ο χρήστης να δώσει μόνο χαρακτήρες.
               
       {
        
     JOptionPane.showMessageDialog(null , "The first name , the last name and the pet's name strings must be all characters , Try again ");
     main(null);
        
       }
     
       }

    private static void ValidatePassword2(String firstname, String lastname) // Δημιουργία δεύτερου password.
    
       {
        
       if (firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+")) // Μία if όπου πρέπει το όνομα και το επώνυμο να είναι μόνο χαρακτήρες.
       
       {
       
       String firstnamecharacter = firstname.substring(0 , 1); // Παίρνουμε το πρώτο γράμμα από το όνομα.
       
       Random random = new Random();
    
       int numbers = random.nextInt(101);  // Αναπαραγωγή ενός αριθμού από το 0 μέχρι το 100.
             
       String replaced = null;
       String replacedlastname = null;
       
       replaced = firstnamecharacter.replace("a", "@").replace("s", "$").replace("l", "1").replace("o", "0"); // Αν το πρώτο γράμμα είναι κάποιο από αυτά που θέλουμε να αλλάξουν τα αλλάζει με το αντίστοιχο.
       
       replacedlastname = lastname.replace("a", "@").replace("s", "$").replace("l", "1").replace("o", "0"); // Αν το επώνυμο εμπεριέχει τα γράμματα που θέλουμε να αλλάξουν τότε αλλάζουν με τα αντίστοιχα.

       JOptionPane.showMessageDialog(null , "The second password combination is -> " + replaced + numbers + replacedlastname );
     
       }
       
       if (!firstname.matches("[a-zA-Z]+") || !lastname.matches("[a-zA-Z]+")) // Μία if όπου όταν το όνομα και το επώνυμο δεν είναι χαρακτήρες τότε ξανατρέχει την main μέχρι ο χρήστης να δώσει μόνο χαρακτήρες.
               
       {
               
       JOptionPane.showMessageDialog(null , "The first name and last name strings must be all characters , Try again ");
       main(null);
               
       }
        
       }
    
       }

