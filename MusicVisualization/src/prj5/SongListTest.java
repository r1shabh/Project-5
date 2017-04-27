package prj5;

import java.util.Arrays;

/**
 * tests the methods for song list
 * @author nolant
 * @version 04.19.2017
 */
public class SongListTest extends student.TestCase{

    private SongList sl1;
    private SongList sl2;
    private Song song1;
    private Song song2;
    
    /**
     * sets up methods for testing
     */
    public void setUp() {
        song1 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
        song2 = new Song("Same Drugs", "Chance the Rapper", 2016, "Rap");
        sl1 = new SongList();
        sl2 = new SongList();
        sl1.add(song1);
        sl1.add(song2);
        sl2.add(song2);
        sl2.add(song1);
    }
    
    /**
     * tests the clear method
     */
    public void testClear() {
        assertEquals(2, sl1.getLength());
        sl1.clear();
        assertEquals(0, sl1.getLength());
        sl1.add(song1);
        assertEquals(1, sl1.getLength());
        sl1.add(song2);
        assertEquals(2, sl1.getLength());
        assertFalse(sl1.isEmpty());
        sl1.clear();
        assertEquals(0, sl1.getLength());
        assertTrue(sl1.isEmpty());
    }
    
    /**
     * tests the get entry method
     */
    public void testGetEntry() {
        assertEquals(song1, sl1.getEntry(0));
        assertEquals(song2, sl1.getEntry(1));
    }
    
    /**
     * tests the set entry method
     */
    public void testSetEntry() {
        sl1.setEntry(0, song2);
        assertEquals(song2, sl1.getEntry(0));
    }
    
    /**
     * tests the toArray method
     */
    public void testToArray() {
        Object[] song = new Object[2];
        song[0] = song1;
        song[1] = song2;
        Object[] sl1Array = sl1.toArray();
        
        assertTrue(Arrays.equals(song, sl1Array));
    }
    
    /**
     * tests the sort by artist
     */
    public void testSortByArtist() {
        Object[] sl1array = sl1.toArray();
        Object[] sl2array = sl2.toArray();
        assertFalse(Arrays.equals(sl1array, sl2array));
        sl1.sortByArtist();
        sl1array = sl1.toArray();
        sl2array = sl2.toArray();
        assertTrue(Arrays.equals(sl1array, sl2array));
    }

}
