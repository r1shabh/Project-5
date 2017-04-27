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
    private Song song3;
    private Response response10;
    private Response response20;
    private Response response30;
    private Response response11;
    private Response response31;
    private Response response32;
    private Response response33;
    private Response response34;
    private Response response35;
    private Response response36;
    private Response response37;
    private Response response38;
    private Response response39;
    private Response response40;
    private Response response41;
    private Response response42;
    private Response response43;
    private Response response44;
    private Response response45;
    private Response response46;
    private Response response47;
    private Response response48;
    private Response response49;
    private Response response50;
    private Response response51;
    private Response response52;
    private Response response53;
    private Response response54;
    private Response response55;
    private Response response56;
    private Response response57;
    private Response response58;
    private Response response59;
    private Response response60;
    private Response response61;
    private Response response62;
    private Response response63;
    private Response response64;
    private Response response65;
    private Response response66;
    private Response response67;
    private Response response68;
    private Response response69;
    private Response response70;
    private Response response71;
    private Response response72;
    private Response response73;
    private Response response74;
    private Response response75;
    private Response response76;
    
    
    /**
     * sets up methods for testing
     */
    public void setUp() {
        song1 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
        song2 = new Song("Same Drugs", "Chance the Rapper", 2016, "Rap");
        song3 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
        response10 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
        response11 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
        response20 = new Response(HobbyEnum.ART, MajorEnum.MATH_OR_CMDA, RegionEnum.SOUTHEAST, false, false);
        response30 = new Response(HobbyEnum.MUSIC, MajorEnum.OTHER, RegionEnum.REST, false, true);
        response31 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, false);
        response32 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, false, false);
        response33 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, false, true);
        response34 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
        response35 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.SOUTHEAST, true, false);
        response36 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.SOUTHEAST, false, false);
        response37 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.SOUTHEAST, false, true);
        response38 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.SOUTHEAST, true, true);
        response39 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, true, false);
        response40 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, false, false);
        response41 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, false, true);
        response42 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, true, true);
        response43 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, true, false);
        response44 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, false, false);
        response45 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, false, true);
        response46 = new Response(HobbyEnum.READ, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, true, true);
        response47 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.NORTHEAST, true, false);
        response48 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.NORTHEAST, false, false);
        response49 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.NORTHEAST, false, true);
        response50 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.NORTHEAST, true, true);
        response51 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.SOUTHEAST, true, false);
        response52 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.SOUTHEAST, false, false);
        response53 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.SOUTHEAST, false, true);
        response54 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.SOUTHEAST, true, true);
        response55 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.OUTSIDE, true, false);
        response56 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.OUTSIDE, false, false);
        response57 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.OUTSIDE, false, true);
        response58 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.OUTSIDE, true, true);
        response59 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.REST, true, false);
        response60 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.REST, false, false);
        response61 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.REST, false, true);
        response62 = new Response(HobbyEnum.READ, MajorEnum.OTHER, RegionEnum.REST, true, true);
        response63 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, true, false);
        response64 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, false, false);
        response65 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, false, true);
        response66 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.OUTSIDE, true, true);
        response67 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, true, false);
        response68 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, false, false);
        response69 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, false, true);
        response70 = new Response(HobbyEnum.SPORTS, MajorEnum.COMPUTER_SCIENCE, RegionEnum.REST, true, true);
        response71 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.NORTHEAST, true, false);
        response72 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.NORTHEAST, false, false);
        response73 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.NORTHEAST, false, true);
        response74 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.NORTHEAST, true, true);
        response75 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.SOUTHEAST, true, false);
        response76 = new Response(HobbyEnum.SPORTS, MajorEnum.OTHER, RegionEnum.SOUTHEAST, false, false);        
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
     * tests get heard
     */
    public void testGetHeard() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        song1.addResponse(response30);
        song1.addResponse(response31);
        song1.addResponse(response31);
        song1.addResponse(response32);
        song1.addResponse(response33);
        song1.addResponse(response34);
        song1.addResponse(response35);
        song1.addResponse(response36);
        song1.addResponse(response37);
        song1.addResponse(response38);
        song1.addResponse(response39);
        song1.addResponse(response40);
        song1.addResponse(response41);
        song1.addResponse(response42);
        song1.addResponse(response43);
        song1.addResponse(response44);
        song1.addResponse(response45);
        song1.addResponse(response46);
        song1.addResponse(response47);
        song1.addResponse(response48);
        song1.addResponse(response49);
        song1.addResponse(response50);
        song1.addResponse(response51);
        song1.addResponse(response52);
        song1.addResponse(response53);
        song1.addResponse(response54);
        song1.addResponse(response55);
        song1.addResponse(response56);
        song1.addResponse(response57);
        song1.addResponse(response58);
        song1.addResponse(response59);
        song1.addResponse(response60);
        song1.addResponse(response61);
        song1.addResponse(response62);
        song1.addResponse(response63);
        song1.addResponse(response64);
        song1.addResponse(response65);
        song1.addResponse(response66);
        song1.addResponse(response67);
        song1.addResponse(response68);
        song1.addResponse(response69);
        song1.addResponse(response70);
        song1.addResponse(response71);
        song1.addResponse(response72);
        song1.addResponse(response73);
        song1.addResponse(response74);
        song1.addResponse(response75);
        song1.addResponse(response76);
        assertEquals(26, song1.getHeards());
        assertEquals(9, song1.getHeards(RegionEnum.NORTHEAST));
        assertEquals(15, song1.getHeards(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(19, song1.getHeards(HobbyEnum.READ));
    }
    
    /**
     * tests get likes
     */
    public void testGetLiked() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        song1.addResponse(response30);
        song1.addResponse(response31);
        song1.addResponse(response31);
        song1.addResponse(response32);
        song1.addResponse(response33);
        song1.addResponse(response34);
        song1.addResponse(response35);
        song1.addResponse(response36);
        song1.addResponse(response37);
        song1.addResponse(response38);
        song1.addResponse(response39);
        song1.addResponse(response40);
        song1.addResponse(response41);
        song1.addResponse(response42);
        song1.addResponse(response43);
        song1.addResponse(response44);
        song1.addResponse(response45);
        song1.addResponse(response46);
        song1.addResponse(response47);
        song1.addResponse(response48);
        song1.addResponse(response49);
        song1.addResponse(response50);
        song1.addResponse(response51);
        song1.addResponse(response52);
        song1.addResponse(response53);
        song1.addResponse(response54);
        song1.addResponse(response55);
        song1.addResponse(response56);
        song1.addResponse(response57);
        song1.addResponse(response58);
        song1.addResponse(response59);
        song1.addResponse(response60);
        song1.addResponse(response61);
        song1.addResponse(response62);
        song1.addResponse(response63);
        song1.addResponse(response64);
        song1.addResponse(response65);
        song1.addResponse(response66);
        song1.addResponse(response67);
        song1.addResponse(response68);
        song1.addResponse(response69);
        song1.addResponse(response70);
        song1.addResponse(response71);
        song1.addResponse(response72);
        song1.addResponse(response73);
        song1.addResponse(response74);
        song1.addResponse(response75);
        song1.addResponse(response76);
        assertEquals(26, song1.getLikes());
        assertEquals(8, song1.getLikes(RegionEnum.NORTHEAST));
        assertEquals(14, song1.getLikes(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(18, song1.getLikes(HobbyEnum.READ));
    }
    
    /**
     * tests percent heard
     */
    public void testPercentHeard() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        song1.addResponse(response30);
        song1.addResponse(response31);
        song1.addResponse(response31);
        song1.addResponse(response32);
        song1.addResponse(response33);
        song1.addResponse(response34);
        song1.addResponse(response35);
        song1.addResponse(response36);
        song1.addResponse(response37);
        song1.addResponse(response38);
        song1.addResponse(response39);
        song1.addResponse(response40);
        song1.addResponse(response41);
        song1.addResponse(response42);
        song1.addResponse(response43);
        song1.addResponse(response44);
        song1.addResponse(response45);
        song1.addResponse(response46);
        song1.addResponse(response47);
        song1.addResponse(response48);
        song1.addResponse(response49);
        song1.addResponse(response50);
        song1.addResponse(response51);
        song1.addResponse(response52);
        song1.addResponse(response53);
        song1.addResponse(response54);
        song1.addResponse(response55);
        song1.addResponse(response56);
        song1.addResponse(response57);
        song1.addResponse(response58);
        song1.addResponse(response59);
        song1.addResponse(response60);
        song1.addResponse(response61);
        song1.addResponse(response62);
        song1.addResponse(response63);
        song1.addResponse(response64);
        song1.addResponse(response65);
        song1.addResponse(response66);
        song1.addResponse(response67);
        song1.addResponse(response68);
        song1.addResponse(response69);
        song1.addResponse(response70);
        song1.addResponse(response71);
        song1.addResponse(response72);
        song1.addResponse(response73);
        song1.addResponse(response74);
        song1.addResponse(response75);
        song1.addResponse(response76);

        assertEquals(54, song1.getPercentHeard(HobbyEnum.READ));
        assertEquals(55, song1.getPercentHeard(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(60, song1.getPercentHeard(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests percent liked
     */
    public void testPercentLiked() {
        song1.addResponse(response10);
        song1.addResponse(response11);
        song1.addResponse(response20);
        song1.addResponse(response30);
        song1.addResponse(response30);
        song1.addResponse(response31);
        song1.addResponse(response31);
        song1.addResponse(response32);
        song1.addResponse(response33);
        song1.addResponse(response34);
        song1.addResponse(response35);
        song1.addResponse(response36);
        song1.addResponse(response37);
        song1.addResponse(response38);
        song1.addResponse(response39);
        song1.addResponse(response40);
        song1.addResponse(response41);
        song1.addResponse(response42);
        song1.addResponse(response43);
        song1.addResponse(response44);
        song1.addResponse(response45);
        song1.addResponse(response46);
        song1.addResponse(response47);
        song1.addResponse(response48);
        song1.addResponse(response49);
        song1.addResponse(response50);
        song1.addResponse(response51);
        song1.addResponse(response52);
        song1.addResponse(response53);
        song1.addResponse(response54);
        song1.addResponse(response55);
        song1.addResponse(response56);
        song1.addResponse(response57);
        song1.addResponse(response58);
        song1.addResponse(response59);
        song1.addResponse(response60);
        song1.addResponse(response61);
        song1.addResponse(response62);
        song1.addResponse(response63);
        song1.addResponse(response64);
        song1.addResponse(response65);
        song1.addResponse(response66);
        song1.addResponse(response67);
        song1.addResponse(response68);
        song1.addResponse(response69);
        song1.addResponse(response70);
        song1.addResponse(response71);
        song1.addResponse(response72);
        song1.addResponse(response73);
        song1.addResponse(response74);
        song1.addResponse(response75);
        song1.addResponse(response76);
        assertEquals(51, song1.getPercentLiked(HobbyEnum.READ));
        assertEquals(51, song1.getPercentLiked(MajorEnum.COMPUTER_SCIENCE));
        assertEquals(53, song1.getPercentLiked(RegionEnum.NORTHEAST));
    }
    
    /**
     * tests the equals method
     */
    public void testEquals() {
        assertFalse(song1.equals(null));
        assertTrue(song1.equals(song1));
        assertFalse(song1.equals(song2));
        assertFalse(song1.equals("Test"));
        song2.addResponse(response20);
        assertFalse(song1.equals(song2));
        assertTrue(song1.equals(song3));
        
    }
}