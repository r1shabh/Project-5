package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Jonathan Alexander (jma)
 * @version 4/21/2017
 *
 */
public class DataReader {
    private File songFile;
    
    /**
     * constructor
     * @param songFileString the file containing the songs and their information
     * 
     */
    public DataReader(String songFileString) {
        this.songFile = new File(songFileString);
              
    }
    /**
     * Reads in the songs from the file and turns them into a songList
     * FOR REFERENCE - the reading of the surveys happens in the songList class
     * @return a SongList of the songs from the file
     * @throws FileNotFoundException 
     */
    public SongList readSongs() throws FileNotFoundException {
        SongList toReturn = new SongList();
        Scanner in = new Scanner(songFile);
        in.useDelimiter(",|\\r");
        in.nextLine();
        while(in.hasNextLine()) {
            String title = in.next();
            String artist = in.next();
            int year = in.nextInt();
            String genre = in.next();
            toReturn.add(new Song(title, artist, year, genre));
            //in.nextLine();
        }
        in.close();
        return toReturn;
        
    }
}
