
//Χρονόπουλος Παναγιώτης 3212015222

package playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayList {
    
    static Scanner song = new Scanner(System.in);
    static ArrayList<SongList> Songs = new ArrayList<SongList>();      // η arraylist μας για να αποθηκεύονται τα τραγούδια.
    static ListofSongs ArraySong = new ListofSongs();
    

    public static void main(String[] args) { // η main μας όπου τρέχει όλες τις συναρτήσεις με μία switch case.
       
        boolean up = true;
        
        while(up){
            
            
            System.out.print("\n A Song List application. \n");
            System.out.print("\n Press 1 - Insert Song. ");
            System.out.print("\n Press 2 - Show all songs in the list. Each song should display all the information stored. ");
            System.out.print("\n Press 3 - Show all artists on the song list. If the same artist is involved in multiple songs, he should appear only once. ");
            System.out.print("\n Press 4 - Show all albums included in the song list. ");
            System.out.print("\n Press 5 - Correct list items. It should be possible to correct any element of a song that is listed (eg album, artist, etc.). The song will be selected based on the title. ");
            System.out.print("\n Press 6 - Search and view all the songs in the list that are interpreted by a specific artist. ");
            System.out.print("\n Press 7 - Search and view all the songs in the list in a specific album. ");
            System.out.print("\n Press 8 - Delete a song from the list based on the title the user will enter. ");
            System.out.print("\n Press 9 - Exit the application. \n");
            
            System.out.print("\n Please press an option between 1-9  : ");
            
            
            
            int choose= song.nextInt();
            
            switch(choose){
                
                case 1:
                    InsertSong();
                    break;
                case 2:
                    DisplayAllSongs();
                    break;
                case 3:
                    DisplayAllArtists();
                    break;
                case 4:
                    DisplayAllAlbums();
                    break;
                case 5:
                    System.out.print("\n Give song name : ");
                     String b = new Scanner(System.in).nextLine();
                     CorrectListItems(b);
                    break;
                case 6:
                    System.out.print("\n Give artist name : ");
                     String a = new Scanner(System.in).nextLine();
                    DisplaySongsBySpecificArtist(a);
                    break;
                case 7:
                    System.out.print("\n Give album name : ");
                    String c = new Scanner(System.in).nextLine();
                    DisplaySongsBySpecificAlbum(c);
                    break;
                case 8:
                    System.out.print("\n Give Song name to delete : ");
                    String d = new Scanner(System.in).nextLine();
                    DeleteSongByName(d);
                    break;
                case 9:
                    up=false;
                    break;
                    
                    default : System.out.println("\n Invalid number , please try again \n");
            }
            
        }System.exit(0);
        
        
    }

    private static void DisplayAllSongs() {  // συνάρτηση που εκτυπώνει όλα τα τραγούδια.
        
       for (SongList songlist : ArraySong.Songs){
           
           System.out.print( "\n" + songlist.toString() + "\n");
       }
        
    }

    private static void InsertSong() { // συνάρτηση για την καταχώρηση τραγουδιού από τον χρήστη.
        
        String songtitle;
        String artist;
        float timeofsong;
        String album;
        
        System.out.print("\n Insert name of song : ");
        songtitle=song.next();
        
        System.out.print("\n Insert name of artist : ");
        artist=song.next();
        
        System.out.print("\n Insert duration of song : ");
        timeofsong=song.nextFloat();
        
        System.out.print("\n Insert name of album : ");
        album=song.next();
        
        SongList songlist = new SongList(songtitle , artist , timeofsong , album);
        
        ArraySong.addSong(songlist);
        
        System.out.print("\n Song added to playlist. \n");
        
    }

    private static void DisplayAllArtists() { // συνάρτηση που εκτυπώνει όλους τους καλλιτέχνες.
       
        
     for (SongList songlist : ArraySong.Songs){
           
           System.out.print(songlist.GetArtist());
       }
     
    }

    private static void DisplayAllAlbums() { // συνάρτηση που εκτυπώνει όλα τα album.
        
        for (SongList songlist : ArraySong.Songs){
           
           System.out.print(songlist.GetAlbum());
       }
       
    }

    private static void CorrectListItems(String b) { // συνάρτηση που αλλάζουμε τα δεδομένα σε ένα τραγούδι.
        
        
      for(SongList songlist : ArraySong.Songs){
          
          
          if(b.equals(songlist.SongTtile())){
              
             ArraySong.RemoveSong(songlist);
             
             
        System.out.print("\n Insert new name of song : ");
              String songtitle = song.next();
        
        System.out.print("\n Insert new name of artist : ");
              String artist = song.next();
        
        System.out.print("\n Insert new duration of song : ");
              float timeofsong = song.nextFloat();
        
        System.out.print("\n Insert new name of album : ");
              String album = song.next();
            
        SongList newsonglist = new SongList(songtitle , artist , timeofsong , album);
        
        ArraySong.addSong(newsonglist);
              
          }
          
      }
       
           
       }

    private static void DisplaySongsBySpecificArtist(String a) { // συνάρτηση που εκτυπώνει τα τραγούδια με βάση το όνομα του καλλιτέχνη που θα δώσει ο χρήστης.
        
           
      for(SongList songlist : ArraySong.Songs){
          
          if(a.equals(songlist.Artist())){
              
             System.out.print(songlist.toString());
            
              
          }
          
      }
       
    }

    private static void DisplaySongsBySpecificAlbum(String c) { // συνάρτηση που εκτυπώνει τα τραγούδια με βάση το όνομα του album που θα δώσει ο χρήστης.
        
         for(SongList songlist : ArraySong.Songs){
          
          if(c.equals(songlist.Album())){
              
             System.out.print(songlist.toString());
            
              
          }
          
      }
       
    }

    private static void DeleteSongByName(String d) { // διαγραφή τραγουδιού με βάση το όνομα του τραγουδιού που θα δώσει ο χρήστης.
        
        
        
        ArraySong.RemoveSong(ArraySong.SongName(d));
        
        System.out.print("\n Song deleted from playlist. \n");
        
        
        
    }

    
              
          }

      
          
        
    
    

