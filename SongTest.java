package prj5;

/**
 * tests methods in song class
 * @author nolant
 * @version 04.19.2017
 *
 */
public class SongTest extends student.TestCase {
    
    private Song song1;
    
    /**
     * sets up methods for testing
     */
    public void setUp() {
        song1 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
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
}
