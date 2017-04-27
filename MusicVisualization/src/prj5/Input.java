package prj5;

import java.io.FileNotFoundException;

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
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        String songFile = "SongList2017S.csv";
        String surveyFile = "MusicSurveyData2017S.csv";
       if(args.length == 2) {
           surveyFile = args[0];
           songFile = args[1];
           
       }
        DataReader songFileReader = new DataReader(songFile);
        SongList songs = songFileReader.readSongs();
        songs.readResponses(surveyFile);
        GUIMusicVisualization viewSongs = new GUIMusicVisualization(songs);
    }



}
