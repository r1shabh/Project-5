/**
 * 
 */
package prj5;

import java.util.ArrayList;

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
}
