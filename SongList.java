/**
 * 
 */
package MusicPreferenceVisualization;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import list.ListInterface;

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
        Node newLast = new Node(tail, null, newEntry);
        tail.setNext(newLast);
        length++;
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
        for (int i = 1; i < givenPosition; i++) {
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
        for (int i = 0; i < length - 1; i++) {
            toReturn[i] = current;
            current = current.getNext();
        }
        return toReturn;
    }


    /**
     * Creates a new iterator for the songList and returns ig
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
        Node headPrime = head; //The new head of the sorted list
        Node tailPrime; //The new tail of the sorted list
        int leftToSort = length; //The number of nodes unsorted - starts out as all of the nodes
        SongIterator iterator = iterator();
        while(iterator.hasNext()) {
            Node current = iterator.next();
            if(head.getData().compareArtist(current.getData().getArtist()) < 0) {
                headPrime = current
            }
        }
        for(int i = 1; i < leftToSort; i--) {
            
        }
    }


    /**
     * private inner class for the nodes used in the linked list
     * 
     * @author Jonathan Alexander (jma)
     * @version 4/19/2017
     *
     */
    private class Node {
        Song data;
        Node next;
        Node prev;


        private Node(Node before, Node after, Song song) {
            this.data = song;
            this.next = after;
            this.prev = before;
        }


        private void setNext(Node newNext) {
            next = newNext;
        }


        private void setPrevious(Node newPrev) {
            prev = newPrev;
        }


        private Node getNext() {
            return next;
        }


        private Node getPrevious() {
            return prev;
        }


        private Song getData() {
            return data;
        }


        private void remove() {
            prev.setNext(next);
            next.setPrevious(prev);
        }

    }


    private class SongIterator {
        Node next;


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
        private boolean hasNext() {
            return next == null;
        }


        /**
         * Returns the next node and advances the iterator
         * 
         * @return the next node
         */
        private Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException(
                    "Tried to call next() without a next node");
            }
            Node toReturn = next;
            next = next.getNext();
            return toReturn;
        }


        /**
         * gets the node after the iterator without moving it
         * 
         * @return the node after the iterator which will be returned on the
         *         next next() call;
         */
        private Node getNext() {
            return next;
        }

    }
}
