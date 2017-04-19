/**
 * 
 */
package MusicPreferenceVisualization;

/**
 * @author Jonathan Alexander (JMA)
 * @version 4/18/2017
 *
 */
public class Response {
    private HobbyEnum hobby;
    private MajorEnum major;
    private RegionEnum region;
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
    public Response(HobbyEnum hobby, MajorEnum major, RegionEnum region) {
        this.hobby = hobby;
        this.major = major;
        this.region = region;
    }
}
