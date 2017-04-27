package prj5;

import java.io.FileNotFoundException;
import java.util.Arrays;
import prj5.SongList.SongIterator;

/**
 * tests the methods for song list
 * 
 * @author nolant
 * @version 04.19.2017
 */
public class SongListTest extends student.TestCase {

    private SongList sl1;
    private SongList sl2;
    private SongList emptySongList;
    private Song song1;
    private Song song2;
    private Song song3;


    /**
     * sets up methods for testing
     */
    public void setUp() {
        song1 = new Song("Boy named Sue", "Johnny Cash", 1969, "Country");
        song2 = new Song("Same Drugs", "Chance the Rapper", 2016, "Rap");
        song3 = new Song("All of the Lights", "Kanye West", 2010, "Rap");
        sl1 = new SongList();
        sl2 = new SongList();
        emptySongList = new SongList();
        sl1.add(song1);
        sl1.add(song2);
        sl2.add(song2);
        sl2.add(song1);
        sl2.add(song3);
    }


    /**
     * testing the add method
     */
    public void testAdd() {
        assertTrue(emptySongList.isEmpty());
        emptySongList.add(song3);
        assertFalse(emptySongList.isEmpty());
        assertEquals(song3, emptySongList.getEntry(0));
        assertEquals(1, emptySongList.getLength());
        emptySongList.add(song2);
        assertEquals(2, emptySongList.getLength());
        assertEquals(song2, emptySongList.getEntry(1));
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
     * testing the getLength method
     */
    public void testGetLength() {
        assertEquals(0, emptySongList.getLength());
        assertEquals(2, sl1.getLength());
        assertEquals(3, sl2.getLength());

    }


    /**
     * testing the is empty method for the two
     * possible cases
     */
    public void testIsEmpty() {
        assertTrue(emptySongList.isEmpty());
        assertFalse(sl1.isEmpty());
        assertFalse(sl2.isEmpty());

    }


    /**
     * testing the iterator() method
     */
    public void testIterator() {
        assertNotNull(sl1.iterator());
        SongIterator iter = sl1.iterator();
        assertEquals(song1, iter.next());
        assertEquals(song2, iter.next());

    }


    /**
     * testing the sort by artist method
     */
    public void testSortByArtist() {
        sl2.add(song3);
        sl2.sortByArtist();
        assertEquals(song2, sl2.getEntry(0));
        assertEquals(song1, sl2.getEntry(1));
        assertEquals(song3, sl2.getEntry(2));
        assertEquals(song3, sl2.getEntry(3));
        assertEquals(4, sl2.getLength());
        assertFalse(sl2.isEmpty());

    }


    /**
     * testing the sort by genre method
     */
    public void testSortByGenre() {
        sl2.sortByGenre();
        assertEquals(song1, sl2.getEntry(0));
        assertEquals(song2, sl2.getEntry(1));
        assertEquals(song3, sl2.getEntry(2));
        assertEquals(3, sl2.getLength());
    }


    /**
     * test the sort by year method
     */
    public void testSortByYear() {
        sl2.sortByYear();
        assertEquals(song1, sl2.getEntry(0));
        assertEquals(song3, sl2.getEntry(1));
        assertEquals(song2, sl2.getEntry(2));
        assertEquals(3, sl2.getLength());
    }


    /**
     * test the sort by title method
     */
    public void testSortByTitle() {
        sl2.sortByTitle();
        assertEquals(song3, sl2.getEntry(0));
        assertEquals(song1, sl2.getEntry(1));
        assertEquals(song2, sl2.getEntry(2));
        assertEquals(3, sl2.getLength());
    }


    /**
     * testing the file reading
     * of the response reader method in the
     * songList
     * For this to work the songList will need to
     * be correctly read in by the DataReader class
     * so watch that
     * 
     * @throws FileNotFoundException
     *             if the songList file cannot be found
     */
    public void testReadResponses() throws FileNotFoundException {
        SongList data = new DataReader("SongList2017S.csv").readSongs();
        
        String nonExistentFile =
            "There is no way I should be a file";
        Exception exception = null;
        try {
            data.readResponses(nonExistentFile); // Just to make sure the method
                                                 // correctly throws exception

        }
        catch (FileNotFoundException e) {
            exception = e;
        }
        assertNotNull(exception);
        data.readResponses("MusicSurveyData2017S.csv"); // The songs in the list
                                                        // should now be updated
                                                        // with responses
        assertEquals(226, data.getEntry(0).getNumberOfReponses());
        assertEquals(154, data.getEntry(0).getHeards());
        
        
        
    }

}
