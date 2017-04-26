package MusicPreferenceVisualization;

import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;

public class DisplayWindow {
    Window window;
    public DisplayWindow() {
        window = new Window("Music Preference Visualization");
        Button displayHobby = new Button("Hobby");
        Button displayMajor = new Button("Major");
        Button displayState = new Button("State");
        window.addButton(displayHobby, WindowSide.SOUTH);
        window.addButton(displayMajor, WindowSide.SOUTH);
        window.addButton(displayState, WindowSide.SOUTH);
        Button previous = new Button("Previous");
        Button sortGenre = new Button("Sort by Genre");
        Button sortTitle = new Button("Sort by Title");
        Button sortYear = new Button("Sort by Year");
        Button sortArtist = new Button("Sort by Artist");
        Button next = new Button("Next");
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(sortArtist, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);


    }
    
}
