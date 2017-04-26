package prj5;

/**
 * @author Jonathan Alexander (JMA)
 * @version 4/18/2017
 *
 */
public class Response {
    private HobbyEnum hobby;
    private MajorEnum major;
    private RegionEnum region;
    private boolean heard;
    private boolean liked;
    /**
     * public constructor
     * 
     * @param hobby
     *            the hobby of the person who made this response
     * @param major
     *            the major of the person who made this response
     * @param region
     *            the region the person who made this response is from
     */
    public Response(HobbyEnum hobby, MajorEnum major, RegionEnum region, boolean heard, boolean liked) {
        this.hobby = hobby;
        this.major = major;
        this.region = region;
        this.heard = heard;
        this.liked = liked;
    }
    /**
     * public get method for the hobby of this response
     * @return the hobby of the person who submitted this response
     */
    public HobbyEnum getHobby() {
        return hobby;
    }
    /**
     * public get method for the major of this response
     * @return the enum entry for the major of this response
     */
    public MajorEnum getMajor() {
        return major;
    }
    /**
     * public get method for the region this person is from
     * @return the region enum value for this reponse
     */
    public RegionEnum getRegion() {
        return region;
    }
    /**
     * gets if the reponder has heard the song
     * @return true if the responder has heard the song, false otherwise
     */
    public boolean hasHeard() {
        return heard;
    }
    /**
     * returns if the responder liked the song
     * @return true if they liked it, false otherwise
     */
    public boolean liked() {
        return liked;
    }
    
    /**
     * sets whether or not a person likes a song
     * 
     * @param liked
     *            whether or not person likes song
     */
    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
