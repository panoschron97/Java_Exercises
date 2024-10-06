
package playlist;

import java.util.ArrayList;


class SongList { // κλάση που εμπεριέχει τα στοιχεία κάθε τραγουδιού.
    
    private String songtitle;
    private String artist;
    private float timeofsong;
    private String album;
    static ArrayList<SongList> list = new ArrayList<SongList>();
    
    public SongList(){
        
       songtitle=null;
       artist=null;
       timeofsong=0;
       album=null;
    }
    
   SongList(String songtitle , String artist , float timeofsong , String album){
       
       this.songtitle=songtitle;
       this.artist=artist;
       this.timeofsong=timeofsong;
       this.album=album;
       
   }
   
   
   @Override
   public String toString(){
       
       return "\n Title of song : " + songtitle + "\n Artist : " + artist + "\n Time : " +timeofsong + " seconds " + "\n Album : " +album + "\n";
       
   }
   
   String GetSongTitle(){
       
       return songtitle;
   }
   
   String GetArtist(){
        int i=1;
       
       return  "\n Artist name " + " : " + artist +"\n";
   }
   
   String GetAlbum(){
       
       return  "\n Album name " + " : " + album +"\n";
       
   }
   
   Object SongTtile(){
       
       return songtitle;
   }
   
    Object Artist(){
       return artist;
   }
    
     Object Album(){
       return album;
   }
    
    
}
