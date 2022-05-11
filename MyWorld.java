import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Dolphin d = new Dolphin();
    Bread b = new Bread();
    Label scoreLabel = new Label (0, 40);
    public int score = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        // init bread, dolphin, and label
        addObject(d, 300, 390);
        addObject(b, 300, 0);
        addObject(scoreLabel, 20, 20);        
    }
    
    public void spawnBread() {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        addObject(bread, x, 0);
    }
    
    public void updateLabel() {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver() {
        Label gameOver = new Label("Game Over!", 100);
        addObject(gameOver, 300, 200);
    }
}