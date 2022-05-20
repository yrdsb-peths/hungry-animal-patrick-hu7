import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game over screen.
 * 
 * @author Patrick Hu 
 * @version May 20
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label gameOver = new Label("Game Over!", 100);
        addObject(gameOver, 300, 200);
        
        Label scoreLabel = new Label(MyWorld.score, 80);
        addObject(scoreLabel, 300, 280);
    }
}
