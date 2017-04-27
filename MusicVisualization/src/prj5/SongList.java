package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Jonathan Alexander (jma)
 * @version 4/18/2017
 *
 */
public class SongList {
    // The linked list used to hold the songs will be a double linked list with
    // references to the
    // head and tail node, no sentinel nodes will be used
    private Node head; // Reference to the fist node in our linked list
    private Node tail; // Reference to the last node in our linked list
    private int length; // The current number of elements in the linked list


    /**
     * public constructor sets up initial conditions
     */
    public SongList() {
        head = null; // By default head is null as there are no nodes
        tail = null; // By default tail is null as there are no nodes
        length = 0; // By default the length is 0 as there are no nodes
    }


    /**
     * Adds a new entry to the END of the linked list
     * 
     * @param newEntry
     *            the entry to be added to the list
     */
    public void add(Song newEntry) {

        if (isEmpty()) {
            Node newNode = new Node(null, null, newEntry);
            head = newNode;
            tail = newNode;
            length++;
        }
        else {
            Node newNode = new Node(tail, null, newEntry);
            tail.setNext(newNode);
            tail = newNode;
            length++;

        }
    }


    /**
     * Clears the Linked List by setting class variables to their instantiation
     * values
     * 
     */
    public void clear() {

        head = null; // By default head is null as there are no nodes
        tail = null; // By default tail is null as there are no nodes
        length = 0; // By default the length is 0 as there are no nodes
    }


    /**
     * Gets the entry at a given position
     * 
     * @param givenPosition
     *            the index of the element to be returned
     * @return the element at the given position
     */
    public Song getEntry(int givenPosition) {
        Node current = head;
        for (int i = 0; i < givenPosition; i++) {
            current = current.getNext();
        }
        return current.getData();
    }


    /**
     * Gets the number of elements currently in the linked list
     * 
     * @return the number of elements in the linked list
     */
    public int getLength() {
        return length;
    }


    /**
     * Checks if the linked list is empty
     * 
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return length == 0;
    }


    /**
     * turns the linked list into an array
     * 
     * @return Object[] representing the linked list
     */
    public Object[] toArray() {
        Object[] toReturn = new Object[length];
        Node current = head;
        for (int i = 0; i <= length - 1; i++) {
            toReturn[i] = current.getData();
            current = current.getNext();
        }
        return toReturn;
    }


    /**
     * Creates a new iterator for the songList and returns it
     * 
     * @return a new SongIterator
     */

    public SongIterator iterator() {
        return new SongIterator();
    }


    /**
     * sorts the song list by artist using selection sort
     * 
     */
    public void sortByArtist() {
        for (Node start = head; start != tail; start = start.getNext()) {
            Node largest = start;
            for (Node curr = start.getNext(); curr != null; curr = curr
                .getNext()) {
                if (largest.getData().compareArtist(curr.getData()) > 0) {
                    largest = curr;
                }
            }
            Song tmp = start.getData();
            start.setData(largest.getData());
            largest.setData(tmp);

        }
    }


