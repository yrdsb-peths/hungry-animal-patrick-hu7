import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
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
        addObject(titleLabel, 300, 200);
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
