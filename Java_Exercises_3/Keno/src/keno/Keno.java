
// 321/2015222 , Χρονόπουλος Παναγιώτης , Άσκηση 2.

package keno;

import java.util.ArrayList;
import java.util.Scanner;

public class Keno // κλάση κίνου.

{
    
  private ArrayList<Integer> winningnumbers; // Arraylist που αποθηκεύει τους νικηφόρους αριθμούς.
  private ArrayList<Integer>  rightchoices; // Arraylist που αποθηκεύει τον αριθμό των νικηφόρων αριθμών που μάντεψε ο παίχτης.
  private ArrayList<Integer> numbersplayerwon; // Arraylist που αποθηκεύει τους αριθμούς που μάντεψε ο παίχτης.
  private int winningtimes = 0; // ο αριθμός των τυχερών αριθμών που έπιασε από το δελτίο του ο παίχτης.
  Scanner read = new Scanner(System.in); 

    public static void main(String[] args) // κλάση main.
    
    {
   
     System.out.print("\nDeltio Player 1 with 2 numbers.\n "); 
     Keno player1 = new Keno();  // Δημιουργία αντικειμένου για τον πρώτο παίχτη που παίζει δελτίο με 2 αριθμούς.
     player1.StartKlirosi();
     player1.Displaynumbers();
     player1.CheckDeltio(2);
    
     System.out.print("Deltio Player 2 with 3 numbers.\n "); 
     Keno player2 = new Keno();  // Δημιουργία αντικειμένου για τον δεύτερο παίχτη που παίζει δελτίο με 3 αριθμούς.
     player2.StartKlirosi();
     player2.Displaynumbers();
     player2.CheckDeltio(3);
     
     System.out.print("Deltio Player 3 with 5 numbers.\n "); 
     Keno player3 = new Keno();  // Δημιουργία αντικειμένου για τον τρίτο παίχτης που παίζει δελτίο με 5 αριθμούς.
     player3.StartKlirosi();
     player3.Displaynumbers();
     player3.CheckDeltio(5);
     
     System.out.println();

    }

public void StartKlirosi() // Μέθοδος που παράγει τους τυχαίους αριθμούς της κλήρωσης. 
  
  {
      
   winningnumbers = new ArrayList<Integer>();
    
    while (winningnumbers.size() < 20) // Μέχρι 20 νικητήριους αριθμούς δίνει το κίνο.
      
    {
        
      int winningnumber = (int) (Math.random() * 80 + 1); // Random αριθμοί από το 1 μέχρι το 80.
      
      if (winningnumbers.indexOf(winningnumber) == -1) 
      
      {
          
        winningnumbers.add(winningnumber); // Αποθηκεύει σε arraylist τους νικηφόρους αριθμούς της κλήρωσης.
        
      }
      
    }

  }

  public void Displaynumbers() // Μέθοδος που εμφανίζει τους αριθμούς της κλήρωσης.
          
  {
    
    System.out.println("\nWinning Numbers : " + winningnumbers + "\n"); // Εκτύπωση νικηφόρων αριθμών.
   
  }
  
  public void CheckDeltio(int numbers) // Μέθοδος που ελέγχει και εμφανίζει το ποσοστό επιτυχίας του δελτίου.
  
  {
    
    rightchoices = new ArrayList<Integer>();
      
    numbersplayerwon = new ArrayList<Integer>();
    
    System.out.print("Player give the numbers of your bulletin : ");
    
    while (rightchoices.size() < numbers) // Μέχρι το όριου των αριθμών που παίζει ο παίχτης στο δελτίο του.
    
    {

      GetDeltio(); // Μπαίνει στην μέθοδο GetDeltio και δίνει τους αριθμούς που έπαιξε.

    }
    
    boolean win = false;
    
    for (int i = 0; i < rightchoices.size(); i++) // for που ελέγχει ποιούς και πόσους αριθμούς μάντεψε σωστά ο παίχτης.
    
    {
        
      if (winningnumbers.indexOf(rightchoices.get(i)) != -1) 
      
      {
          
        winningtimes++; // Μετράει τον αριθμό των τυχερών αριθμών που μάντεψε σωστά ο παίχτης.
        
        win = true;
        
        numbersplayerwon.add(rightchoices.get(i)); // Αποθηκεύει σε arraylist τους αριθμούς που πέτυχε ο παίχτης.
        
      }
      
    }

    if (win) // Αν win δηλαδή boolean -> true τότε μπαίνει μέσα στην if και εκτυπώνει τον αριθμό που πέτυχε ο παίχτης και ποιούς αριθμούς πέτυχε.
        
    {
        
      System.out.print("\nYou have guessed " + winningtimes + " out of " + numbers + " numbers.\n");
      
      System.out.print("\nYour winning guess numbers are : " + numbersplayerwon + "\n" );
    
      
    }
    
    if(numbers==winningtimes)
        
    {
        
     System.out.println("\nCongratulations , You guessed all the winning numbers of your bulletin that were included in the draw.\n");
        
    }
    
    if(winningtimes==0)
    
    {
        
      System.out.println("\nSorry , You didn't guess none of the winning numbers , Your bulletin doesn't win anything.\n");
      
    }
    
  }

  public void GetDeltio() // Μέθοδος πυο ο παίχτης δίνει τους αριθμούς που έπαιξε στο δελτίο του.
  
  {
 
    int choice = read.nextInt();

    if (choice < 1 || choice > 80 || rightchoices.indexOf(choice) != -1) 
    
    {
        
      System.out.println("\nPlease give the numbers of your bulletin between 1-80 and every number must be unique.");
      
      CheckDeltio(choice);
      
    }
    
    else 
    
    {
        
      rightchoices.add(choice); // Αποθηκεύει σε arraylist τις σωστές επιλογές του παίχτη.
      
    }
    
  }
    
}
