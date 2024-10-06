
package collection.of.rows;

import java.util.ArrayList; // Δήλωση ArrayList επειδή θέλουμε λίστα στον κωδικά μας.
import java.util.Scanner;  // δήλωση Scanner επειδή ως χρήστες πρέπει να πληκτρολογήσουμε.
import java.util.Comparator; // Δήλωση Comparator λόγω του 3 ερωτήματος.

public class CollectionOfRows //κλάση CollectionOfRows.
{

    static ArrayList<Channel> howmany = new ArrayList<Channel>(); // λίστα των καναλιών.
    static ArrayList<Rows> many = new ArrayList<Rows>(); // λίστα των σειρών.
    static Scanner in = new Scanner(System.in);
    static List z = new List(); // λίστα z.
    static List g = new List(); // λίστα g.
    
    public static void main(String[] args) // η main μας συνάρτηση όπου μέσα της βρίσκεται το menu με την μέθοδο switch case. 
    {
       
        boolean running=true;
        
        while(running)
        {
        System.out.println(" Collection of Rows application \n");
        
        System.out.println(" Enter 1 to add a  channel.  " );
        System.out.println(" Enter 2 to add a row to current channel. ");
        System.out.println(" Enter 3 to show all the channels and rows. ");
        System.out.println(" Enter 4 to enter a channel and see the row. ");
        System.out.println(" Enter 5 to end the program. ");
        
        
        System.out.println("\n Please enter an option between 1 - 5. \n");
        
        int choice=in.nextInt();
        
        
        switch(choice)
        {
            case 1:
                    addchannel();
            break;
            case 2:
                   addrow();
            break;
            case 3:
                   seira();
            break;
            case 4:
                   System.out.println(" Enter a channel : ");
                   Object k = new Scanner(System.in).nextLine();
                   givechannel(k);
            break;
            case 5: 
                   running=false;
            break;
            
            default : System.out.println("\n Invalid number , Please try again. \n");
        }
    }
       
    
}
     public static void addchannel() // συνάρτηση στην οποία κάνουμε add τα κανάλια.
     {
            String channel;
         
            System.out.println(" Enter a channel : ");
            channel = in.next();
            
            
            
            Channel a = new Channel(channel );
            z.addchannel(a);
            
         
     }
     public static void addrow() // συνάρτηση στην οποία κάνουμε add τις σειρές σε κάθε κανάλι.
     {
         String rows;
         System.out.println(" Enter a row :  ");
         rows = in.next();
         
         Rows a = new Rows(rows);
         z.howmany.get(z.howmany.size()-1).setRows(a);
         g.addRow(a);
         
         
     }
     
     public static void givechannel(Object rows) // συνάρτηση στην οποία δίνουμε το όνομα του καναλιού και μας εμφανίζει τις σειρές του.
     {
         for( Channel Channel : z.howmany )
         {
             if(Channel.getChannel().equals(rows))
             {
                 System.out.println(Channel.toString());      //εκτυπώνει το κανάλι και τις σειρές του.
                 Channel.rows.Rows();
                
                  
             }
         }
     }
     public static void seira() //συνάρτηση η οποία εκτυπώνει όλες τις σειρές και τα κανάλια με βάση το όνομα (αλφαβητικά).
     {
          ArrayList<Channel> j =new ArrayList<Channel>();
          ArrayList<Rows> l = new ArrayList<Rows>();
          g.many.addAll(l);
         z.howmany.addAll(j);
         z.howmany.sort(new Comparator<Channel>() 
         {
             @Override
             public int compare(Channel o1, Channel o2 ) 
             {
                return o1.getChannel().compareTo(o2.getChannel()); // σορτάρισμα των καναλιών.
             }
            
         }
         ); 
         
         g.many.sort((Rows o3, Rows o4) -> o3.getRow().compareTo(o4.getRow())); //σορτάρισμα των σειρών.
         
         for (Channel channel : z.howmany  ) 
         {
            System.out.println(channel.toString()); //εκτυπώνει τα κανάλια.
         }  
         for(Rows rows : g.many)
         {
             System.out.println(rows.toString()); // εκτυπώνει τις σειρές.
         }
     }
     
}
