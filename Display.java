package prj5;

import java.awt.Color;
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
    private int page; //which nine songs are being shown
    
    private int displayNum;

    public Display(SongList toDisplay) {
        window = new Window("Music Visualization");
        window.setSize(600, 800);
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
        
        page = 0;
        songs.sortByArtist();
        displayNum = 0;
        displaySongs();
        
    }


    /**
     * private helper method to
     * do all the calculations to split the
     * screen into the correct number of parts
     */
    private void partitionWindow() {
        //three columns of songs with one column for the legend
        //each column is two eigths wide, we divide by 8 to get the center easy
        int horizontalIncrement = (window.getGraphPanelWidth() / 3);
        //Three rows of songs each row is two increments wide    
        int verticalIncrement = (window.getGraphPanelHeight() / 7);  
        int heightAdjust = 40;
        int widthAdjust = 100;
        topLeft = new Point(horizontalIncrement - widthAdjust, verticalIncrement - heightAdjust);
        topMiddle = new Point(2 * horizontalIncrement - widthAdjust, verticalIncrement - heightAdjust);
        topRight = new Point(3 * horizontalIncrement - widthAdjust, verticalIncrement - heightAdjust);
        
        midLeft = new Point(horizontalIncrement - widthAdjust, 3 * verticalIncrement - heightAdjust);
        midMiddle = new Point(2 * horizontalIncrement - widthAdjust, 3 * verticalIncrement - heightAdjust);
        midRight = new Point(3 * horizontalIncrement - widthAdjust, 3 * verticalIncrement - heightAdjust);
        
        
        botLeft = new Point(horizontalIncrement - widthAdjust, 5 * verticalIncrement - heightAdjust);
        botMiddle = new Point(2 * horizontalIncrement - widthAdjust, 5 * verticalIncrement - heightAdjust);
        botRight = new Point(3 * horizontalIncrement - widthAdjust, 5 * verticalIncrement - heightAdjust);
        
        //The legend box is the last two eigths of the screen
        //and goes from the middle of the screen to the bottom.
        //The point set for the legend is the middle of its box
        legend = new Point(4 * horizontalIncrement, 5 * verticalIncrement);
    }
    
    private void displaySongs() {
        window.removeAllShapes();
        int pageSongs = page * 9;
        currentlyShowing = new Song[9];
        for (int i = 0; i < currentlyShowing.length; i++) {
            if (pageSongs < songs.getLength()) {
                currentlyShowing[i] = songs.getEntry(pageSongs);
                pageSongs++;
            }
        }
        if (currentlyShowing[0] != null) {
            new songGraph(currentlyShowing[0], topLeft);
        }
        if (currentlyShowing[1] != null) {
            new songGraph(currentlyShowing[1], topMiddle);
        }
        if (currentlyShowing[2] != null) {
            new songGraph(currentlyShowing[2], topRight);
        }
        if (currentlyShowing[3] != null) {
            new songGraph(currentlyShowing[3], midLeft);
        }
        if (currentlyShowing[4] != null) {
            new songGraph(currentlyShowing[4], midMiddle);
        }
        
        if (currentlyShowing[5] != null) {
            new songGraph(currentlyShowing[5], midRight);
        }
        if (currentlyShowing[6] != null) {
            new songGraph(currentlyShowing[6], botLeft);
        }
        if (currentlyShowing[7] != null) {
            new songGraph(currentlyShowing[7], botMiddle);
        }
        if (currentlyShowing[8] != null) {
            new songGraph(currentlyShowing[8], botRight);
        }
        
        if (page == 0) {
            previous.disable();
        }
        else {
            previous.enable();
        }
        if (currentlyShowing[8] == null) {
            next.disable();;
        }
        else {
            next.enable();
        }
    }

    // All the onClick methods_______________________
    public void clickedPrevious(Button button) {
        if (page != 0) {
            page --;
            displaySongs();
        }
    }


    /**
     * Onclick method for the sort by artist button
     */
    public void clickedSortByArtist(Button button) {
        page = 0;
        songs.sortByArtist();
        displaySongs();
    }


    public void clickedSortByTitle(Button button) {
        page = 0;
        songs.sortByTitle();
        displaySongs();
    }


    public void clickedSortByDate(Button button) {
        page = 0;
        songs.sortByYear();
        displaySongs();
    }


    public void clickedSortByGenre(Button button) {
        page = 0;
        songs.sortByGenre();
        displaySongs();
    }


    public void clickedNext(Button button) {        
        page++;
        displaySongs();
    }


    public void clickedRepHobby(Button button) {
        page = 0;
        displayNum = 0;
        displaySongs();
    }


    public void clickedRepMajor(Button button) {
        page = 0;
        displayNum = 1;
        displaySongs();
    }


    public void clickedRepRegion(Button button) {
        page = 0;
        displayNum = 2;
        displaySongs();
    }


    public void clickedQuit(Button button) {
        System.exit(0);
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
        private Shape centerLine; 
        // that is there on every
        // graph for every son should be in every display method;
        private TextShape songInfo; // The info about the song (author and such)
                                    // should be in every single display method
        private TextShape songArtist;
        
        
        
        


        /**
         * constructor
         * 
         * @param
         * @param
         */
        private songGraph(Song song, Point pos) {
            this.song = song;
            position = pos;
            centerLine = new Shape((int)position.getX() + 15,
                (int)position.getY() + 27, 10, window.getGraphPanelHeight() / 6, Color.BLACK); // that center black bar
            songInfo = new TextShape((int)position.getX() - 20, (int)position
                .getY() - 10, this.song.getTitle(), Color.BLACK);
            songArtist = new TextShape((int)position.getX() - 20, (int)position
                .getY() + 10, "By:" + this.song.getArtist(), Color.BLACK);
            songInfo.setBackgroundColor(null);
            songArtist.setBackgroundColor(null);
            //By default have the songGraph draw representation by hobby
            //This happens on start or when a new sort is chosen
            
            switch (displayNum) {
                case 0: 
                    displayByHobby();
                    addHobbyChart();
                    break;
                case 1: 
                    displayByMajor();
                    addMajorChart();
                    break;
                case 2: 
                    displayByRegion();
                    addRegionChart();
                    break;
                default: 
                    displayByHobby();
                    break;
            }
        }

        private void addRegionChart() {
            int NE = song.getPercentHeard(RegionEnum.NORTHEAST);
            int out = song.getPercentHeard(RegionEnum.OUTSIDE);
            int rest = song.getPercentHeard(RegionEnum.REST);
            int SE = song.getPercentHeard(RegionEnum.SOUTHEAST);
            Shape NELine = new Shape(centerLine.getX() - NE, centerLine.getY() + 5, NE, 20, Color.BLUE);
            Shape outLine = new Shape(centerLine.getX() - out, centerLine.getY() + 95, out, 20, Color.YELLOW);
            Shape restLine = new Shape(centerLine.getX() - rest, centerLine.getY() + 65, rest, 20, Color.GREEN);
            Shape SELine = new Shape(centerLine.getX() - SE, centerLine.getY() + 35, SE, 20, Color.RED);
                
            
            window.addShape(NELine);
            window.addShape(SELine);
            window.addShape(restLine);
            window.addShape(outLine);
            
            int NEL = song.getPercentLiked(RegionEnum.NORTHEAST);
            int outL = song.getPercentLiked(RegionEnum.OUTSIDE);
            int restL = song.getPercentLiked(RegionEnum.REST);
            int SEL = song.getPercentLiked(RegionEnum.SOUTHEAST);
            Shape NeLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 5, NEL, 20, Color.BLUE);
            Shape outLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 95, outL, 20, Color.YELLOW);
            Shape restLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 65, restL, 20, Color.GREEN);
            Shape SELineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 35, SEL, 20, Color.RED);
                
            window.addShape(NeLineL);
            window.addShape(SELineL);
            window.addShape(restLineL);
            window.addShape(outLineL);
        }

        private void addMajorChart() {
            int CS = song.getPercentHeard(MajorEnum.COMPUTER_SCIENCE);
            int math = song.getPercentHeard(MajorEnum.MATH_OR_CMDA);
            int other = song.getPercentHeard(MajorEnum.OTHER);
            int engine = song.getPercentHeard(MajorEnum.OTHER_ENGINEERING);
            Shape CSLine = new Shape(centerLine.getX() - CS, centerLine.getY() + 5, CS, 20, Color.BLUE);
            Shape mathLine = new Shape(centerLine.getX() - math, centerLine.getY() + 65, math, 20, Color.GREEN);
            Shape otherLine = new Shape(centerLine.getX() - other, centerLine.getY() + 95, other, 20, Color.YELLOW);
            Shape engineLine = new Shape(centerLine.getX() - engine, centerLine.getY() + 35, engine, 20, Color.RED);
                
            
            window.addShape(CSLine);
            window.addShape(engineLine);
            window.addShape(mathLine);
            window.addShape(otherLine);
            
            int CSL = song.getPercentLiked(MajorEnum.COMPUTER_SCIENCE);
            int mathL = song.getPercentLiked(MajorEnum.MATH_OR_CMDA);
            int otherL = song.getPercentLiked(MajorEnum.OTHER);
            int engineL = song.getPercentLiked(MajorEnum.OTHER_ENGINEERING);
            Shape CSLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 5, CSL, 20, Color.BLUE);
            Shape mathLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 65, mathL, 20, Color.GREEN);
            Shape otherLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 95, otherL, 20, Color.YELLOW);
            Shape engineLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 35, engineL, 20, Color.RED);
                
            window.addShape(CSLineL);
            window.addShape(engineLineL);
            window.addShape(mathLineL);
            window.addShape(otherLineL);
            

        }

        /**
         * adds the chart for each song
         */
        private void addHobbyChart() {
            int art = song.getPercentHeard(HobbyEnum.ART);
            int music = song.getPercentHeard(HobbyEnum.MUSIC);
            int read = song.getPercentHeard(HobbyEnum.READ);
            int sports = song.getPercentHeard(HobbyEnum.SPORTS);
            Shape artLine = new Shape(centerLine.getX() - art, centerLine.getY() + 35, art, 20, Color.RED);
            Shape musicLine = new Shape(centerLine.getX() - music, centerLine.getY() + 95, music, 20, Color.YELLOW);
            Shape readLine = new Shape(centerLine.getX() - read, centerLine.getY() + 5, read, 20, Color.BLUE);
            Shape sportLine = new Shape(centerLine.getX() - sports, centerLine.getY() + 65, sports, 20, Color.GREEN);
                
            window.addShape(readLine);
            window.addShape(artLine);
            window.addShape(sportLine);
            window.addShape(musicLine);
            
            int artL = song.getPercentLiked(HobbyEnum.ART);
            int musicL = song.getPercentLiked(HobbyEnum.MUSIC);
            int readL = song.getPercentLiked(HobbyEnum.READ);
            int sportsL = song.getPercentLiked(HobbyEnum.SPORTS);
            Shape artLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 35, artL, 20, Color.RED);
            Shape musicLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 95, musicL, 20, Color.YELLOW);
            Shape readLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 5, readL, 20, Color.BLUE);
            Shape sportLineL = new Shape(centerLine.getX() + 10, centerLine.getY() + 65, sportsL, 20, Color.GREEN);
                
            window.addShape(readLineL);
            window.addShape(artLineL);
            window.addShape(sportLineL);
            window.addShape(musicLineL);

           
        }

        /**
         * Displays the appropriate bars for
         * the data by hobby
         */
        private void displayByHobby() { // Makes the stats and displays graph
                                        // for hobbies
            window.addShape(centerLine);
            window.addShape(songInfo);
            window.addShape(songArtist);
            addHobbyLegend();
            
            

        }


        private void displayByRegion() { // these display methods shouldn't
                                         // touch the center line
            window.addShape(centerLine);
            window.addShape(songInfo);
            window.addShape(songArtist);
            addRegionLegend();
        }


        private void displayByMajor() { // or the title and artist info
            window.addShape(centerLine);
            window.addShape(songInfo);
            window.addShape(songArtist);
            addMajorLegend();
        }
        
        private void addHobbyLegend() {
            Shape square = new Shape((int)legend.getX() - 135, (int)legend.getY() - 20, 120, 170);
            square.setForegroundColor(Color.BLACK);
            square.setBackgroundColor(null);
            TextShape hobby = new TextShape(square.getX() + 5, square.getY() + 5, "Hobby Legend");
            hobby.setBackgroundColor(null);
            TextShape read = new TextShape(hobby.getX(), square.getY() + 20, "Read", Color.BLUE);
            read.setBackgroundColor(null);
            TextShape art = new TextShape(read.getX(), read.getY() + 20, "Art", Color.RED);
            art.setBackgroundColor(null);
            TextShape sports = new TextShape(art.getX(), art.getY() + 20, "Sports", Color.GREEN);
            sports.setBackgroundColor(null);
            TextShape music = new TextShape(sports.getX(), sports.getY() + 20, "Music", Color.YELLOW);
            music.setBackgroundColor(null);
            TextShape song = new TextShape(music.getX(), music.getY() + 20, "Song Title", Color.BLACK);
            song.setBackgroundColor(null);
            TextShape heard = new TextShape(song.getX(), song.getY() + 30, "Heard", Color.BLACK);
            heard.setBackgroundColor(null);
            Shape line = new Shape(song.getX() + 50, song.getY() + 10, 5, 50, Color.BLACK);
            TextShape likes = new TextShape(song.getX() + 55, song.getY() + 30, "Likes", Color.BLACK);
            likes.setBackgroundColor(null);
            
            window.addShape(hobby);
            window.addShape(read);
            window.addShape(art);
            window.addShape(sports);
            window.addShape(music);
            window.addShape(song);
            window.addShape(heard);
            window.addShape(line);
            window.addShape(likes);
            window.addShape(square);
        }
        
        private void addRegionLegend() {
            Shape square = new Shape((int)legend.getX() - 135, (int)legend.getY() - 20, 120, 170);
            square.setForegroundColor(Color.BLACK);
            square.setBackgroundColor(null);
            TextShape region = new TextShape(square.getX() + 5, square.getY() + 5, "Region Legend");
            region.setBackgroundColor(null);
            TextShape NE = new TextShape(region.getX(), square.getY() + 20, "North East", Color.BLUE);
            NE.setBackgroundColor(null);
            TextShape SE = new TextShape(NE.getX(), NE.getY() + 20, "South East", Color.RED);
            SE.setBackgroundColor(null);
            TextShape rest = new TextShape(SE.getX(), SE.getY() + 20, "Rest of US", Color.GREEN);
            rest.setBackgroundColor(null);
            TextShape out = new TextShape(rest.getX(), rest.getY() + 20, "Out of US", Color.YELLOW);
            out.setBackgroundColor(null);
            TextShape song = new TextShape(out.getX(), out.getY() + 20, "Song Title", Color.BLACK);
            song.setBackgroundColor(null);
            TextShape heard = new TextShape(song.getX(), song.getY() + 30, "Heard", Color.BLACK);
            heard.setBackgroundColor(null);
            Shape line = new Shape(song.getX() + 50, song.getY() + 10, 5, 50, Color.BLACK);
            TextShape likes = new TextShape(song.getX() + 55, song.getY() + 30, "Likes", Color.BLACK);
            likes.setBackgroundColor(null);
            
            window.addShape(region);
            window.addShape(NE);
            window.addShape(SE);
            window.addShape(rest);
            window.addShape(out);
            window.addShape(song);
            window.addShape(heard);
            window.addShape(line);
            window.addShape(likes);
            window.addShape(square);
        }
        
        private void addMajorLegend() {
            Shape square = new Shape((int)legend.getX() - 135, (int)legend.getY() - 20, 135, 170);
            square.setForegroundColor(Color.BLACK);
            square.setBackgroundColor(null);
            TextShape major = new TextShape(square.getX() + 5, square.getY() + 5, "Major Legend");
            major.setBackgroundColor(null);
            TextShape CS = new TextShape(major.getX(), square.getY() + 20, "Computer Science", Color.BLUE);
            CS.setBackgroundColor(null);
            TextShape otherE = new TextShape(CS.getX(), CS.getY() + 20, "Other Engineering", Color.RED);
            otherE.setBackgroundColor(null);
            TextShape math = new TextShape(otherE.getX(), otherE.getY() + 20, "Math/CMDA", Color.GREEN);
            math.setBackgroundColor(null);
            TextShape other = new TextShape(math.getX(), math.getY() + 20, "Other", Color.YELLOW);
            other.setBackgroundColor(null);
            TextShape song = new TextShape(other.getX(), other.getY() + 20, "Song Title", Color.BLACK);
            song.setBackgroundColor(null);
            TextShape heard = new TextShape(song.getX(), song.getY() + 30, "Heard", Color.BLACK);
            heard.setBackgroundColor(null);
            Shape line = new Shape(song.getX() + 50, song.getY() + 10, 5, 50, Color.BLACK);
            TextShape likes = new TextShape(song.getX() + 55, song.getY() + 30, "Likes", Color.BLACK);
            likes.setBackgroundColor(null);
            
            window.addShape(major);
            window.addShape(CS);
            window.addShape(otherE);
            window.addShape(math);
            window.addShape(other);
            window.addShape(song);
            window.addShape(heard);
            window.addShape(line);
            window.addShape(likes);
            window.addShape(square);
        }
    }
}