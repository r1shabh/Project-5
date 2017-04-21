package prj5;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Jonathan Alexander (JMA)
 * @version 4/18/2017
 *
 */
public class Song {
    private String title;
    private String artist;
    private int year;
    private String genre;
    private ArrayList<Response> responses;


    /**
     * public constructor
     * 
     * @param title
     *            the title of the song
     * @param artist
     *            the artist of the song
     * @param year
     *            the year the song was published
     * @param genre
     *            the genre of the song
     */
    public Song(String title, String artist, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        responses = new ArrayList<Response>();
    }


    /**
     * Returns the title of the song
     * 
     * @return the title attribute
     */
    public String getTitle() {
        return title;
    }


    /**
     * Public getter for the artist of the song
     * 
     * @return the string artist attribute
     */
    public String getArtist() {
        return artist;
    }


    /**
     * public getter for the year the song was published
     * 
     * @return the integer year attribute
     */
    public int getYear() {
        return year;
    }


    /**
     * Public getter for the genre of the song
     * 
     * @return the string genre attribute
     */
    public String getGenre() {
        return genre;
    }


    /**
     * adds a response to the responses array list
     * 
     * @param r
     *            the response about this song to be added
     */
    public void addResponse(Response r) {
        responses.add(r);
    }
    
    /**
     * edits the response of whether someone likes a song
     * 
     * @param index
     *            index of response to be edited
     * @param liked
     *            the edit made to response
     */
    public void editResponse(int index, boolean liked) {
        responses.get(index).setLiked(liked);
    }

    /**
     * Tells how many responses there are for this song
     * 
     * @return the number of responses there are for this song
     */
    public int getNumberOfReponses() {
        return responses.size();
    }


    // ---------------------------------------------------------------------
    // COUNTERS FOR RESPONSES THAT HAVE HERD THE SONG FOR EACH OF THE CATEGORIES
    /**
     * Gets how many of the responses have heard the song with a certain hobby
     * 
     * @return the number of responses that heard the song
     * @param hobby
     *            of the heards being counted
     */
    public int getHeards(HobbyEnum hobby) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the heards
            Response current = iterator.next();
            if (current.hasHeard() && current.getHobby().equals(hobby)) {
                count++;
            }
        }
        return count;
    }


    /**
     * Gets how many of the responses have heard the song in a certain major
     * 
     * @return the number of responses that heard the song with the inputed
     *         major
     * @param major
     *            to get the heards for
     */
    public int getHeards(MajorEnum major) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the heards
            Response current = iterator.next();
            if (current.hasHeard() && current.getMajor().equals(major)) {
                count++;
            }
        }
        return count;
    }
    /**
     * Gets how many of the responses have heard the song in a certain region
     * 
     * @return the number of responses that heard the song with the inputed
     *         region
     * @param region
     *            to get the heards for
     */
    public int getHeards(RegionEnum region) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the heards
            Response current = iterator.next();
            if (current.hasHeard() && current.getRegion().equals(region)) {
                count++;
            }
        }
        return count;
    }


    // -------------------------------------------------------------------------------
    // COUNTERS FOR THE NUMBER OF RESPONSES THAT LIKE THE SONG FOR THE DIFFERENT
    // CATEGORIES
    /**
     * Gets how many of the responses have liked the song with a certain hobby
     * 
     * @return the number of responses that liked
     *            of the likes being counted
     */
    public int getLikes(HobbyEnum hobby) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the likes
            Response current = iterator.next();
            if (current.liked() && current.getHobby().equals(hobby)) {
                count++;
            }
        }
        return count;
    }


    /**
     * Gets how many of the responses have liked the song in a certain major
     * 
     * @return the number of responses that liked the song with the inputed
     *         major
     * @param major
     *            to get the liked for
     */
    public int getLikes(MajorEnum major) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the likes
            Response current = iterator.next();
            if (current.liked() && current.getMajor().equals(major)) {
                count++;
            }
        }
        return count;
    }
    /**
     * Gets how many of the responses have like the song in a certain region
     * 
     * @return the number of responses that liked the song with the inputed
     *         region
     * @param region
     *            to get the likes for
     */
    public int getLikes(RegionEnum region) {
        int count = 0;
        ListIterator<Response> iterator = responses.listIterator();
        while (iterator.hasNext()) { // Iterates through the responses arrayList
                                     // and counts the likes
            Response current = iterator.next();
            if (current.liked() && current.getRegion().equals(region)) {
                count++;
            }
        }
        return count;
    }



    // ---------------------------------------------------------------------
    /**
     * compares the titles of the songs for alphabetic order
     * 
     * @return negative, zero, positive as the argument is greater, equal, and
     *         less
     */
    public int compareTitle(Song s) {
        return title.compareToIgnoreCase(s.getTitle());
    }


    /**
     * compares the artists of the songs lexicographically
     * 
     * @return neg, zero, positive as the argument is greater, equal, and less
     */
    public int compareArtist(Song s) {
        return artist.compareToIgnoreCase(s.getArtist());
    }


    /**
     * compares the years the songs were released
     * 
     * @return negative, zero, positive as the argument year is greater than,
     *         equal to, and less than
     */
    public int compareYear(Song s) {
        return (year - s.getYear());
    }


    /**
     * Compares the genres of the songs using the ORDER in the Enum file
     * 
     * @return negative, zero, positive as the argument genre is before, same,
     *         after
     */
    public int compareGenre(Song s) {
        return genre.compareToIgnoreCase(s.getGenre());
    }


    /**
     * @return a string containing all the information about the song
     */
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(title);
        sBuilder.append(" by ");
        sBuilder.append(artist);
        sBuilder.append(" ");
        sBuilder.append(year);
        sBuilder.append(" ");
        sBuilder.append(genre);
        return sBuilder.toString();
    }
}
