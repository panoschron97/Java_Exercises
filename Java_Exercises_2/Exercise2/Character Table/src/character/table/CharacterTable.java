
//Χρονόπουλος Παναγιώτης 3212015222

package character.table;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class CharacterTable {    // η κλάση μας
       
    public static void main(String[] args) { // η main η οποία καλεί όλες τις private static μεθόδους της άσκησης.
        
        char[] character = {'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
        
        // ο πίνακας μας από πάνω όπου έχει την αλφαβήτα με κεφαλάια λόγω του πρώτου ερωτήματος με (65-90) ascii τιμές όπου είναι η αλφάβητως με κεφαλαία. 
        
         fillTableRandomly(character);
         System.out.println();
         printTableH(character);
         System.out.println();
         printTableV(character);
         System.out.println();
         swapValues(character , 24 , 25);
         System.out.println();
         LocationChar(character , 'B');
         System.out.println();
         cloneTable(character);
         System.out.println();
         mergeTables(character , character);
         System.out.println();
          ConvertToString(character);
         System.out.println();
         ConvertToString1(character , 0 , 10);
         System.out.println();
         System.out.println("END ");
      
    }

    private static void fillTableRandomly(char [] character) {
       
        Random randomnumbers = new Random(); // random numbers.
        
        System.out.print("\nFirst question. \n\n");     
        
        for(char characters : character){ // μια for για τον πινακά μας στην main.
               
        int numbers = randomnumbers.nextInt((90-65)+1)+65; // random αριθμούς από 65-90

         characters = (char)numbers; // μετατροπή τυχαίων αριθμών σε ascii
                
        System.out.print(numbers + "  ->  ");
        
        System.out.println(characters + "  ASCII ");
        
        
        }
        
        
    }
    
    private static void printTableH(char[] character) {
        
        System.out.print("Second question. \n\n");  
        
       System.out.println(String.valueOf(character)); // οριζόντια εκτύπωση του πίνακα.
        
    }
    
    private static void printTableV(char[] character) {
        
        System.out.print("Third question. \n\n"); 
        
        for(int eachcharacter=0; eachcharacter< character.length; eachcharacter++){
            
        System.out.println(String.valueOf(character[eachcharacter])); //κάθετη εκτύπωση του πίνακα.
        
    }
        
        
    }

    private static void swapValues(char[] character , int a , int b) {
        
        System.out.print("Fourth question. \n\n"); 
        
       char charracter = character[a];
       
       character[a]=character[b];
       
       character[b]= charracter;
       
       System.out.println(Arrays.toString(character)); // εκτυπώνει τον πίνακα κάνωντας εναλλαγή το Y με τον Z αφού έχω θέσει την 24 και 25 θέση όπου βρίσκονται τα γράμματα αυτά.
       
        
    }

    private static int LocationChar(char[] character , char d) {
        
        
         System.out.print("Fifth question. \n\n"); 
        
        
            for(char characters : character){
                
            
             d = Array.getChar(character, 1);
        
             System.out.println(d); // εκτυπώνω το B που βρίσκεται στην θέση 1.
             
             break;
    
        
       
       
    }
        
        return d;
    
    
    

}

    private static char[] cloneTable(char[] character) {
        
        System.out.print("Sixth question. \n\n"); 
        
     char[] e = character.clone(); // κάνω κλόνο τον πίνακα και τον βάζω στον πίνακα e.
     
     System.out.println(Arrays.toString(e) + "\n"); // εκτυπώνω τον πίνακα e(κλόνος).
        
        return e;
        
    }

    private static char[] mergeTables(char[] character , char[] f) {
        
        System.out.print("Seventh question. \n\n"); 
        
         f = character.clone(); // κλονοποιώ τον πινακα character στον f.
         
         int h = character.length;
         
         int i = f.length;
         
         char[] j = new char[h + i]; // o πίνακας j όπου εμπεριέχει τον πίνακα character και τον f μαζί to ζητούμενο της συνάρτησης.
         
         System.arraycopy(character, 0, j, 0, h);
                                                     // συνχώνευση δύο πινάκων με την arraycopy. 
         System.arraycopy(f, 0, j, h, i);
         
         System.out.println(Arrays.toString(j)); // εκτύπωση  τελικού πίνακα ( δύο φορές η αλφάβητως σε έναν πίνακα).
        
        
        return j;
        
        
    }

    private static String ConvertToString(char[] character) {
        
        System.out.print("Eighth question. \n\n"); 
        
        for(char characters : character){
            
         String k = String.valueOf(character);
            
         System.out.print(k + "\n"); // ο πίνακας εκτυπωμένος σε string.
         
         break;
        }
        
        
        return null;
        
        
    }

    private static String ConvertToString1(char[] character, int k , int l) {
        
        System.out.print("Nineth question. \n\n"); 
        
        String n = String.valueOf(character);
        
        String m = "";
       
        m = n.substring(k,l); // χρησιμοποιώ την substring για να εκτυπώσω την αλφάβητο με παραμέτρους απο το 0-10 που είναι από το Α μέχρι το J.
        
        System.out.println(String.valueOf(m));
       
      
        
      
            
            
        return m;
        
        
    }
}

    
   
   
 
       
    
    


