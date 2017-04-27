package prj5;

import java.io.FileNotFoundException;

/**
 * 
 * @author Jonatha Alexander (jma)
 * @version 4/25/2017
 *
 */
public class DataReaderTest extends student.TestCase {
    private DataReader reader;
    private final String songFile = "SongList2017S.csv";


    /**
     * set Up method to make the data reader
     * and set the file path for the songList
     */
    public void setUp() {
        reader = new DataReader(songFile);
    }


    /**
     * testing the dataReader through different
     * aspects of the SongList it should have created
     * 
     * @throws FileNotFoundException
     *             if the file passed in
     *             setUp cannot be found;
     */
    public void testReadSongs() throws FileNotFoundException {
        SongList output = reader.readSongs();
        // Checking that the dataReader class will in fact throw the exception
        Exception exception = null;
        try {
            DataReader throwing = new DataReader(
                "I should not be a real filename");
            throwing.readSongs();

        }
        catch (FileNotFoundException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(62, output.getLength());
        assertFalse(output.isEmpty());
        assertEquals(new Song("All You Need Is Love", "The Beatles", 1967,
            "pop rock"), output.getEntry(0));
        

    }
}
