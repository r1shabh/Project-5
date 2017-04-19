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
    public void graphHobby(HobbyEnum READ) {
        
    }
    
    /**
     * graphs hobbies based on the enumerator suppled
     * @param ART is the enumerator
     */
    public void graphHobby(HobbyEnum ART) {
        
    }
    
    /**
     * graphs hobbies based on the enumerator suppled
     * @param SPORTS is the enumerator
     */
    public void graphHobby(HobbyEnum SPORTS) {
        
    }
    
    /**
     * graphs hobbies based on the enumerator suppled
     * @param MUSIC is the enumerator
     */
    public void graphHobby(HobbyEnum MUSIC) {
        
    }
    
    /**
     * graphs majors based on the enumerator suppled
     * @param COMPUTER_SCIENCE is the enumerator
     */
    public void graphMajor(MajorEnum COMPUTER_SCIENCE) {
        
    }
    
    /**
     * graphs majors based on the enumerator suppled
     * @param OTHER_ENGINEERING is the enumerator
     */
    public void graphMajor(MajorEnum OTHER_ENGINEERING) {
        
    }
    
    
    /**
     * graphs majors based on the enumerator suppled
     * @param MATH_OR_CDMA is the enumerator
     */
    public void graphMajor(MajorEnum MATH_OR_CDMA) {
        
    }
    
    /**
     * graphs majors based on the enumerator suppled
     * @param OTHER is the enumerator
     */
    public void graphMajor(MajorEnum OTHER) {
        
    }
    
    /**
     * graphs the regions based on the enumerator suppled
     * @param NORTHEAST is the enumerator
     */
    public void graphRegion(RegionEnum NORTHEAST) {
        
    }
    
    /**
     * graphs the regions based on the enumerator suppled
     * @param SOUTHEAST is the enumerator
     */
    public void graphRegion(RegionEnum SOUTHEAST) {
        
    }
    
    /**
     * graphs the regions based on the enumerator suppled
     * @param REST is the enumerator
     */
    public void graphRegion(RegionEnum REST) {
        
    }
    
    /**
     * graphs the regions based on the enumerator suppled
     * @param OUTSIDE is the enumerator
     */
    public void graphRegion(RegionEnum OUTSIDE) {
        
    }
    
    /**
     * changes the song graph to a string
     * @return string version of the graph
     */
    public String toString() {
        
    }

}
