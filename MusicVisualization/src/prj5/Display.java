package prj5;

import java.awt.Point;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

public class Display {
    Window window;
    SongList songs;
    private Button previous; // these buttons are declared in the order they
                             // should appear
    private Button sortByArtist; // Top to bottom left to right
    private Button sortByTitle;
    private Button sortByDate;
    private Button sortByGenre;
    private Button next;
    private Button repHobby;
    private Button repMajor;
    private Button repRegion;
    private Button quit;
    // Constants for the center of each of the six sub divisions of the screen
    private Point topLeft;
    private Point topMiddle;
    private Point topRight;
    private Point midLeft;
    private Point midMiddle;
    private Point midRight;
    private Point botLeft;
    private Point botMiddle;
    private Point botRight;
    private Point legend;
    private Song[] currentlyShowing; //The songs currently drawn, 9 at a time

    public Display(SongList toDisplay) {
        window = new Window("Music Visualization");
        songs = toDisplay;
        currentlyShowing = new Song[9];
        partitionWindow(); // Create all of the constants for drawing and such
        // Instantiate all of the buttons for the screen
        previous = new Button("Prev");
        sortByArtist = new Button("Sort by Artist Name");
        sortByTitle = new Button("Sort by Song Title");
        sortByDate = new Button("Sort by Release Year");
        sortByGenre = new Button("Sort By Genre");
        next = new Button("Next");
        repHobby = new Button("Represent Hobby");
        repMajor = new Button("Represent Major");
        repRegion = new Button("Represent Region");
        quit = new Button("Quit");
        // Set all of the onClick methods
        previous.onClick(this, "clickedPrevious");
        sortByArtist.onClick(this, "clickedSortByArtist");
        sortByTitle.onClick(this, "clickedSortByTitle");
        sortByDate.onClick(this, "clickedSortByDate");
        sortByGenre.onClick(this, "clickedSortByGenre");
        next.onClick(this, "clickedNext");
        repHobby.onClick(this, "clickedRepHobby");
        repMajor.onClick(this, "clickedRepMajor");
        repRegion.onClick(this, "clickedRepRegion");
        quit.onClick(this, "clickedQuit");
        // Draw all buttons to screen
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(sortByArtist, WindowSide.NORTH);
        window.addButton(sortByTitle, WindowSide.NORTH);
        window.addButton(sortByDate, WindowSide.NORTH);
        window.addButton(sortByGenre, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        window.addButton(repHobby, WindowSide.SOUTH);
        window.addButton(repMajor, WindowSide.SOUTH);
        window.addButton(repRegion, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);

    }


    /**
     * private helper method to
     * do all the calculations to split the
     * screen into the correct number of parts
     */
    private void partitionWindow() {
        //three columns of songs with one column for the legend
        //each column is two eigths wide, we divide by 8 to get the center easy
        int horizontalIncrement = (window.getGraphPanelWidth() / 8);
        //Three rows of songs each row is two increments wide    
        int verticalIncrement = (window.getGraphPanelHeight() / 6);    
        topLeft = new Point(horizontalIncrement, verticalIncrement);
        topMiddle = new Point(3 * horizontalIncrement, verticalIncrement);
        topRight = new Point(5 * horizontalIncrement, verticalIncrement);
        
        midLeft = new Point(horizontalIncrement, 3 * verticalIncrement);
        midMiddle = new Point(3 * horizontalIncrement, 3 * verticalIncrement);
        midRight = new Point(5 * horizontalIncrement, 3 * verticalIncrement);
        
        
        botLeft = new Point(horizontalIncrement, 5 * verticalIncrement);
        botMiddle = new Point(3 * horizontalIncrement, 5 * verticalIncrement);
        botRight = new Point(5 * horizontalIncrement, 5 * verticalIncrement);
        
        //The legend box is the last two eigths of the screen
        //and goes from the middle of the screen to the bottom.
        //The point set for the legend is the middle of its box
        legend = new Point(7 * horizontalIncrement, 5 * verticalIncrement);
    }


    // All the onClick methods_______________________
    public void clickedPrevious() {

    }


    /**
     * Onclick method for the sort by artist button
     */
    public void clickedSortByArtist(Display disp) {

    }


    public void clickedSortByTitle(Display disp) {

    }


    public void clickedSortByDate(Display disp) {

    }


    public void clickedSortByGenre(Display disp) {

    }


    public void clickedNext(Display disp) {

    }


    public void clickedRepHobby(Display disp) {

    }


    public void clickedRepMajor(Display disp) {

    }


    public void clickedRepRegion(Display disp) {

    }


    public void clickedQuit(Display disp) {

    }

    // ___________________________


    /**
     * private inner class for a songGraph
     * A song graph is that bar chart thing representing the song
     * the outter display class need only display a songGraph
     * instead of displaying each individual piece of a song graph
     * 
     * @author Jonathan Alexander (jma)
     * @version 4/24/2017
     *
     */
    private class songGraph {
        private Song song; // the song object this graph is for
        private Point position; // the position of this graph on the screen
        private final Shape centerLine = new Shape((int)position.getX() - 5,
            (int)position.getY(), 10, window.getGraphPanelHeight() / 6); // that
                                                                         // center
                                                                         // black
                                                                         // bar
        // that is there on every
        // graph for every son should be in every display method;
        private TextShape songInfo; // The info about the song (author and such)
                                    // should be in every single display method


        /**
         * constructor
         * 
         * @param
         * @param
         */
        private songGraph(Song song, Point pos) {
            this.song = song;
            position = pos;
            songInfo = new TextShape((int)position.getX() - 20, (int)position
                .getY() - 10, this.song.getTitle() + "\nBy:" + this.song
                    .getArtist());
            //By default have the songGraph draw representation by hobby
            //This happens on start or when a new sort is chosen
            displayByHobby();
        }


        /**
         * Displays the appropriate bars for
         * the data by hobby
         */
        private void displayByHobby() { // Makes the stats and displays graph
                                        // for hobbies
            window.addShape(centerLine);
            window.addShape(songInfo);
            

        }


        private void displayByRegion() { // these display methods shouldn't
                                         // touch the center line
            window.addShape(centerLine);
            window.addShape(songInfo);
        }


        private void displayByMajor() { // or the title and artist info
            window.addShape(centerLine);
            window.addShape(songInfo);
        }

    }

}
