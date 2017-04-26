package prj5;

public class ResponseTest extends student.TestCase{
    private Response testResponse;
    /**
     * Sets up the response object for testing
     */
    public void setUp() {
        testResponse = new Response(HobbyEnum.ART, MajorEnum.COMPUTER_SCIENCE, RegionEnum.NORTHEAST, true, true);
    }
    /**
     * tests the getMajor method
     */
    public void testGetMajor() {
    assertEquals(MajorEnum.COMPUTER_SCIENCE, testResponse.getMajor());
    }
    /**
     * tests the getHobby() method
     */
    public void testGetHobby() {
        assertEquals(HobbyEnum.ART, testResponse.getHobby());
    }
    /**
     * tests the getRegion() method
     */
    public void testGetRegion() {
        assertEquals(RegionEnum.NORTHEAST, testResponse.getRegion());
    }
    /**
     * tests the hasHeard() method
     */
    public void testHasHeard() {
        assertTrue(testResponse.hasHeard());
    }
    /**
     * tests the liked() method
     */
    public void testLiked() {
        assertTrue(testResponse.liked());
    }
}
