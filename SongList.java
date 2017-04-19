/**
 * 
 */
package MusicPreferenceVisualization;

import list.ListInterface;

/**
 * @author Jonathan Alexander (jma)
 * @version 4/18/2017
 *
 */
public class SongList implements ListInterface<Song> {
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
     * Adds a new entry to a specified position in the linked list
     * 
     * @param newPosition
     *            the index to add the new element at
     * @param newEntry
     *            the element to be added to the list
     */
    public void add(int newPosition, T newEntry) {

    }


    /**
     * Adds a new entry to the END of the linked list
     * 
     * @param newEntry
     *            the entry to be added to the list
     */
    public void add(T newEntry) {

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
     * Checks if the list contains a given element
     * 
     * @param anEntry
     *            the element to check the list for
     * @return true if the list contains the element false otherwise
     */
    public boolean contains(T anEntry) {

    }


    /**
     * Gets the entry at a given position
     * 
     * @param givenPosition
     *            the index of the element to be returned
     * @return the element at the given position
     */
    public T getEntry(int givenPosition) {

    }


    /**
     * Gets the number of elements currently in the linked list
     * 
     * @return the number of elements in the linked list
     */
    public int getLength() {

    }


    /**
     * Checks if the linked list is empty
     * 
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {

    }


    /**
     * Removes the element at a given index
     * 
     * @param givenPosition
     *            the index of the element to be replaced
     * @return the element that was removed
     */
    public T remove(int givenPosition) {

    }


    /**
     * replaces an element in the list at a given index
     * 
     * @param givenPosition
     *            the index of the element to be replaced
     * @param newEntry
     *            the entry to be placed in the given index
     * @return the element removed during the replacement
     */
    public T replace(int givenPosition, T newEntry) {

    }


    /**
     * turns the linked list into an array
     * 
     * @return Object[] representing the linked list
     */
    public Object[] toArray() {

    }


    /**
     * private inner class for the nodes used in the linked list
     * 
     * @author JAlexander
     *
     */
    private class Node {

    }
}
