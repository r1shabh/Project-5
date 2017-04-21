package prj5;

import java.util.Observable;
import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;
public class DisplayWindow {
    private static final int TOPLEFT;
    private static final int TOPMIDDLE;
    private static final int TOPRIGHT;
    private static final int BOTTOMLEFT;
    private static final int BOTTOMMIDDLE;
    private static final int BOTTOMRIGHT;
    private Window window;
    public DisplayWindow() {
        window = new Window("Music Preference Visualization");
        int width = window.getGraphPanelWidth();
        int aFourth = width/4;
        int height = window.getGraphPanelHeight();
        int aThird = height/3;
        TOPLEFT = aFourth;
        TOPMIDDLE = 2*aFourth;
        TOPRIGHT = 3*aFourth;
        BOTTOMLEFT = 
        BOTTOMMIDDLE = 
        BOTTOMRIGHT = 
        makePersistantButtons();


    }
    private void makePersistantButtons() {
        Button displayHobby = new Button("Hobby");
        displayHobby.onClick(this, "clickedHobby");
        Button displayMajor = new Button("Major");
        displayMajor.onClick(this, "clickedMajor");
        Button displayState = new Button("State");
        displayState.onClick(this, "clickedState");
        Button previous = new Button("Previous");
        previous.onClick(this, "clickedPrevious");
        Button sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedSortGenre");
        Button sortTitle = new Button("Sort by Title");
        sortTitle.onClick(this, "clickedSortTitle");
        Button sortYear = new Button("Sort by Year");
        sortYear.onClick(this, "clickedSortYear");
        Button sortArtist = new Button("Sort by Artist");
        sortArtist.onClick(this, "clickedSortArtist");
        Button next = new Button("Next");
        next.onClick(this, "clickedNext");
        window.addButton(displayHobby, WindowSide.SOUTH);
        window.addButton(displayMajor, WindowSide.SOUTH);
        window.addButton(displayState, WindowSide.SOUTH);
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(sortArtist, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
    }
    //Methods to change the data based on different response attributes
    /**
     * Method to change the screen when user clicks by hobby button
     */
    private void clickedHobby() {
        
    }
    private void clickedMajor() {
        
    }
    private void clickedState() {
        
    }
    //Methods to change the songs on screen based on various 
    //sorting orders
    public void clickedSortGenre() {
        
    }
    public void clickedSortArtist() {
        
    }
    public void clickedSortTitle() {
        
    }
    public void clickedSortYear() {
        
    }
    //Methods to change the songs on screen based on if the user clicks 
    //To sort a different way
    public void clickedNext() {
        
    }
    public void clickedPrevious() {
        
    }
}

