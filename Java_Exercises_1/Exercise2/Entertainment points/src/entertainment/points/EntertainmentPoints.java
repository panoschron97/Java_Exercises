
package entertainment.points;
import java.util.ArrayList;  // Δήλωση ArrayList επειδή θέλουμε λίστα στον κωδικά μας.
import java.util.Comparator; // Δήλωση Comparator λόγω 2 και 3 ερωτήματος.
import java.util.Scanner; // δήλωση Scanner επειδή ως χρήστες πρέπει να πληκτρολογήσουμε για το ερώτημα 4.


public class EntertainmentPoints { // κλάση EntertainmentPoints
static ArrayList<Register> loc = new ArrayList<Register>(); // λίστα για τα σημεία ψηχαγωγίας.
static List Lib = new List(); // λίστα Lib.
static Location userlocation; // τοποθεσία χρήστη.
static Scanner in = new Scanner(System.in);
private static int v; // μεταβλητή του 4 ερωτήματος όπου δίνουμε το μέγιστο score για να μας εμφανίσει το σημείο ψυχαγωγίας.

public static void main(String[] args) {  // η main μας συνάρτηση όπου μέσα της βρίσκεται το menu με την μέθοδο switch case.
userlocation = new Location();
boolean running = true;

while(running){
          
          System.out.println(" An Entertainment Application \n");
          
          System.out.println(" Enter 0 to add kinds and describes and scores and towns and locations(x,y). ");
          System.out.println(" Enter 1 to see the nearest location of the user and the nearest location/locations of sorted kind/kinds. ");
          System.out.println(" Enter 2 to show all places with all distances by kind(saved sorted). ");
          System.out.println(" Enter 3 to enter the best score to see the place , the describe , the town and the location. ");
          System.out.println(" Enter 4 to end the program. ");
          
          System.out.println("\n Please enter an option between 0-4. ");
          
          int choice=in.nextInt();
          switch(choice)
          {
              case 0:
                     add();
              break;
              case 1: 
                     displaynearestlocationofuserandbytype();
              break;
              case 2:
                     displaybytype();
              break;
              case 3:  for(Register Register : Lib.loc)
              {
                       System.out.println(Register.score.toString()+"\n");
              }
                     System.out.println(" Pleae enter the best score u see : ");
                     int v=new Scanner(System.in).nextInt();
                     displaybyscore(v);
              break;
              case 4: // end program.
                     running=false;
              break;
              default : System.out.println(" Invalid number , please try again \n");
          }
          
      }
    }
    public static void add() // συνάρτηση add την οποία την χρησιμοποιούμε για να παράξουμε τα σημεία ψυχαγωγίας.
    {
      
     Register q = new Register("movie " , " watching with popcorn " , 0 ,  "  samos " ,0  );
     
     Register v = new Register("football " , " watching with beers  " , 0 ,  " karlovasi " ,0 );
     
     Register t = new Register ( "volleyball "  ,  " watching with friends " , 0 ,  " bathi " , 0  );
     
     Register x = new Register( "basketball " , " karlovasi is winning " , 0 , " puthagorio " , 0);
     
     Lib.add(q);
     Lib.add(v);
     Lib.add(t);
     Lib.add(x);
      
    }

  

    public static int displaynearestlocationofuserandbytype() //συνάρτηση η οποία πληρή το πρώτο και το δεύτερο ερώτημα της άσκησης , η οποία μας εμφανίζει την τοποθεσία του χρήστη και τα κοντινά σημεία ψυχαγωγίας ανά είδος(kind) χρησιμοποιώντας τον Comperator.
    {
        int mini = 999999999;
        Location l = null ;
        ArrayList<Register> loc=new ArrayList<Register>();
         Lib.loc.addAll(loc);
         Lib.loc.sort(new Comparator<Register>() {
             @Override
             public int compare(Register o3, Register o4) 
             {
                return o3.kind().compareTo(o4.kind()); //σορτάρισμα των σημείων ψυχαγωγίας.
             }
      }); 
          for(Register Register : Lib.loc){
              
               if(userlocation.distance(Register.location)<mini){
                   mini=userlocation.distance(Register.location);
                      l=Register.location;   
                      System.out.println(Register.toString()); // εκτυπωνει τα κοντινά σημεία ψυχαγωγίας με βάση την τοποθεσία του χρήστη ανά είδος.
                   
           }
               
          }
          System.out.println( "\n nearest distance of the user is : \n" +l.distance(userlocation) ); // εκτυπώνει την τοποθεσία του χρήστη.
   return 0; }
    
    public static  void displaybytype() // συνάρτηση η οποία εκτυπώνει όλα τα σημεία ψυχαγωγίας χρησιμοποιώντας ton Comperator.
    {
         ArrayList<Register> loc=new ArrayList<Register>();
         Lib.loc.addAll(loc);
         Lib.loc.sort(new Comparator<Register>() {
             @Override
             public int compare(Register o1, Register o2) 
             {
                return o1.kind().compareTo(o2.kind()); //σορτάρισμα των σημείων ψυχαγωγίας.
             }
      }); 
         for (Register Register : Lib.loc  ) {
            System.out.println(Register.toString()); // εκτυπώνει τα σημεία ψυχαγωγίας ανά είδος.
        }
         
     }
       
    public static int displaybyscore(int v)// συνάρτηση για το 4 ερώτημα όπου συγκρίνει το score που δώσαμε από το πληκτρολόγιο με τα score που έχουν τα σημεία ψυχαγωγίας και εκτυπώνει το σημείο/τα σημεία ψυχαγωγιας με το score που δώσαμε(μέγιστο score πάντα).
    {
        
        for(Register Register : Lib.loc){
        if(Register.score.score()==v){
           System.out.println(Register.toString()); // εκτυπώνει το σημείο ψυχαγωγίας/τα σημεία ψυχαγωγίας με το μεγαλύτερο/τα μεγαλύτερα score που δώσαμε από το πληκτρολόγιο.
           
        }
    }
    return 0;
    }
        
    }
    

