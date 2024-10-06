
package entertainment.points;

import java.util.Random;


public class Score  { // κλάση score 
    private int score=0;
   
   
   public Score() { // παραγωγή τυχαίων τιμών απο το 1-10 .
      
       
           this.score=new Random().nextInt(11);  
            
    }

   
    @Override
    public String toString() // String toString που εκτυπώνει τα τυχαία score.
    {
        return " score : " + score;
    }
    public int score() // score που την χρησιμοποίησα για το τελευταίο ερώτημα.
    {
        return score;
    }

  

   
    
 
}
    

