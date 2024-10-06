
package playlist;

import java.util.ArrayList;
import java.util.Iterator;


public class ListofSongs { // η κλάση που εμπεριέχει το αrraylist όλων των τραγουδιών.
    
    
    public ArrayList<SongList> Songs;
    
    public ListofSongs(){
        
        Songs = new ArrayList<SongList>();
    }
    
    public void addSong(SongList songlist){
        
        Songs.add(songlist);
    }
    
    public void RemoveSong(SongList songlist){
        
        Songs.remove(songlist);
    }
   
    public SongList SongName(String songtitle){
        
      SongList songname =null;
      
      Iterator<SongList> i = Songs.iterator();
      while(i.hasNext()){
          
          songname=i.next();
          if(songname.GetSongTitle().toLowerCase().contentEquals(songtitle.toLowerCase())){
              
              return songname;
          }
          
      }
        return null;
           
    }

    

    

    
}
