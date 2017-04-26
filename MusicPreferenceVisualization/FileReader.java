/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author rishabh anand
 *
 */
public class FileReader {

    private SongList songs;


    /**
     * constructor for FileReader class
     */
    public FileReader() {
        songs = new SongList();
    }


    /**
     * returns the SongList created
     * 
     * @return SongList created by reading files
     */
    public SongList getSongs() {
        return this.songs;
    }


    /**
     * reads file containing all possible songs used
     * 
     * @param filename
     *            name of file containing songs
     * @throws FileNotFoundException
     *             if the filename is of a file that doesnt exist
     */
    public void readSongFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        input.nextLine();
        while (input.hasNext()) {
            String title = input.next();
            String artist = input.next();
            int year = input.nextInt();
            String genre = input.next();
            this.songs.add(new Song(title, artist, year, genre));
        }
        input.close();
    }


    /**
     * reads file of survey responses
     * 
     * @param filename
     *            name of file containing survey responses
     * @throws FileNotFoundException
     *             if the filename is of a file that doesnt exist
     */
    public void readSurveyFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        input.nextLine();
        while (input.hasNext()) {
            input.next();
            input.next();
            MajorEnum major = this.setMajor(input.next());
            RegionEnum region = this.setRegion(input.next());
            HobbyEnum hobby = this.setHobby(input.next());
            String hasHeard = input.next();
            for (int i = 0; i < songs.getLength(); i++) {
                boolean heard;
                if (hasHeard.equals("Yes")) {
                    heard = true;
                }
                else {
                    heard = false;
                }
                Response response = new Response(hobby, major, region, heard,
                    false);
                songs.getEntry(i).addResponse(response);
            }

            for (int x = 0; x < songs.getLength(); x++) {
                boolean liked;
                String isLiked = input.next();
                if (isLiked.equals("Yes")) {
                    liked = true;
                }
                else {
                    liked = false;
                }
                songs.getEntry(x).editResponse(x, liked);
            }
        }
        input.close();
    }


    private RegionEnum setRegion(String region) {
        switch (region) {
            case "Northeast":
                return RegionEnum.NORTHEAST;
            case "Southeast":
                return RegionEnum.SOUTHEAST;
            case "Outside of United States":
                return RegionEnum.OUTSIDE;
            default:
                return RegionEnum.REST;
        }
    }


    private HobbyEnum setHobby(String hobby) {
        switch (hobby) {
            case "sports":
                return HobbyEnum.SPORTS;
            case "music":
                return HobbyEnum.MUSIC;
            case "art":
                return HobbyEnum.ART;
            default:
                return HobbyEnum.READ;
        }
    }


    private MajorEnum setMajor(String major) {
        switch (major) {
            case "Computer Science":
                return MajorEnum.COMPUTER_SCIENCE;
            case "Math or CDMA":
                return MajorEnum.MATH_OR_CDMA;
            case "Other":
                return MajorEnum.OTHER;
            default:
                return MajorEnum.OTHER_ENGINEERING;
        }
    }

}
