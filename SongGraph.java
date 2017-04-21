package prj5;

import java.util.Observable;
/**
 * the back end which creates the 
 * for the front end to display
 * @author nolant
 * @version 04.19.2017
 */
public class SongGraph extends Observable{
    
    private SongList songs;
    
    /**
     * constructor for the Song graph
     * @param list is the song list to use
     */
    public SongGraph(SongList list) {
        songs = list;
    }
    
    /**
     * finds the number of songs in the list
     * @return number of songs in list
     */
    public int songs() {
        return songs.getLength();
    }
    
    /**
     * graphs hobbies based on the enumerator suppled
     * @param READ is the enumerator
     */
    public void graphHobby(HobbyEnum hobby) {
        
    }   
    
    /**
     * graphs majors based on the enumerator suppled
     * @param COMPUTER_SCIENCE is the enumerator
     */
    public void graphMajor(MajorEnum major) {
        
    }
    
    
    /**
     * graphs the regions based on the enumerator suppled
     * @param NORTHEAST is the enumerator
     */
    public void graphRegion(RegionEnum region) {
        
    }           
    
}
