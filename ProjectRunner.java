package prj5;

import java.io.FileNotFoundException;

public class ProjectRunner {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader();
        reader.readSongFile("SongList2017S.csv");
        reader.readSurveyFile("MusicSurveyData2017S.csv");
        SongList songs = reader.getSongs();
        DisplayWindow display = new DisplayWindow(songs);

    }
}
