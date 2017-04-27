package prj5;

/**
 * tests methods in song class
 * @author nolant
 * @version 04.19.2017
 *
 */
public class SongTest extends student.TestCase {
    
    private Song song1;
    private Song song2;
    private Response response10;
    private Response response20;
    private Response response30;
    private Response response11;
    
    /**
     * sets up methods for testing
     */
    public void setUp() {
        song1 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
        song2 = new Song("Same Drugs", "Chance the Rapper", 2016, "Rap");
        response10 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
        response11 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
        response20 = new Response(HobbyEnum.ART, MajorEnum.MATH_OR_CMDA, RegionEnum.SOUTHEAST, false, false);
        response30 = new Response(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.REST, false, true);
        
    }
    
    /**
     * tests getting the title of the song
     */
    public void testGetTitle() {
        assertEquals("Boy named Sue", song1.getTitle());
    }
    
    /**
     * tests getting the artist of the song
     */
    public void testGetArtist() {
        assertEquals("Johnny Cash", song1.getArtist());
    }
    
    /**
     * tests getting the year of the song
     */
    public void testGetYear() {
        assertEquals(1969, song1.getYear());
    }
    
    /**
     * tests getting the genre of the song
     */
    public void testGetGenre() {
        assertEquals("Country", song1.getGenre());
    }
    
    /**
     * tests add response
     */
    public void testGetNumberOfResponses() {
        assertEquals(0, song1.getNumberOfReponses());
        song1.addResponse(response10);
        assertEquals(1, song1.getNumberOfReponses());
        song1.addResponse(response20);
        assertEquals(2, song1.getNumberOfReponses());
        song1.addResponse(response30);
        assertEquals(3, song1.getNumberOfReponses());
    }
    
    /**
     * tests the number of heards per major
     */
    public void testGetHeardsMajor() {
        song1.addResponse(response10);
        assertEquals(1, song1.getHeards(MajorEnum.COMPUTER_SCIENCE));
        song1.addResponse(response11);
        assertEquals(2, song1.getHeards(MajorEnum.COMPUTER_SCIENCE));
    }
    
    /**
     * tests the number of heards per hobby
     */
    public void testGetHeardsHobby() {
        song1.addResponse(response10);
        assertEquals(1, song1.getHeards(HobbyEnum.READ));
        song1.addResponse(response11);
        assertEquals(2, song1.getHeards(HobbyEnum.READ));
    }
    
    /**
     * tests the number of heards per region
     */
    public void testGetHeardsRegion() {
        song1.addResponse(response10);
        assertEquals(1, song1.getHeards(RegionEnum.NORTHEAST));
        song1.addResponse(response11);
        assertEquals(2, song1.getHeards(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests the number of likes per major
     */
    public void testGetLikesMajor() {
        song1.addResponse(response10);
        assertEquals(1, song1.getLikes(MajorEnum.COMPUTER_SCIENCE));
        song1.addResponse(response11);
        assertEquals(2, song1.getLikes(MajorEnum.COMPUTER_SCIENCE));
        song1.addResponse(response20);
        assertEquals(2, song1.getLikes(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests the number of likes per major
     */
    public void testGetLikesHobby() {
        song1.addResponse(response10);
        assertEquals(1, song1.getLikes(HobbyEnum.READ));
        song1.addResponse(response11);
        assertEquals(2, song1.getLikes(HobbyEnum.READ));
        song1.addResponse(response20);
        assertEquals(2, song1.getLikes(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests the number of likes per major
     */
    public void testGetLikesRegion() {
        song1.addResponse(response10);
        assertEquals(1, song1.getLikes(RegionEnum.NORTHEAST));
        song1.addResponse(response11);
        assertEquals(2, song1.getLikes(RegionEnum.NORTHEAST));
        song1.addResponse(response20);
        assertEquals(2, song1.getLikes(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests comparing song titles
     */
    public void testCompareTitle() {
        int num = song1.compareTitle(song2);
        assertTrue(num < 0);
    }
    
    /**
     * tests comparing song artists
     */
    public void testCompareArtist() {
        int num = song1.compareArtist(song2);
        assertTrue(num > 0);
    }
    
    /**
     * tests comparing song years
     */
    public void testCompareYear() {
        int num = song1.compareYear(song2);
        assertTrue(num < 0);
    }
    
    /**
     * tests comparing song genre
     */
    public void testCompareGenre() {
        int num = song1.compareArtist(song2);
        assertTrue(num > 0);
    }
    
    /**
     * tests the toString of the song
     */
    public void testToString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(song1.getTitle());
        sBuilder.append(" by ");
        sBuilder.append(song1.getArtist());
        sBuilder.append(" ");
        sBuilder.append(song1.getYear());
        sBuilder.append(" ");
        sBuilder.append(song1.getGenre());
        String result = sBuilder.toString();
        assertEquals(result, song1.toString());
    }
    
    /**
     * tests percent heard
     */
    public void testPercentHeard() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        assertEquals(100, song1.getPercentHeard(HobbyEnum.READ));
        assertEquals(100, song1.getPercentHeard(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(100, song1.getPercentHeard(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests percent liked
     */
    public void testPercentLiked() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        assertEquals(100, song1.getPercentLiked(HobbyEnum.READ));
        assertEquals(100, song1.getPercentLiked(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(100, song1.getPercentLiked(RegionEnum.NORTHEAST));
    }
}