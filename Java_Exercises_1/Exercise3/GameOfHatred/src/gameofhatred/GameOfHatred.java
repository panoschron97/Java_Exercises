
package gameofhatred;

import java.util.ArrayList; //ArrayList που θα έχουμε δύο λίστες των παροιμοιών και των ιστορικών φράσεων.
import java.util.Random; // μία Random που θα μας βγάζει τυχαίες λέξεις για να παίξουμε.
import java.util.Scanner;      //Scanner για να πληκτρολογούμε από το πληκτρολόγιο.         


public class GameOfHatred // κλάση GameOfHatred
{

    public static void main(String[] args) //κλάση main από την οποία καλώ με το αντικείμενο gameofhatred την κλάση GameOfHatred όπου ζητάει η άσκηση.
    {
       GameOfHatred gameofhatred;
       gameofhatred = new GameOfHatred();
    }
    
    
    private String name;
    private Scanner in;
    private ArrayList<String> words;               //δήλωση μεταβλητών.
    private int lifes;
    
    public GameOfHatred()
    {
        
        System.out.println(" \n Welcome to the Game Of Hatred. \n ");
        
        in=new Scanner(System.in);
        
        System.out.println(" Enter your name : "); // ο χρήστης πληκτρολογεί το ονομά του.
        
        name = in.nextLine();
        
        System.out.println(" \n Enter what category u want to play (1:historical quotes , 2:proverbs) : \n"); // επιλογή ιστορικών φράσεων ή παροιμοιών με switch case.
        
        int choiceforcategory = in.nextInt();
        
        switch(choiceforcategory)
        {
            case 1:
                words = new <String>ArrayList();
                words.add("comeandtakethem");
                words.add("eureka");
                words.add("venividivici");
            break;
            
            case 2:
                words = new <String>ArrayList();
                words.add("thegodandtheneighbor");
                words.add("twothirdscannotbe");
                words.add("makeguysseegood");
            break;
            
            default : System.out.println(" You must type 1 or 2 else try again. ");
            
            break;
        }
        
        System.out.println(" \n Enter (1: for easy(cheat) mode or 2: for hard mode) : \n"); // επιλογή δυσκολίας με βάση τις ζωές.
        
        int choiceforwords = in.nextInt();
        
        if(choiceforwords==2)
        {
            lifes=3;
              boolean running =true;
        Scanner k = new Scanner(System.in);
        String searchword;
        Random r = new Random();
        searchword = words.get(r.nextInt(words.size())); // επιλογή τυχαίας λέξης.
        char [] give =searchword.toCharArray(); // μετρά το μέγεθος της λέξης.
        char [] invis = new char[give.length]; // καταχωρεί το μέγεθος της λέξης στο invis.
        
        for(int i=0; i<give.length; i++)
        {
            
            invis[i]='*'; // for η οποία αντικαταστεί κάθε γράμμα της τυχαίας λέξης με *.
        }
        while(running)
        {
            boolean got = false;
            
            System.out.println(String.valueOf(invis)); // εμφανίζει την τυχαία λέξη με *.
            
            System.out.println(" Enter one letter of the word : "); // δώσε γράμμα .
            
            char l = k.nextLine().charAt(0);
            
            for(int i=0; i<give.length; i++)
            {
                
                if(l==give[i]){
                    invis[i]=l;   // for όπου όταν ο χρήστης δώσει γράμμα και υπάρχει τότε τα * αντικατιστώνται με το γράμμα/γράμματα στις θέσεις που υπάρχουν στην λέξη.
                    
                    got=true;
                }
                
                if(!String.valueOf(invis).contains("*")) // μία else if όπου όταν έχουν βρεθεί όλοι οι χαρακτήρες των΄λέξεων και δεν υπάρχει κανένα * τότε το παιχνίδι τελειώνει και ο χρήστης κέρδισε.
                {
                    
                    System.out.println(" \n The game finished and u won the game ");
                    System.exit(0);//end game.
                }
                
                
                
            }
            System.out.println(" lifes counting " +lifes); // εμφανίζει τις προσπάθειες που έχει ο χρήστης .
                
                if(!got) // αν το γράμμα που έδωσε ο χρήστης δεν υπάρχει τότε οι ζωές του μειώνονται κατά ένα.
                {
                    lifes--;
                }
                if(lifes==0) // αλλιώς αν ο χρήστης δεν έχει άλλες ζωές τότε το παιχνίδι τελειώνει και ο παίκτης χάνει.
                {
                    
                    System.out.println(" Game over ");
                    System.exit(0);//end game.
        }
    }
        }
        else if(choiceforwords==1)
        {
            lifes=3;
            
              boolean running =true;
        Scanner k = new Scanner(System.in);
        String searchword;
        Random r = new Random();
        searchword = words.get(r.nextInt(words.size())); // επιλογή τυχαίας λέξης.
        char [] give =searchword.toCharArray(); // μετρά το μέγεθος της λέξης.
        char [] invis = new char[give.length]; // καταχωρεί το μέγεθος της λέξης στο invis.
        
        for(int i=0; i<give.length; i++)
        {
            
            invis[i]='*'; // for η οποία αντικαταστεί κάθε γράμμα της τυχαίας λέξης με *.
        }
        while(running)
        {
            boolean got = false;
            
            System.out.println(String.valueOf(invis)); // εμφανίζει την τυχαία λέξη με *.
            System.out.println("\n In the secret word these 3 letters exist : \n");
            System.out.println(searchword.charAt(0));
            System.out.println(searchword.charAt(2));
            System.out.println(searchword.charAt(4));
            
            System.out.println(" Enter one letter of the word : "); // δώσε γράμμα .
            
            char l = k.nextLine().charAt(0);
            
            for(int i=0; i<give.length; i++)
            {
                
                if(l==give[i]){
                    invis[i]=l;   // for όπου όταν ο χρήστης δώσει γράμμα και υπάρχει τότε τα * αντικατιστώνται με το γράμμα/γράμματα στις θέσεις που υπάρχουν στην λέξη.
                    
                    got=true;
                }
                
                if(!String.valueOf(invis).contains("*")) // μία else if όπου όταν έχουν βρεθεί όλοι οι χαρακτήρες των΄λέξεων και δεν υπάρχει κανένα * τότε το παιχνίδι τελειώνει και ο χρήστης κέρδισε.
                {
                    
                    System.out.println(" \n The game finished and u won the game ");
                    System.exit(0);//end game.
                }
                
                
                
            }
            System.out.println(" lifes counting " +lifes); // εμφανίζει τις προσπάθειες που έχει ο χρήστης .
                
                if(!got) // αν το γράμμα που έδωσε ο χρήστης δεν υπάρχει τότε οι ζωές του μειώνονται κατά ένα.
                {
                    lifes--;
                }
                if(lifes==0) // αλλιώς αν ο χρήστης δεν έχει άλλες ζωές τότε το παιχνίδι τελειώνει και ο παίκτης χάνει.
                {
                    
                    System.out.println(" Game over ");
                    System.exit(0);//end game.
        }
    }
        }
        
      
    
    }
}
