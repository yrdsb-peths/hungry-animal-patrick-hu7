import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen.
 * 
 * @author Patrick Hu
 * @version May 2022
 */
public class TitleScreenWorld extends World
{  
    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Hungry Elephant", 70);
        addObject(titleLabel, getWidth() / 2, getHeight() / 2);
        Label instructionsLabel = new Label("Press <space> to begin", 30);
        addObject(instructionsLabel, 300, 250);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
