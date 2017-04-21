package prj5;

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
        head = new Node();
        tail = new Node();
        //head = null; // By default head is null as there are no nodes
        //tail = null; // By default tail is null as there are no nodes
        length = 0; // By default the length is 0 as there are no nodes
    }


    /**
     * Adds a new entry to the END of the linked list
     * 
     * @param newEntry
     *            the entry to be added to the list
     */
    public void add(Song newEntry) {
        if (length == 0) {
            Node newNode = new Node(head, tail, newEntry);
            head.setNext(newNode);
            tail.setPrevious(newNode);
            length++;
        }
        else {
            Node end = new Node(tail.getPrevious(), tail, newEntry);
            tail.getPrevious().setNext(end);
            tail.setPrevious(end);
            //Node newLast = new Node(tail, null, newEntry);
            //tail.setNext(newLast);
            //tail = newLast;
            length++;
        }
    }


    /**
     * Clears the Linked List by setting class variables to their instantiation
     * values
     * 
     */
    public void clear() {
        head.setNext(null);
        tail.setPrevious(null);
        //head = null; // By default head is null as there are no nodes
        //tail = null; // By default tail is null as there are no nodes
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
        Node current = head.getNext();
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
        Node current = head.getNext();
        for (int i = 0; i <= length - 1; i++) {
            toReturn[i] = current.getData();
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
       for(Node start = head; start != tail; start = start.getNext()) {
           Node largest = start;
           for(Node curr = start; curr != null; curr = curr.getNext()) {
               if(largest.getData().compareArtist(curr.getData()) < 0) {
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
        for (Node start = head; start != tail; start = start.getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareGenre(curr.getData()) < 0) {
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
        for (Node start = head; start != tail; start = start.getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareYear(curr.getData()) < 0) {
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
        for (Node start = head; start != tail; start = start.getNext()) {
            Node largest = start;
            for (Node curr = start; curr != null; curr = curr.getNext()) {
                if (largest.getData().compareTitle(curr.getData()) < 0) {
                    largest = curr;
                }
            }
            Song tmp = start.getData();
            start.setData(largest.getData());
            largest.setData(tmp);

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
        
        private Node() {
            this(null, null, null);
        }
        
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
        
        private void setData(Song d) {
            data = d;
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