package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import prj5.SongList.SongIterator;

/**
 * used for intermediate submission to test back end
 * 
 * @author nolant
 * @version 04/19/2017
 *
 */
public class Input {

    /**
     * main method
     * 
     * @param args
     *            are the name of survey file
     *            and response file
     */
    public static void main(String[] args) throws FileNotFoundException {
        String songFile = "SongList2017S.csv";
        String surveyFile = "MusicSurveyData2017S.csv";
        if (args.length > 0) {
            if(args[0] != null) {
                surveyFile = args[0];
            }
            if(args[1] != null) {
                songFile = args[1];
            }
        }
        DataReader songFileReader = new DataReader(songFile);
        SongList list = songFileReader.readSongs();
        list.readResponses(surveyFile);
        new Display(list);
    }



}