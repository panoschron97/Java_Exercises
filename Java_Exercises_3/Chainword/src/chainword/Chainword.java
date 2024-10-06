
// 321/2015222 , Χρονόπουλος Παναγιώτης , Άσκηση 4.

package chainword;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chainword // Κλάση chainword.

{
    
    public static void main(String[] args) // Κλάση main.
    
    {
        
    Chainword start; // Δημιουργία αντικειμένου start και ξεκινάει το chain word game.
    start = new Chainword();
        
    }
    
    ArrayList <String> Words; // Arraylist όπου αποθηκεύει τις λέξεις που θα αναπαράγει κάθε γύρο τυχαία ο υπολογιστής.
    ArrayList <Integer> lastpc; // Arraylist όπου αποθηκεύει τους πόντους του υπολογιστή.
    ArrayList <Integer> lastuser; // Arraylist όπου αποθηκεύει τους πόντους του παίχτη.
    
    public Chainword()
     
    {
   
    System.out.println("\nWelcome to the chain word game.\n");
    
    Words = new <String> ArrayList();
    lastpc = new ArrayList<Integer>();
    lastuser = new ArrayList<Integer>();
    Words.add("ATTENTION");
    Words.add("NEIGHBORHOOD");
    Words.add("DISAPPEAR");               // λέξεις που έχει μέσα στο arraylist Words για να αναπαράγει ο υπολογιστής τυχαία με αρχικό γράμμα , ίδιο με αυτό του τελευταίου γράμματους της λέξης που έδωσε ο παίχτης.
    Words.add("REASONABLE");
    Words.add("EXPENSIVE");
    Words.add("EXTRAORDINARY");
    
    Scanner type = new Scanner(System.in);
    boolean running=true;
    String pcword;
    String firstcharacterofuserword;
    String lastcharacterofuserword = null;
    String lastcharacterofpcword;
    String userword;
    String QUIT;
    Random randomword = new Random();
   
    System.out.print("Hello player , With how many words you want to play? : ");
    
    int numberofwords = type.nextInt(); // Δίνω σας παίχτης με πόσες λέξεις θέλω να παίξω . Αν παίξω με 3 είναι 3 λέξεις του παίχτη και 3 του υπολογιστή.
 
    while(running)
    
    {
        
	if(lastcharacterofuserword == null) // Αν το τελευταίο γράμμα του παίχτη δεν υπάρχει , ο υπολογιστής διαλέγει μία τυχαία λέξη και ξεκινάμε.
                
        {
                    
	pcword = Words.get(randomword.nextInt(Words.size()));
                        
	}
                
	else // αλλιώς τόtε φτιάχνουμε μία arraylist η οποία βάζει μέσα τις λέξεις του υπολογιστή οι οποίες έχουν το πρώτο τους γράμμα ίδιο με αυτό του τελευταίου γράμματος που έδωσε ο παίχτης και κάνει την αναπαραγωγεί της λέξης.
                
        {   
                    
         ArrayList<String> temp_words = generatepcword(lastcharacterofuserword, Words);
         
         if(temp_words.isEmpty()) // Αν η λέξη δεν υπάρχει στην λίστα τότε ο υπολογιστής έχασε.
             
         {
        
            System.out.println("\nThe pc has lost the game.\n");
            System.exit(0);    
             
         }
  
         pcword =  temp_words.get(randomword.nextInt(temp_words.size()));
                     
        }
        
    System.out.println("\n" + "Pc : " + pcword + "\n");
    
    Words.remove(pcword); // διαγράφουμε κάθε φορα την λέξη που αναπαράγει τυχαία ο υπολογιστής από το arraylist γιατί θέλουμε την αναπαραγωγή της κάθε τυχαίας λέξης μόνο μία φορά.
    
    System.out.print("Player : ");
    
    userword = type.next().toUpperCase(); // Δίνω σαν παίχτης την λέξη όπου το πρώτο γράμμα της λέξης που θα γράψω πρέπει να είναι ίδιο με το τελευταίο γράμμα της λέξης που έδωσε ο υπολογιστής.
    
    firstcharacterofuserword=userword.substring(0,1);
    
    lastcharacterofuserword = userword.substring(userword.length()-1,userword.length());
    
    lastcharacterofpcword = pcword.substring(pcword.length()-1 , pcword.length()); 
         
    if(lastcharacterofpcword.equals(firstcharacterofuserword)) // If η οποία ελέγχει το τελευταίο γράμμα της λέξης του υπολογιστή αν είναι ίδιο με το πρώτο γράμμα της λέξης που έδωσε ο παίχτης.
        
    {
        
    //System.out.println("\nEqual.");
    numberofwords--; 
    Wordpoints(pcword , userword , numberofwords); // Συνάρτηση που μετράει τους πόντους των λέξεων του υπολογιστή και του παίχτη.
        
    }
    
    else // αλλιώς δεν είναι ίδιο το τελευταίο γράμμα της λέξης του υπολογιστή με το πρώτο γράμμα της λέξης που έδωσε ο παίχτης.
        
    {
        
    //System.out.println("\nNot Equal.");
    
    System.out.print("\nYou are not be able to continue , Please type QUIT : ");
    
    QUIT = type.next().toUpperCase();
    
    if(QUIT.equals("QUIT"))
        
    {
    
    System.out.println("\nThe player has lost the game.\n");    
    System.exit(0);
        
    }
    
    else
   
    {
        
    System.out.println("\nThe player has lost the game.\n");
    System.exit(0);   
     
    }
    
    }
    
    if(Words.isEmpty()) // Αν η arraylist είναι άδεια τυπώνει στην κονσόλα αντίστοιχο μήνυμα και τελειώνει το chain word game.
    
    {
        
    System.out.println("\nThere are no other words in the arraylist , exiting.\n");
    System.exit(0);
        
    }
          
    if(numberofwords==0) // Αν τελειώσει το παιχνίδι εκτυπώνει αντίστοιχο μήνυμα και τελειώνει το chain word game.
        
    {
      
    System.out.println("\nGame is over.\n");
    System.exit(0);
    
    }  
        
    }
     
}

     public ArrayList<String> generatepcword ( String lastcharacterofuserword, ArrayList<String> Words) // Συνάρτηση που επιστρέφει τυχαία λέξη που αναπαράγει ο υπολογιστής με βάση το τελευταίο γράμμα της λέξης που έδωσε ο παίχτης , έτσι ώστε η λέξη που θα δώσει ο υπολογιστής να έχει το πρώτο γράμμα τηνς λέξης ίδιο με το τελευταίο του παίχτη.
     
     {
         
		ArrayList<String> temp_words = new <String> ArrayList();
                
		for(int i =0; i < Words.size();  i++) 
                
                {
                    
		if(Words.get(i).substring(0,1).equals(lastcharacterofuserword))
                
                {
                    
		temp_words.add(Words.get(i));
                
		}
                
		}
              
		return temp_words;
                
     }

    public void Wordpoints(String pcword, String userword , int numberofwords) // Συνάρτηση όπου παίρνει κάθε φορά την λέξη του υπολογιστή και την λέξη του παίχτη και μετράει τους πόντους με βάση τα κριτήρια της εκφώνησης της άσκησης.
    
    {
        
      int numberofwordss = numberofwords;  
        
      int pointsforvowelspc=0;
      
      int pointsforconsonantspc=0;
      
      int totalpointsforpc=0;                          //Αρχικοποίηση μεταβλητών ορισμένες κατάλληλα για να μπορούμε να καταλάβουμε τι αριθμούς περιέχει η κάθε μία.
      
      int totalpointsforuser=0;
      
      int totalpc=0;
      
      int totaluser =0;
      
      int pointsforvowelsuser=0;
      
      int pointsforconsonantsuser=0;
           
      for(int i = 0; i < pcword.length(); i++) // for η οποία παίρνει κάθε γράμμα της λέξης που έδωσε ο υπολογιστής και ελέγχει αν είναι σύμφωνο ή φωνήεν και καταθέτει αντίστοιχο βαθμό 3 για φωνήεν ή 5 για σύμφωνο. 
      
      { 
          
      char ch = pcword.charAt(i); 
      
      if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch=='Y') 
          
      { 
          
         pointsforvowelspc=pointsforvowelspc+3; 
          
      } 
      
      else
      
      {
          
         pointsforconsonantspc=pointsforconsonantspc+5;
       
      }
      
      }
      
      totalpointsforpc = pointsforvowelspc+pointsforconsonantspc; // Συνολικοί πόντοι για κάθε λέξη του υπολογιστή.
      
      lastpc.add(totalpointsforpc); // Arraylist όπου βάζουμε τους πόντους της κάθε λέξης του υπολογιστή.
      
      for(int i = 0; i < lastpc.size(); i++) // for στην οποία προσθέτουμε όλους τους πόντους της κάθε λέξης που έδωσε ο υπολογιστής.
          
      {
      
        totalpc = totalpc + lastpc.get(i);
      
      }
      
      for(int i = 0; i < userword.length(); i++) // for η οποία παίρνει κάθε γράμμα της λέξης που έδωσε ο παίχτης και ελέγχει αν είναι σύμφωνο ή φωνήεν και καταθέτει αντίστοιχο βαθμό 3 για φωνήεν ή 5 για σύμφωνο.
      
      { 
          
      char ch = userword.charAt(i); 
      
      if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch=='Y') 
          
      { 
          
         pointsforvowelsuser=pointsforvowelsuser+3; 
          
      } 
      
      else 
      
      {
          
         pointsforconsonantsuser=pointsforconsonantsuser+5;     
           
      }
      
      }
      
       totalpointsforuser =pointsforvowelsuser + pointsforconsonantsuser; // Συνολικοί πόντοι για κάθε λέξη του παίχτη.
       
       lastuser.add(totalpointsforuser); // Arraylist όπου βάζουμε τους πόντους της κάθε λέξης του παίχτη.
            
       for(int i = 0; i < lastuser.size(); i++) // for στην οποία προσθέτουμε όλους τους πόντους της κάθε λέξης που έδωσε ο παίχτης.
          
       {
      
        totaluser = totaluser + lastuser.get(i);
      
       }
      
       if(numberofwordss==0) // Αν τελειώσει το παιχνίδι τότε μπαίνει μέσα στην if και ελέγχει ποιος κέρδισε από τους δύο ή αν έχει έρθει ισοπαλία και εκτυπώνει τον συνολικό αριθμό των πόντων του υπολογιστή και του παίχτη.
           
       {
           
       if(totaluser>totalpc)
       
       {
        
       System.out.println("\nThe player has won the game.");
           
       }
       
       if(totaluser==totalpc)
           
       {
       
       System.out.println("\nNoone has won the game , it's a draw.");
       
       }
       
      if(totaluser<totalpc)
       
       {
           
       System.out.println("\nThe pc has won the game.");
           
       }
      
       System.out.println("\nThe total points of pc are : " + totalpc);
               
       System.out.println("\nThe total points of player are : " + totaluser);
  
       }
    
    }
    
}
