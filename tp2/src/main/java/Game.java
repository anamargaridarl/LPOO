import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

import static com.googlecode.lanterna.input.KeyType.EOF;


public class Game {

    Screen screen;
    Arena arena;
    TextGraphics graphics;


    public Game() throws IOException {

        arena = new Arena(50, 20);
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        screen = new TerminalScreen(terminal);
        graphics = screen.newTextGraphics();


        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary


    }

    public void run() throws IOException {

        draw();
        KeyStroke key;

        do {
            key = screen.readInput();
            processKey(key);
            draw();
        }
        while(key.getKeyType() != EOF);

    }

    private void draw() throws IOException {

        screen.clear();
        arena.draw(screen.newTextGraphics());
        screen.refresh();
    }


    private void processKey(KeyStroke key) throws IOException {
        System.out.println(key);

        switch(key.getKeyType())
        {
            case ArrowUp:
                arena.moveHero(arena.moveUp());
                break;
            case ArrowDown:
                arena.moveHero(arena.moveDown());
                break;
            case ArrowLeft:
                arena.moveHero(arena.moveLeft());
                break;
            case ArrowRight:
                arena.moveHero(arena.moveRight());
                break;
            case Character:
                if(key.getCharacter() == 'q') {
                    screen.close();
                }
        }

        arena.moveMonster();


        if(arena.verifyMonsterCollisions()) {
            System.out.print("Game Over!");
            screen.close();
        }

    }

}




