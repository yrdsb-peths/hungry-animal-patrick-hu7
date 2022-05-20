import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main world.
 * 
 * @author Patrick Hu 
 * @version May 20
 */
public class MyWorld extends World
{   
    Label scoreLabel = new Label (0, 40);
    public static int score = 0;
    public int level = 1;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        resetStaticVariables();
        // init bread, dolphin, and label
        Dino d = new Dino();
        Bread b = new Bread();
        addObject(d, 300, 390);
        addObject(b, 300, 0);
        addObject(scoreLabel, 20, 20);        
    }
    
    public void spawnBread() {
        Bread bread = new Bread();
        bread.setSpeed(level); 
        int x = Greenfoot.getRandomNumber(600);
        addObject(bread, x, 0);
    }
    
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        if (score % 5 == 0) {
            level++;
        }
    }
    
    public void gameOver() {
        GameOverWorld gameOverWorld = new GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
    
    public void resetStaticVariables() {
        score = 0;
    }
}