package prj5;

import java.util.Observable;
import CS2114.Shape;
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
     * creats the bar graphs for each hobby
     * @return object array of songs with 4 bars for each hobby
     * 
     */
    public Object[][] graphHobby() {
        //2d array when first is song number followed by which enum
        Object[][] songReturn = new Object[songs.getLength()][4];
        for (int i = 0; i < songs.getLength(); i++) {
            int read = songs.getEntry(i).getPercentHeard(HobbyEnum.READ);
            int art = songs.getEntry(i).getPercentHeard(HobbyEnum.ART);
            int sports = songs.getEntry(i).getPercentHeard(HobbyEnum.SPORTS);
            int music = songs.getEntry(i).getPercentHeard(HobbyEnum.MUSIC);
            Shape readHeard = new Shape(read, 3);
            Shape artHeard = new Shape(art, 3);
            Shape sportsHeard = new Shape(sports, 3);
            Shape musicHeard = new Shape(music, 3);
            songReturn[i][1] = readHeard;
            songReturn[i][2] = artHeard;
            songReturn[i][3] = sportsHeard;
            songReturn[i][4] = musicHeard;
        }
        
        return songReturn;
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