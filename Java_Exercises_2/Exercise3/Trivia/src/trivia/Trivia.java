
//Χρονόπουλος Παναγιώτης 3212015222

package trivia;

import java.util.Scanner;


public class Trivia {

   
    public static void main(String[] args) {
        
        System.out.print("\n A Trivia Game. \n");
       
        
        String question1 = "\n What color has a bannana?\n\n" + "(a)yellow\n\n" + "(b)green\n\n" + "(c)blue\n\n";     // οι ερωτήσεις του παιχνιδιού.
        String question2 = "\n What color has a gorilla?\n\n" + "(a)yellow\n\n" + "(b)green\n\n" + "(c)black\n\n";
        String question3 = "\n What color has an elephant?\n\n" + "(a)brown\n\n" + "(b)green\n\n" + "(c)grey\n\n";
        String question4 = "\n What color has an alien?\n\n" + "(a)black\n\n" + "(b)white\n\n" + "(c)red\n\n";
        String question5 = "\n What color has a kangaroo?\n\n" + "(a)black\n\n" + "(b)brown\n\n" + "(c)pink\n\n";
        String question6 = "\n What color has an orange?\n\n" + "(a)purple\n\n" + "(b)orange\n\n" + "(c)yellow\n\n";
        String question7 = "\n What color has an apple?\n\n" + "(a)red\n\n" + "(b)brown\n\n" + "(c)ocean\n\n";
        String question8 = "\n What color has an onion?\n\n" + "(a)yellow\n\n" + "(b)brown\n\n" + "(c)purple\n\n";
        String question9 = "\n When tsipras elected?\n\n" + "(a)2015\n\n" + "(b)2014\n\n" + "(c)2016\n\n";
        String question10 = "\n When mitsotakis elected?\n\n" + "(a)2017\n\n" + "(b)2018\n\n" + "(c)2019\n\n";
        
        Questions [] questions ={   //οι σωστές απαντήσεις των ερωτήσεων.
            new Questions(question1 , "a"),
            new Questions(question2 , "c"),
            new Questions(question3 , "c"),
            new Questions(question4 , "b"),
            new Questions(question5 , "b"),
            new Questions(question6 , "b"),
            new Questions(question7 , "a"),
            new Questions(question8 , "c"),
            new Questions(question9 , "a"),
            new Questions(question10 , "c")
        };
        question(questions);
    }

public static void question(Questions [] questions){ // η συνάρτηση που δίνουμε την απάντηση για κάθε ερώτηση .
    
    float money=0;
    Scanner input= new Scanner(System.in);
    
    for(int i=0; i<questions.length; i++){
        
        System.out.print(questions[i].act);
        System.out.print(" Give an answer please : ");
        String answer = input.nextLine();
        
        
        if(answer.equals(questions[i].answer)){ // αν είναι σωστή η απάντηση κερδίζουμε λεφτά και μας κάνει print τα λεφτά και ότι απαντήσαμε σωστά.
            
            money=(money + 10)*(i+1);
            
            System.out.print("\n Correct answer , Money : " + money + " . " + "\n");
            
        }
        
        if(!answer.equals(questions[i].answer)){ // αν δεν δώσουμε σωστή απάντηση τότε δεν κερδίζουμε λεφτά και μας κάνει spoil την σωστή απάντηση.
            
           System.out.print("\n Wrong answer , Money : " + money + " , The Correct answer was : " + questions[i].answer + " . " + "\n");
           
           
        }
    }
    System.out.println("\n You got " +money + " money" +  " from the " + questions.length + " questions you have answered. "); // σύνολικά πόσα λεφτά κερδίσαμε .
}
}
