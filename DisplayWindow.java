package prj5;

import java.util.Observable;
import java.util.Observer;
import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;
import CS2114.WindowSide;

public class DisplayWindow implements Observer {
    private static int TOPLEFT;
    private static int TOPMIDDLE;
    private static int TOPRIGHT;
    private static int BOTTOMLEFT;
    private static int BOTTOMMIDDLE;
    private static int BOTTOMRIGHT;
    private Window window;
    private SongGraph graph;
    private int pageNum;


    public DisplayWindow(SongList songs) {
        graph = new SongGraph(songs);
        graph.addObserver(this);
        window = new Window("Music Preference Visualization");
        int width = window.getGraphPanelWidth();
        int aFourth = width / 4;
        int height = window.getGraphPanelHeight();
        int aThird = height / 3;
        TOPLEFT = aFourth;
        TOPMIDDLE = 2 * aFourth;
        TOPRIGHT = 3 * aFourth;
        // BOTTOMLEFT = BOTTOMMIDDLE = BOTTOMRIGHT =
        makePersistantButtons();

    }


    private void makePersistantButtons() {
        Button displayHobby = new Button("Represent Hobby");
        displayHobby.onClick(this, "clickedHobby");
        Button displayMajor = new Button("Represent Major");
        displayMajor.onClick(this, "clickedMajor");
        Button displayState = new Button("Represent Region");
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
        Button quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");
        window.addButton(displayHobby, WindowSide.SOUTH);
        window.addButton(displayMajor, WindowSide.SOUTH);
        window.addButton(displayState, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(sortArtist, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
    }


    // Methods to change the data based on different response attributes
    /**
     * Method to change the screen when user clicks by hobby button
     * @param pageNum is the number of the page it is on to 
     * find what songs should be displayed
     */
    private void clickedHobby(int pageNum) {
        Shape[][] display = (Shape[][])graph.graphHobby();
        int startNum = (pageNum * 9) - 1;
        int endNum = startNum + 9;
        for (int i = startNum; i < endNum; i++) {
            for (int j = 0; j < display[0].length; i++) {
                Shape temp = (Shape)display[i][j];
                int width = 0;
                switch (i) {
                    case 0: case 3: case 6:
                        width = 1;
                        break;
                    case 1: case 4: case 7:
                        width = 2;
                        break;
                    case 2: case 5: case 8:
                        width = 3;
                        break;
                }
                int height =0;
                switch (i) {
                    case 1: case 2: case 3:
                        height = 1;
                        break;
                    case 4: case 5: case 6:
                        height = 2;
                        break;
                    case 7: case 8: case 9:
                        height = 3;
                        break;
                }
                int coloum = (window.getGraphPanelWidth() / 3) * width;
                int row = (window.getGraphPanelHeight() / 3) * height;
                temp.move(coloum, row);
                window.addShape(temp);
            }
        }
    }
    
    public void clickedQuit() {
        System.exit(0);
    }


    private void clickedMajor() {

    }


    private void clickedState() {

    }


    // Methods to change the songs on screen based on various
    // sorting orders
    public void clickedSortGenre() {

    }


    public void clickedSortArtist() {

    }


    public void clickedSortTitle() {

    }


    public void clickedSortYear() {

    }


    // Methods to change the songs on screen based on if the user clicks
    // To sort a different way
    public void clickedNext() {

    }


    public void clickedPrevious() {

    }


    @Override
    public void update(Observable arg0, Object arg1) {
        // TODO Auto-generated method stub

    }
}