    /**
     * sorts the song list by Genre using selection sort
     * 
     */
    public void sortByGenre() {
        for (Node start = head; start.getNext() != null; start = start
            .getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareGenre(curr.getData()) > 0) {
                    largest = curr;
                }
            }
            Song tmp = start.getData();
            start.setData(largest.getData());
            largest.setData(tmp);

        }
    }


    /**
     * sorts the song list by year using selection sort
     * 
     */
    public void sortByYear() {
        for (Node start = head; start.getNext() != null; start = start
            .getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareYear(curr.getData()) > 0) {
                    largest = curr;
                }
            }
            Song tmp = start.getData();
            start.setData(largest.getData());
            largest.setData(tmp);

        }
    }


    /**
     * sorts the song list by title using selection sort
     * 
     */
    public void sortByTitle() {
        for (Node start = head; start.getNext() != null; start = start
            .getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareTitle(curr.getData()) > 0) {
                    largest = curr;
                }
            }
            Song tmp = start.getData();
            start.setData(largest.getData());
            largest.setData(tmp);

        }
    }


    /**
     * reads in the responses pertaining to this list of songs
     * 
     * @param fileName
     *            the string of the file
     * @throws FileNotFoundException
     *             If the file passed cannot be founds
     */
    public void readResponses(String fileName) throws FileNotFoundException {
        File responseFile = new File(fileName);
        Scanner in = new Scanner(responseFile);
        in.useDelimiter(",");
        in.nextLine();
        in.nextLine();
        while (in.hasNextLine()) {
            in.next(); // skip the response number
            in.next(); // skip the response date
            HobbyEnum hobby;
            MajorEnum major; // The data we need for the response header
            RegionEnum region;
            switch (in.next()) { // match and set major
                case "Math or CMDA":
                    major = MajorEnum.MATH_OR_CMDA;
                    break;
                case "Other Engineering":
                    major = MajorEnum.OTHER_ENGINEERING;
                    break;
                case "Computer Science":
                    major = MajorEnum.COMPUTER_SCIENCE;
                    break;
                case "Other":
                    major = MajorEnum.OTHER;
                    break;
                default:
                    major = null;
                    break;

            }
            switch (in.next()) { // match and set region
                case "Northeast":
                    region = RegionEnum.NORTHEAST;
                    break;
                case "Southeast":
                    region = RegionEnum.SOUTHEAST;
                    break;
                case "Outside of United States":
                    region = RegionEnum.OUTSIDE;
                    break;
                case "United States (other than Southeast or Northwest)":
                    region = RegionEnum.REST;
                    break;
                default:
                    region = null;
                    break; // trying to pull null pointer by doing this to let
                           // us know the switch isn't working
            }
            switch (in.next()) { // match and set hobby
                case "sports":
                    hobby = HobbyEnum.SPORTS;
                    break;
                case "music":
                    hobby = HobbyEnum.MUSIC;
                    break;
                case "reading":
                    hobby = HobbyEnum.READ;
                    break;
                case "art":
                    hobby = HobbyEnum.ART;
                    break;
                default:
                    hobby = null;
                    break;
            }
// String[] heard = new String[length];
// for (int i = 0; i < length; i++) {
// String curr = in.next();
// heard[i] = curr;
// }
// String[] liked = new String[length];
// for (int i = 0; i < length; i++) {
// String curr = in.next();
// liked[i] = curr;
// }
            SongIterator iterator = iterator();
            for (int i = 0; i < length; i++) {
                Song currentSong = iterator.next();
                String heard = in.next();
                String liked = in.next();
                if (major == null || hobby == null || region == null || heard
                    .equals("") || liked.equals("")) { // Things that would
                    // disqualify this
                    // response from being
                    // added
                    break;
                }
                else {
                    Response toAdd = new Response(hobby, major, region, heard
                        .equals("Yes"), liked.equals("Yes"));
                    currentSong.addResponse(toAdd);

                }

            }

            in.nextLine();
        }
        in.close();
    }


    /**
     * private inner class for the nodes used in the linked list
     * 
     * @author Jonathan Alexander (jma)
     * @version 4/19/2017
     *
     */
    private class Node {
        private Song data;
        private Node next;
        private Node prev;


        /**
         * private constructor for a new Node
         * 
         * @param before
         *            the node preceding the new node
         * @param after
         *            the node succeeding the new node
         * @param song
         *            the song object stored in the node
         */
        private Node(Node before, Node after, Song song) {
            this.data = song;
            this.next = after;
            this.prev = before;
        }


        /**
         * Sets which node comes after this one
         * 
         * @param newNext
         *            the node object that will be after
         *            this node in the linked list
         */
        private void setNext(Node newNext) {
            next = newNext;
        }


        /**
         * Sets the node that comes before this one
         * 
         * @param newPrev
         *            the node object that will come
         *            before this node in the linked list
         */
        private void setPrevious(Node newPrev) {
            prev = newPrev;
        }


        /**
         * Gets the node after this node
         * 
         * @return the class attribute next
         *         which should be the node after this node in the linked list
         * 
         */
        private Node getNext() {
            return next;
        }


        /**
         * Returns the node before this node
         * 
         * @return the class attribute previous
         *         which should be the node
         *         before this node in the linked list
         */
        private Node getPrevious() {
            return prev;
        }


        /**
         * get the song object stored in this node
         * 
         * @return the song object held in the nodes
         *         class attribute
         */
        Song getData() {
            return data;
        }


        /**
         * sets the data in the nod
         * useful for sorting
         * 
         * @param d
         *            the song object that this node will now store
         */
        private void setData(Song d) {
            data = d;
        }


        /**
         * remove this node from the linked list
         * by linking the ones before and after it
         */
        private void remove() {
            prev.setNext(next);
            next.setPrevious(prev);
        }

    }


    /**
     * 
     * @author Jonathan Alexander (jma)
     * @version 4/26/2017
     *
     */
    protected class SongIterator {
        private Node next;


        /**
         * constructor for the iterator starts before the head node
         */
        private SongIterator() {
            next = head;
        }


        /**
         * Checks if there is a next node
         * 
         * @return true if there is, false otherwise
         */
        public boolean hasNext() {

            return next != null;
        }


        /**
         * Returns the next node and advances the iterator
         * 
         * @return the next node
         */
        public Song next() {

            if (!hasNext()) {
                throw new NoSuchElementException(
                    "Tried to call next() without a next node");
            }
            Node toReturn = next;
            next = next.getNext();
            return toReturn.getData();
        }


        /**
         * gets the node after the iterator without moving it
         * 
         * @return the node after the iterator which will be returned on the
         *         next next() call;
         */
        public Song getNext() {
            return next.getData();
        }

    }
}
